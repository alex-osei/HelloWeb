package com.tutorialspoint.util;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;

/**
 * Created by alexosei on 5/10/17.
 */
public interface AppConfigInt {

    void ConfigureDefaultServletHandling(DefaultServletHandlerConfigurer configurer);
}
