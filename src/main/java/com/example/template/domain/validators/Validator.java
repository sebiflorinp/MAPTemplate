package com.example.template.domain.validators;

public interface Validator<E> {
    void validate(E entity);
}
