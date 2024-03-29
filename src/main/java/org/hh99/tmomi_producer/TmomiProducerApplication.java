package org.hh99.tmomi_producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
public class TmomiProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmomiProducerApplication.class, args);
	}

}
