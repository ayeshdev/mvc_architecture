package com.ayesh.mvc_architecture.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class AppConfig extends ResourceConfig {
    public AppConfig() {
        packages("com.mvc_architecture.webapp.controllers");
        packages("com.mvc_architecture.webapp.middleware");
        register(JspMvcFeature.class);
        property(JspMvcFeature.TEMPLATE_BASE_PATH,"/WEB-INF/views");
    }
}
