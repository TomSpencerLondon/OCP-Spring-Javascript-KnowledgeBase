package com.codurance.effectiveJava.item3.enumtype;

public enum Elvis {
  INSTANCE;

  public void leaveTheBuilding(){
    System.out.println("Whoa baby, I'm outta here!");
  }

  // This code would normally appear outside the class
  public static void main(String[] args) {
    Elvis elvis = Elvis.INSTANCE;
    elvis.leaveTheBuilding();
  }
}
