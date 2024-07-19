package com.mrp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BicycleConfig {

    @Bean
    ModelMapper mapper() {
		return new ModelMapper();
	}

}
