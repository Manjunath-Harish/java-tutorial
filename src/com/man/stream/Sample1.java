package com.man.stream;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample1 {
  public static void main(String[] args) {
    List<Double> integerStream = Stream.generate(Math::random).limit(10).collect(Collectors.toList());
    long start = System.currentTimeMillis();
    Double sum = integerStream.stream().parallel().reduce(0.0,Double::sum);
    System.out.println("sum : "+sum+" : exee : "+(System.currentTimeMillis()-start));
    long start2 = System.currentTimeMillis();
    Double sum2 = integerStream.stream().reduce(0.0,Double::sum);
    System.out.println("sum : "+sum2+" : exee : "+(System.currentTimeMillis()-start));
    whenFindMin_thenGetMinElementFromStream();
  }

  public static void whenFindMin_thenGetMinElementFromStream() {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
    int min = list.stream()
        .min(Comparator.comparingInt(e -> e))
        .orElseThrow(NoSuchElementException::new);
    System.out.println(min);
  }

}
