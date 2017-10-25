package com.howtographql.hackernews;


import com.coxautodev.graphql.tools.SchemaParser;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.schema.GraphQLSchema;
import graphql.servlet.GraphQLContext;
import graphql.servlet.SimpleGraphQLServlet;
import com.howtographql.hackernews.LinkRepository;
import com.coxautodev.graphql.tools.SchemaParser;

@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

  //private static final LinkRepository linkRepository;

    public GraphQLEndpoint() {
        super(buildSchema());
    }
//
//    private static GraphQLSchema buildSchema() {
//        LinkRepository linkRepository = new LinkRepository();
//        return SchemaParser.newParser()
//                .file("schema.graphqls")
//                .resolvers(new Query(linkRepository))
//                .build()
//                .makeExecutableSchema();
//    }

    private static GraphQLSchema buildSchema() {
       LinkRepository linkRepository = new LinkRepository();
    return SchemaParser.newParser()
        .file("schema.graphqls")
        .resolvers(new Query(linkRepository), new Mutation(linkRepository))
        .build()
        .makeExecutableSchema();
    }
}
