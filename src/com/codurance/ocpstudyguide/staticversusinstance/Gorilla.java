package com.codurance.ocpstudyguide.staticversusinstance;

public class Gorilla {
  public static int count;
  public static void addGorilla() { count++; }
  public void babyGorilla() { count++; }
  public void announceBabies() {
    addGorilla();
    babyGorilla();
  }

  public static void announceBabiesToEveryone() {
    addGorilla();
    // doesn't compile as it is referenced inside
    // announceBabies - Java
//    babyGorilla();
  }

  public int total;
  public static double average;
}
