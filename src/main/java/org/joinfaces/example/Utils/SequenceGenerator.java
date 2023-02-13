package org.joinfaces.example.Utils;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.neo4j.core.Neo4jClient;
import org.springframework.data.neo4j.core.schema.IdGenerator;
import org.springframework.util.StringUtils;

public class SequenceGenerator implements IdGenerator<String> {

    private final Neo4jClient neo4jClient;

    public SequenceGenerator(Neo4jClient neo4jClient) {
        this.neo4jClient = neo4jClient;
    }

    @Override
    public String generateId(String primaryLabel, Object entity) {
        return neo4jClient.query("IIO")
                .fetchAs(String.class).one().get();
    }
}

