package ${group}

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class EurekaApplication {
    public static final int DEFAULT_PADDING = 50

    static void main(String[] args) {
        println 'Starting'.center(DEFAULT_PADDING, '=')
        SpringApplication.run EurekaApplication, args
        println 'Started'.center(DEFAULT_PADDING, '=')
    }
}
