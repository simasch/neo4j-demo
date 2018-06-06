package io.seventytwo.demo.neo4j.node;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
public class PersonNode {

    @Id
    private String name;

    @Relationship(type = "TEAMMATE", direction = Relationship.UNDIRECTED)
    public Set<PersonNode> teammates = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PersonNode> getTeammates() {
        return teammates;
    }

    public void setTeammates(Set<PersonNode> teammates) {
        this.teammates = teammates;
    }
}
