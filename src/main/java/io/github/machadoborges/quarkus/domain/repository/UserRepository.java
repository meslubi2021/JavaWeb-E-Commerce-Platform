package io.github.machadoborges.quarkus.domain.repository;

import io.github.machadoborges.quarkus.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

}
