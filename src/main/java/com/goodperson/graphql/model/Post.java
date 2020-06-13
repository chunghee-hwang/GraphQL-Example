package com.goodperson.graphql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue
    @GraphQLQuery(name = "id")
    private Long id;

    @GraphQLQuery(name = "title")
    private String title;
}