/*
Input, Output in Java
In this challenge, you will learn to read input for the first time. Most popular way to read input in java is by using Scanner. For example:

Scanner scanner = new Scanner(System.in);
int myInt = scanner.nextInt();
System.out.println("myInt is: " myInt);
*/

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
      Scanner scanner = new Scanner(System.in);
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      int n3 = scanner.nextInt();
      System.out.println(n1);
      System.out.println(n2);
      System.out.println(n3);
    }
}
