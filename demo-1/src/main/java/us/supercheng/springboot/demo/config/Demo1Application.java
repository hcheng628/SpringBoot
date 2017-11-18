package us.supercheng.springboot.demo.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
@ComponentScan("us.supercheng.springboot.demo")
@EnableJpaRepositories(basePackages="us.supercheng.springboot.demo.repository")
@EntityScan("us.supercheng.springboot.demo.entity")
public class Demo1Application extends WebMvcConfigurerAdapter {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		List<MediaType> mediaTypes = new ArrayList<>();
		mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		converter.setSupportedMediaTypes(mediaTypes);
		converters.add(converter);
	}

	@Bean
	public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
		Properties prop = new Properties();
		prop.setProperty("java.lang.Exception","jsp/error");
		resolver.setExceptionMappings(prop);
		return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}