package com.gong.sample.elasticsearch.repository;

import com.gong.sample.elasticsearch.domain.Demo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface DemoRepository extends ElasticsearchRepository<Demo, Long> {
}
