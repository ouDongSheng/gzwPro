package org.springblade.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Value("${etop.download.windows}")
    private String windowsPath;

    @Value("${etop.download.linux}")
    private String linuxPath;

    @Value("${etop.download.static}")
    private String staticPathPattern;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //兼容windows和linux
        String downloadPath="";
        String osInfo = System.getProperty("os.name");
        if(osInfo.toLowerCase().startsWith("win")){
            downloadPath = windowsPath;
        }else if(osInfo.toLowerCase().startsWith("linux")){
            downloadPath = linuxPath;
        }
        registry.addResourceHandler(staticPathPattern).addResourceLocations("/",downloadPath);
    }
}
