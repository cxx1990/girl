package com.cxx.repositoy;

import com.cxx.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by chenxiangxiang on 2017/3/14.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl>  findByAge(Integer age);

}
