package com.getting2knowij.vcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LogTest {
  private final StubOut out = new StubOut("LogTest");

  @Test
  @Disabled
  void shouldFailBecauseWeHaveNotWrittenThisYet() {
    Assertions.fail();
  }

  @Test
  void shouldPrintMessageToTheGivenOutputAsInfo() {
    // given
    Log log = new Log(out);
    String message = "message";

    // when
    log.info(message);

    // then
    Assertions.assertTrue(out.hasOutput(message));
  }

  public void unusedMethod() {
    // do we need this?
  }
}
