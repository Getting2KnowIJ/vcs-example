package com.getting2knowij.vcs;

public class Hello {
  private static final String message = "Hello Git!";
  private static String author;

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("You must provide an author name");
    }
    author = args[0];
    System.out.println(message);
    System.out.println("Hello there!");
  }

  public String getMessage() {
    return "message";
  }

  private String getAuthor() {
    return author;
  }
}
