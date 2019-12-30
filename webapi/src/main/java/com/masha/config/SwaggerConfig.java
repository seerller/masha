package com.masha.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket controllerApi() {
        ParameterBuilder tokenPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        tokenPar.name("hkapp-token").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.masha.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo())
                .globalOperationParameters(pars);

    }
    public ApiInfo apiInfo(){
        String description = "这是一个给app端人员调用server端接口的测试文档与平台<br/>";
        description= description.concat("使用说明:<br/>");
        description= description.concat("因后台有配置登录状态拦截，因此需要token进行请求.<br/>在控制层描述中带有*号的必须先进行登录获取令牌放入hkapp-token中请求获取数据。");
        description= description.concat("当fontType 值为F时，接口返回繁体字，不传为默认返回简体字");
        return new ApiInfoBuilder()
                .title("拓略公司玛莎红酒商店后台管理系统接口文档")
                .description(description)
                .version("1.0.0")
                .build();
    }


}
