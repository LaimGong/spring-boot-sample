package com.gong.sample.spring.boot.autoconfigure;

import com.gong.sample.spring.boot.component.SampleComponent;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "sample", name = "enable", havingValue = "true", matchIfMissing = true)
public class SampleAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SampleComponent.class)
    public SampleComponent sampleComponent() {
        return new SampleComponent();
    }
}
