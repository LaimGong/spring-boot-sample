package com.gong.sample.elasticsearch.service;

import com.gong.sample.elasticsearch.domain.Demo;
import com.gong.sample.elasticsearch.repository.DemoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class DemoElasticService {

    @Resource
    private DemoRepository demoRepository;

    public Demo search(Long id) {
        return demoRepository.findById(id).get();
    }

    public void save(Demo demo) {
        Demo ret = demoRepository.save(demo);
        log.info("Save:{}", ret);
    }
}
