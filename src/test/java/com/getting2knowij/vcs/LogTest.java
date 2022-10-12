package com.getting2knowij.vcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LogTest {
  @Test
  @Disabled
  void shouldFailBecauseWeHaveNotWrittenThisYet() {
    Assertions.fail();
  }

  public void unusedMethod() {
    //TODO: should fail to commit first time because of a new warning
  }
}
