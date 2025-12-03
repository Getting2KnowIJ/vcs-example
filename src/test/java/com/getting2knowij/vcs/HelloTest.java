package com.getting2knowij.vcs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
  @Test
  void shouldReturnCorrectString() {
    Hello hello = new Hello();

    assertEquals("Hello Git!", hello.getMessage());
  }

}