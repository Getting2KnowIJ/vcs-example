package com.getting2knowij.vcs;

public class StubOut implements Out{
  private String name;

  public StubOut(String name) {

    this.name = name;
  }

  @Override
  public boolean hasOutput(String message) {
    return false;
  }
}
