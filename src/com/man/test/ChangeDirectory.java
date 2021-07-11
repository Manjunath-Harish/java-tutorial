package com.man.test;

public class ChangeDirectory {
  public static void main(String[] args) {
    String currentDirectory = "/";
    String command="cd /";

    solve(currentDirectory,command);
  }

  private static void solve(String currentDirectory, String command) throws IllegalStateException{
    validate(command);
  }

  private static void validate(String command) {
//    if(command.startsWith("cd "))
  }
}
