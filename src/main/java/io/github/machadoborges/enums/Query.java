package io.github.machadoborges.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Query {
    EMAIL("Email");

    private final String value;

}
