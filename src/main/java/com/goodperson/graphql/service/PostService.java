package com.goodperson.graphql.service;

import java.util.List;
import java.util.Optional;

import com.goodperson.graphql.model.Post;
import com.goodperson.graphql.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.leangen.graphql.annotations.GraphQLContext;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;

@Service
@GraphQLApi
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    /*
     * { post{ id title } }
     */
    @GraphQLQuery(name = "posts")
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    /*
     * { post(id:1){ id title } }
     */
    @GraphQLQuery(name = "post")
    public Optional<Post> getPostById(Long id) {
        return postRepository.findById(id);
    }

    /*
     * mutation{ savePost(post:{title:"title"}){ id title } }
     */
    @GraphQLMutation(name = "savePost")
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    /*
     * mutation{ deletePost(id:1) }
     */
    @GraphQLMutation(name = "deletePost")
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    /*
     * { post{ title isGood } }
     */
    @GraphQLQuery(name = "isGood")
    public boolean isGood(@GraphQLContext Post post) {
        return !post.getTitle().equals("title1");
    }
}