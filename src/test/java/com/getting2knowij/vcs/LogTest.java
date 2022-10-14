package com.getting2knowij.vcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LogTest {
  private final StubOut out = new StubOut();

  @Test
  @Disabled
  void shouldFailBecauseWeHaveNotWrittenThisYet() {
    Assertions.fail();
  }

  @Test
  void shouldPrintLogMessageToTheGivenOutput() {
    // given
    Log log = new Log(out);
    String message = "message";

    // when
    log.info(message);

    // then
    Assertions.assertTrue(out.hasOutput(message));
  }

  public void unusedMethod() {
    //TODO: should fail to commit first time because of a new warning
  }
}
