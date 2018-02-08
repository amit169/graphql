package com.hackernews;

import java.util.List;

import org.bson.Document;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "link", path = "link")
public interface LinkRepository extends MongoRepository<Link, String> {

	//Document<Link> findByDescription(@Param("description") String description);

}
