package org.joinfaces.example.repository;

import org.joinfaces.example.models.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;
import java.util.Optional;

public interface UserRepository extends Neo4jRepository<User, Long> {
    @Query("MATCH (u:User) RETURN u")
    Collection<User> getAllUsers();

    @Query("MATCH(w:User) -[r:isAdmin]->(a:Admin)" + "WHERE (w.email=$email OR w.name=$email) "
            + "AND w.password=$password " + "return w,a")
    Optional<User> getAdminUsers(String email, String password);

}
