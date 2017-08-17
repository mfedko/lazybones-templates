package ${group}

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import zipkin.server.EnableZipkinServer

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
class Application {
    public static final int DEFAULT_PADDING = 50

    static void main(String[] args) {
        println 'Starting'.center(DEFAULT_PADDING, '=')
        SpringApplication.run Application, args
        println 'Started'.center(DEFAULT_PADDING, '=')
    }
}
