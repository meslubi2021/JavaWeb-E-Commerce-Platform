package io.github.machadoborges.repository;



import io.github.machadoborges.entity.User;
import io.github.machadoborges.enums.Query;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    public Optional<User> findByEmail(String email) {
        return find(Query.EMAIL.getValue(), email).firstResultOptional();
    }
}
