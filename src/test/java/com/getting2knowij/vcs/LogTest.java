package com.getting2knowij.vcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LogTest {
  private StubOut out;

  @Test
  void shouldFailBecauseWeHaveNotWrittenThisYet() {
    // given
    Log log = new Log(out);
    String message = "message";

    // when
    log.info(message);

    // then
    Assertions.assertTrue(out.hasOutput(message));
  }
}
