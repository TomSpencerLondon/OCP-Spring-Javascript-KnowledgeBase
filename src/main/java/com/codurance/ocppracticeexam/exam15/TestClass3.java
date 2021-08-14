package com.codurance.ocppracticeexam.exam15;

public class TestClass3 {
  void someMethod()
  {
//    Title.DR dr = new Title.DR("Dr. ")
//    System.out.println(Title.format("Rob", "Miller"));
    System.out.println(Title.MR.format("Rob", "Miller"));
  }
}

enum Title
{
  MR("Mr. "), MRS("Mrs. "), MS("Ms. ");

  private String title;
  private Title(String s) {
    title = s;
  }

  public String format(String first, String last) {
    return title+ " "+first+" "+last;
  }
}
enum Title2
{
  DR;
  private Title t = Title.MR;
  public String format(String s){ return t.format(s, s); };
}
