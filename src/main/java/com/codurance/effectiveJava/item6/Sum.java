package com.codurance.effectiveJava.item6;

import org.w3c.dom.ls.LSOutput;

public class Sum {
    private static long sum() {
//        Long sum = 0L;
          long sum = 0L;

          for (long i = 0; i <= Integer.MAX_VALUE; i++){
              sum += i;
          }
          return sum;
    }

    public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        long x = 0;

        for (int i = 0; i < numSets; i++){
            long start = System.nanoTime();
            x += sum();
            long end = System.nanoTime();

            System.out.println((end - start) / 1_000_000 + " ms.");
        }

        // Prevents VM from optimizing away everything
        if (x == 42){
            System.out.println("completed");
        }
    }
}
