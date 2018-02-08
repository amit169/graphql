package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLResolver;

import com.howtographql.hackernews.SigninPayload;

public class SigninResolver implements GraphQLResolver<SigninPayload> {

    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}
