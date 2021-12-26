package com.gong.sample.jpa.service;

import com.gong.sample.jpa.domain.Demo;
import com.gong.sample.jpa.repository.DemoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    @Resource
    private DemoRepository demoRepository;

    public Demo queryDemo(String code) {
        return demoRepository.findDemoByCode(code);
    }

    public boolean submitDemo(Demo demo) {
        demoRepository.save(demo);
        return true;
    }

    /**
     * 分页查询
     *
     * @param demo
     * @return
     */
    public Page<Demo> queryDemoPage(Demo demo) {
        return demoRepository.findAll(SpecificationBuilder.build(demo), PageRequest.of(0, 10));
    }

    static class SpecificationBuilder {
        public static Specification<Demo> build(Demo demo) {
            Specification<Demo> queryCondition = (root, query, criteriaBuilder) -> {
                List<Predicate> predicateList = new ArrayList<>();
                if (demo.getCode() != null) {
                    predicateList.add(criteriaBuilder.like(root.get("code"), demo.getCode() + "%"));
                }
                if (demo.getId() != null) {
                    predicateList.add(criteriaBuilder.equal(root.get("id"), demo.getId()));
                }
                return criteriaBuilder.and(predicateList.toArray(new Predicate[predicateList.size()]));
            };
            return queryCondition;
        }
    }
}
