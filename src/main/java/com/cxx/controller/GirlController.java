package com.cxx.controller;

import com.cxx.domain.Girl;
import com.cxx.utils.ResultMessage;
import com.cxx.repositoy.GirlRepository;
import com.cxx.service.GirlService;
import com.cxx.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by chenxiangxiang on 2017/3/14.
 */
@RestController
public class GirlController {
    private  final static Logger logger = LoggerFactory.getLogger(GirlController.class);
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;


    
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){

       return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public ResultMessage<Girl> girlAdd(@Valid Girl girl,BindingResult bindingResult){
        logger.info("22222222222222");
        if(bindingResult.hasErrors()){
            return null;
           // return ResultUtil.error(-100,bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setCap(girl.getCap());
        girl.setAge(girl.getAge());

       return ResultUtil.success(girlRepository.save(girl));
    }


    @GetMapping("/girls/{id}")
    public Girl getgirls(@PathVariable("id") int id){
        return    girlRepository.findOne(id);
    }


    @PutMapping("/uapdateGirls")
    public Girl updatagirls(@RequestParam("id") Integer id,
                                     @RequestParam("cap") String cap,
                                      @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCap(cap);

        return girlRepository.save(girl);


    }

    @DeleteMapping("/deletegirl/{id}")
    public void deletegirls(@PathVariable("id") Integer id){

         girlRepository.delete(id);

    }

    @GetMapping("/girls1/{age}")
    public List<Girl> getgirls(@PathVariable("age") Integer age){
        return    girlRepository.findByAge(age);
    }


    @PostMapping("/addTwo")
    public void two(){
       girlService.InsertTwo();

    }

   @GetMapping(value = "/getAgeGirls/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
           girlService.getAgeGirl(id);
   }



}
