package com.gong.sample.jpa.repository;

import com.gong.sample.jpa.domain.Demo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {

    Demo findDemoByCode(String code);

    Page<Demo> findAll(Specification<Demo> demoSpecification, Pageable pageable);
}
