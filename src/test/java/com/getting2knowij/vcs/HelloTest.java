package com.getting2knowij.vcs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
  @Test
  void shouldReturnCorrectString() {
    Hello hello = new Hello();
    assertEquals("Hello Git!", hello.getMessage());
  }

  @Test
  @DisplayName("Should give an error if no name is added")
  void shouldGiveAnErrorIfNoNameIsAdded() {
      // given
      Hello hello = new Hello();

      // expect
      assertEquals("You must provide an author name", hello.getMessage());
  }
}