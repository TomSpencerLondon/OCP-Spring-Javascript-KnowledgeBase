package com.codurance.ocpstudyguide.classdesign.overloadinggeneric;

import java.util.List;

public class LongTailAnimal {
  protected void chew(List<Object> input){}
//  protected void chew(List<Object> input){}
//  protected void chew(List<Double> input) {} // Does not compile
}
