package com.study.stuhostelsys.dao;

import com.study.stuhostelsys.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FlatInterface extends JpaRepository<Flat, Integer>, JpaSpecificationExecutor<Flat> {
    
}
