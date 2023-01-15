package io.github.machadoborges.quarkus.rest.dto;

public class FieldError {
    private String field;
    private String message;

    public String getField() {
        return field;
    }

    public FieldError(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
