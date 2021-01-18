package it.filippetti.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.directwebremoting.spring.DwrSpringServlet;

import java.util.HashMap;
import java.util.Map;
@SpringBootApplication
public class SpringReactComboAppApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringReactComboAppApplication.class, args);
	}

	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new DwrSpringServlet());
        registration.setName("dwr");
        registration.setEnabled(true);
        registration.addUrlMappings("/dwr/*");
        Map<String, String> initParameters = new HashMap<>(1);
        initParameters.put("debug", "true");
        registration.setInitParameters(initParameters);
        return registration;
    }

}
