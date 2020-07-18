package io.github.alphahinex.proxyinspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.task.TaskExecutor
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor

@SpringBootApplication
class DemoApplication {

    static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args)
    }

    @Bean
    TaskExecutor taskExecutor() {
        new ThreadPoolTaskExecutor()
    }

}
