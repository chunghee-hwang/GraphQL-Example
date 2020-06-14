package com.goodperson.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
