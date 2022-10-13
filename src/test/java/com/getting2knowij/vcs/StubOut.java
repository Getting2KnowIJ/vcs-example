package com.getting2knowij.vcs;

public class StubOut implements Out{
  @Override
  public boolean hasOutput(String message) {
    return false;
  }
}
