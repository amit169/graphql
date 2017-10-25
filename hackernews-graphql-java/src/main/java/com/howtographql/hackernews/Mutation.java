package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.time.Instant;
import java.time.ZoneOffset;

import graphql.GraphQLException;
import graphql.schema.DataFetchingEnvironment;

/**
 * Mutation root
 */
public class Mutation implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;

    }

    public Link createLink(String url, String description) {

        Link newLink = new Link(url, description);
        linkRepository.saveLink(newLink);
        return newLink;
    }

  
}
