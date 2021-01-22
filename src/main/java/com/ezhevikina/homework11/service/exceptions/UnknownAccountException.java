package com.ezhevikina.homework11.service.exceptions;

public class UnknownAccountException extends Exception {
  public UnknownAccountException(String message, Throwable cause) {
    super(message, cause);
  }
}
