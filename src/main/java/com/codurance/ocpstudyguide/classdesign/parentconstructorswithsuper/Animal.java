package com.codurance.ocpstudyguide.classdesign.parentconstructorswithsuper;

public class Animal {
  private int age;
  public Animal(int age){
    super(); // refers to constructor in java.lang.Object
    this.age = age;
  }
}
