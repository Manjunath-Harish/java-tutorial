package com.man.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsToNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isContinue = true;

    while (isContinue) {
      List<String> positionValues = new ArrayList<>();
      positionValues.add("thousand");
      positionValues.add("hundred");


      int inputValue = 0;
      System.out.println("Enter any Number less than 100 in words");
      String numbersInWords = scanner.nextLine();
      System.out.println("Found : " + numbersInWords);
      inputValue = getWordsToNumbers(numbersInWords,positionValues,0,0);

      System.out.println(inputValue);
      System.out.println("enter to continue");
      String a = scanner.nextLine();
      if (a.length() != 0) {
        isContinue = false;
      }
    }
  }

  private static int getWordsToNumbers(String numberInWords, List<String> positionValues,int inputValue,int count) {
    count++;
    for (int i=0;i<positionValues.size();i++){
      if (numberInWords.contains(positionValues.get(i))) {
        String[] positionValue = numberInWords.split(positionValues.get(i));
        if (positionValue.length > 1) {
          inputValue = getWordsToNumberWithinHundred(positionValue[0]) * (int) Math.pow(10, positionValues.size()+1);
          inputValue = getWordsToNumbers(positionValue[1], positionValues,inputValue,count);
        } else {
          inputValue = getWordsToNumberWithinHundred(numberInWords) * (int) Math.pow(10, positionValues.size()+1);
        }
      } else {
        positionValues.remove(i);
        if(positionValues.isEmpty()){
          inputValue += getWordsToNumberWithinHundred(numberInWords);
          return inputValue;
        }
        inputValue= getWordsToNumbers(numberInWords, positionValues,inputValue,count);
      }
    }
    return inputValue;
  }

  public static int getWordsToNumberWithinHundred(String numberWithinHundred){
    int inputValue = 0;
    boolean isFound = false;
    String[] tens = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    String[] twenties = new String[] {"eleven", "twelve"};
    String[] input = numberWithinHundred.split(" ");
    for (int i = 0; i < input.length; i++) {
      if (input[i].contains("ty")) {
        String[] a = input[i].split("ty");
        for (int j = 0; j < tens.length; j++) {
          if (tens[j].contains(a[0].substring(0,2))) {
            inputValue += j*10;
            break;
          }
        }
        if(a.length > 1){
          for (int j = 0; j < tens.length; j++) {
            if (tens[j].contains(a[1])) {
              inputValue+=j;
              break;
            }
          }
        }
      } else if (input[i].endsWith("teen")) {
        input[i] = input[i].replace("teen","");
        for (int j = 0; j < tens.length; j++) {
          if (tens[j].contains(input[i])) {
            inputValue+=j+10;
            isFound = true;
            break;
          }
        }
        if(!isFound){
          if(input[i].contains("th"))
            inputValue+=13;
          else
            inputValue+=15;
        }
      } else {
        isFound = false;
        for (int j = 0; j < tens.length; j++) {
          if (tens[j].contains(input[i])) {
            isFound = true;
            inputValue+=j;
            break;
          }
        }
        if (!isFound) {
          for (int j = 0; j < twenties.length; j++) {
            if (twenties[i].contains(input[i])) {
              inputValue += 10 + j + 1;
              break;
            }
          }
        }
      }
    }
    Integer.valueOf("1111",37);
    return inputValue;

  }
}
