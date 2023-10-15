package io.github.machadoborges.services.impl;

import io.github.machadoborges.dto.UserDTO;
import io.github.machadoborges.entity.User;
import io.github.machadoborges.repository.UserRepository;
import io.github.machadoborges.security.JwtConfig;
import io.github.machadoborges.services.UserService;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.Optional;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    public UserRepository userRepository;


    @Inject
    JwtConfig jwtUtils;

    @Override
    @Transactional
    public void save(UserDTO dto) {
        Optional.ofNullable(dto)
                .map(User::new)
                .ifPresentOrElse(userRepository::persist,
                        () -> {
                            throw new NullPointerException("usuário nulo");
                });
    }

    @Override
    public String loginAndGenerateToken(UserDTO dto) {

      return userRepository.findByEmail(dto.getEmail())
                .map( u -> jwtUtils.generateToken(dto.getEmail()))
                .orElseThrow(() -> new NullPointerException("usuario nulo"));
    }



}

