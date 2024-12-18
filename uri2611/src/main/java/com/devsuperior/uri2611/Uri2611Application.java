package com.devsuperior.uri2611;

import com.devsuperior.uri2611.dto.MovieMinDTO;
import com.devsuperior.uri2611.projections.MovieMinProjections;
import com.devsuperior.uri2611.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Uri2611Application implements CommandLineRunner {

	@Autowired
	MovieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(Uri2611Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<MovieMinProjections> result = repository.search1("Action");
		List<MovieMinDTO> result2 = result.stream().map(x -> new MovieMinDTO(x)).collect(Collectors.toList());
		System.out.println("\n*** Resultado JQL Raiz: ***");
		/*for (MovieMinProjections obj : result) {
			System.out.println(obj.getId() + " - " + obj.getName());
		}*/
		for (MovieMinDTO obj : result2) {
			System.out.println(obj);
		}
			System.out.println("\n\n");

		List<MovieMinDTO> search2 = repository.search2("Action");
		System.out.println("\n*** Resultado JPQL : ***");
		for (MovieMinDTO obj : search2) {
			System.out.println(obj);
		}
	}
}
