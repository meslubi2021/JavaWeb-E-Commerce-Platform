package io.github.machadoborges.security.impl;


import io.github.machadoborges.security.JwtConfig;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class JwtConfigImpl implements JwtConfig {

    @Override
    public String generateToken(String email) {
        return "oi";
    }
}
