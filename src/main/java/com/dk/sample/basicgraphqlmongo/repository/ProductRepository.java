package com.dk.sample.basicgraphqlmongo.repository;

import com.dk.sample.basicgraphqlmongo.models.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ObjectId, String> {

  public Product findBy_id(ObjectId id);

}
