package com.restservice.springboot.studentservices.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StudentServicesApplication extends SpringBootServletInitializer
{

public static void main(String[] args)
{
    SpringApplication.run(StudentServicesApplication.class, args);
}

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
{
    return builder.sources(StudentServicesApplication.class);
}

	/*
	 * @Bean
	 * 
	 * @Primary
	 * 
	 * @ConfigurationProperties(prefix = "spring.datasource") public DataSource
	 * firstDataSource() { return DataSourceBuilder.create().build(); }
	 * 
	 * @Bean(name = "demoSource2DS")
	 * 
	 * @ConfigurationProperties(prefix = "app1.datasource") public DataSource
	 * demoSourceDS() { return DataSourceBuilder.create().build(); }
	 */

}
