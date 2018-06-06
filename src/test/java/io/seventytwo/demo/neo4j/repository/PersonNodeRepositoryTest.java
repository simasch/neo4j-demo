package io.seventytwo.demo.neo4j.repository;

import io.seventytwo.demo.neo4j.node.PersonNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataNeo4jTest
public class PersonNodeRepositoryTest {

    @Autowired
    private PersonNodeRepository personNodeRepository;

    @Test
    public void findByName() {
        PersonNode simon = new PersonNode();
        simon.setName("Simon");
        personNodeRepository.save(simon);

        PersonNode simonFromDb = personNodeRepository.findByName("Simon");

        assertNotNull(simonFromDb);
        assertEquals("Simon", simonFromDb.getName());
    }
}
