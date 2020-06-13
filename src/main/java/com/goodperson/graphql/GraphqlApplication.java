package com.goodperson.graphql;

import java.util.stream.Stream;

import com.goodperson.graphql.model.Post;
import com.goodperson.graphql.service.PostService;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	// 더미 데이타 생성
	/*
	 * @Bean ApplicationRunner init(PostService postservice) { return args -> {
	 * Stream.of("title1", "title2", "title3", "title4", "title5",
	 * "title6").forEach(title -> { Post post = new Post(); post.setTitle(title);
	 * postservice.savePost(post); });
	 * postservice.getPosts().forEach(System.out::println); }; }
	 */

}
