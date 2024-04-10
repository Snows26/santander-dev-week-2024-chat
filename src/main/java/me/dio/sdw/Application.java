package me.dio.sdw;

import me.dio.sdw.application.ListChampions;
import me.dio.sdw.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampions provideListChampions(ChampionsRepository repository) {
		return new ListChampions(repository);
 	}

}
