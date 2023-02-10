package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "demo")
public class BeanConfig {

//	Instead of using @component in sprin.xml we can use the following method to return an object
//	@Bean
//	public Doctor doctor() {
//		return new Doctor();
//	}
}
