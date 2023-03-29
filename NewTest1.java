package com.demo.Selenium1;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
	Scanner sc=new Scanner(System.in);
  @Test
  public void add() {
	  System.out.println("Enter the value for A");
		int A=sc.nextInt();
		System.out.println("Enter the value for B");
		int B=sc.nextInt();
		System.out.println("Enter the expected sum");
		int expected=sc.nextInt();
		int sum=A+B;
		Assert.assertEquals(sum,expected);
  }
}
