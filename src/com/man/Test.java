package com.man;

import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

  private static final Pattern PATTERN_SEGMENT_ANSWER =
      Pattern.compile("<segment(.*?)>(.+?)</segment>:?(.*)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);

  public static void main(String[] args) {
    String message =
        "<segment val='def'><channel val='w'>Web App Response</channel></segment>";
    String msg ="<segment val='def'><channel val='gh'>What are the accounts available GH</channel></segment>:What are the accounts available";
    final Matcher segmentMatcher = PATTERN_SEGMENT_ANSWER.matcher(msg);
    while (segmentMatcher.find()) {
      System.out.println(segmentMatcher.group(1));
      System.out.println(segmentMatcher.group(2));
      System.out.println("3"+segmentMatcher.group(3));
    }
  }
}
