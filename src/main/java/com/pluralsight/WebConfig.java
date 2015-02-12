package com.pluralsight;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by daniel.arlitt on 2/10/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.pluralsight")
public class WebConfig {

}
