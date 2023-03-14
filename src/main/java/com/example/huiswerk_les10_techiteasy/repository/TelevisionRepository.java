package com.example.huiswerk_les10_techiteasy.repository;

import com.example.huiswerk_les10_techiteasy.module.Television;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TelevisionRepository extends JpaRepository<Television, Long> {

    @Transactional
    @Modifying

    @Query("delete from Television t where t.name = :name ")
    Void deleteByName(@Param("name") String name);
    Optional<Television> findByName(String name);


    Optional<Television> findById(int id);
}
