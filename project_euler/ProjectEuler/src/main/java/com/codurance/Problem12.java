package com.codurance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Problem12 {
  public List<Integer> triangleNumbersForFirst(int number) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    for (int i = 2; i <= number; i++){
      numbers.add(numbers.get(i - 2) + i);
    }

    return numbers;
  }


  public Integer triangleNumberWithDivisorsMoreThan(int number) {

    boolean notFound = true;
    int n = 1;

    while(notFound){
      int triangleNumber = (n * (n + 1)) / 2;

      if (factorsFor(triangleNumber) > number){
        return triangleNumber;
      }

      n = n + 1;
    }

    return 0;
  }

  public int factorsFor(int triangleNumber) {
    int count = 2;

    for (int i = 1; i < triangleNumber / 2; i++){
      if (triangleNumber % i == 0){
        count++;
      }
    }

    return count;
  }
}
