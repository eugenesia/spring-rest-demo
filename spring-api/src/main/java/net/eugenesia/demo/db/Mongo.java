package net.eugenesia.demo.db;

import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.stereotype.Component;

@Component
public class Mongo {
  private final MongoDatabaseFactory mongo;

  @Autowired
  public Mongo(MongoDatabaseFactory mongo) {
    this.mongo = mongo;
  }

  // ...

  public void example() {
    MongoDatabase db = mongo.getMongoDatabase();
    // ...
  }
}
