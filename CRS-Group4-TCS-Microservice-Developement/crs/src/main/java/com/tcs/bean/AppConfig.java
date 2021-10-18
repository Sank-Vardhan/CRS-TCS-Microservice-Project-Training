package com.tcs.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tcs.dao.*;


@Configuration
public class AppConfig {
	@Bean(name="")
	public AdminDAOInterface admindao() {
		return new AdminDAOImp();
	}

}
