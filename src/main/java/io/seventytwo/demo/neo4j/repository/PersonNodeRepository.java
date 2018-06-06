package io.seventytwo.demo.neo4j.repository;

import io.seventytwo.demo.neo4j.node.PersonNode;
import org.springframework.data.repository.CrudRepository;

public interface PersonNodeRepository extends CrudRepository<PersonNode, String> {

    PersonNode findByName(String name);
}
