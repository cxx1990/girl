package com.cxx.repositoy.secondary;


import com.cxx.domain.secondary.Girls;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by chenxiangxiang on 2017/3/14.
 */
public interface GirlsRepository extends JpaRepository<Girls,Integer> {
    public List<Girls> findByAge(Integer age);
}
