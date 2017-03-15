package com.cxx.service;

import com.cxx.domain.Girl;
import com.cxx.enums.ResultEnum;
import com.cxx.exception.GirlException;
import com.cxx.repositoy.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chenxiangxiang on 2017/3/14.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void InsertTwo(){
        Girl girl = new Girl();
        girl.setCap("5");
        girl.setAge(5);
        girlRepository.save(girl);

        Girl girl1 = new Girl();
        girl1.setCap("66666");
        girl1.setAge(6);
        girlRepository.save(girl1);

    }

    public void getAgeGirl(Integer  id) throws Exception{
        Girl girl = girlRepository.findOne(id);

        if(girl.getAge()<10){
            throw new GirlException(ResultEnum.SMALL_ERROR);
        }
        if(girl.getAge()>10&&girl.getAge()<18){
            throw new GirlException(ResultEnum.HIIGH_ERROR);
        }


    }

    /**
     * 单元测试
     *
     * @param id
     * @return
     */
    public Girl getFoundOne(Integer id){

        return  girlRepository.findOne(id);
    }

}
