package com.example.template.exceptions;

public class InvalidEntityException extends RuntimeException {
  public InvalidEntityException(String message) {
    super(message);
  }
}
