package com.cxx.service;

import com.cxx.domain.Girl;
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
}
