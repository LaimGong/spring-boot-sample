package com.gong.sample.jpa;

import com.gong.sample.jpa.domain.Demo;
import com.gong.sample.jpa.repository.DemoRepository;
import com.gong.sample.jpa.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTest {

    @Resource
    private DemoService demoService;

    @Resource
    private DemoRepository demoRepository;

    @Test
    public void queryDemoTest() {
        Demo demo = demoService.queryDemo("c1");
        log.info("DemoTest, {}", demo);
        Demo qryDemo = new Demo();
        qryDemo.setCode("c");
        Page<Demo> page = demoService.queryDemoPage(qryDemo);
        log.info("PageTest, {}", page);

        Demo saveQryD = demoRepository.findById(20000001L).get();
        log.info("SaveQry,{}", saveQryD);

    }
}
