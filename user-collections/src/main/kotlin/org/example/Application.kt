package org.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@SpringBootApplication
open class Application{

    @Bean
    open fun swaggerApi() : Docket {
        return Docket(DocumentationType.OAS_30)
            .apiInfo(apiInfo())
            .select()
            .paths(PathSelectors.any())
            .build()

    }

    private fun apiInfo() : ApiInfo {
        return ApiInfoBuilder()
            .title("SNazzy title here")
            .description("And that too")
            .version("1.0")
            .build()
    }

}


fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}