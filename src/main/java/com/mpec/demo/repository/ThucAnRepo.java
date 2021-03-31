package com.mpec.demo.repository;

import com.mpec.demo.entity.ThucAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface ThucAnRepo  extends JpaRepository<ThucAn, Long> {

    @Query("select t from ThucAn t")
    List<ThucAn> findAll();

    @Query("select t from ThucAn t where t.id=?1 ")
    ThucAn findById(Integer id);
}
