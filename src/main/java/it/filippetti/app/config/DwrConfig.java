package it.filippetti.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = "classpath:dwr-config.xml")
public class DwrConfig {
}
