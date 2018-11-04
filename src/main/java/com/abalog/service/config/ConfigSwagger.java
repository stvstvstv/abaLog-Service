package com.abalog.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class ConfigSwagger {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.abalog.service"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metadata());
    }

    /**
     * @return the general description of OrderService APIs
     */
    private ApiInfo metadata() {
        return new ApiInfo
                ("abaLog Service"
                        , "Here are described all the APIs defined into Service Application"
                        , "1.0"
                        , "Terms of service"
                        , new Contact("tbd"
                        , "tbd"
                        , "tbd")
                        , ""
                        , ""
                        , new ArrayList<>());
    }

}