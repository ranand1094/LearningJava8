package com.java.problems;
import java.util.Arrays;
import java.util.stream.IntStream;
  class Test implements Cloneable
{
    int a;
 
    Test cloning()
    {
        try
        {
            return (Test) super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("CloneNotSupportedException is caught");
            return this;
        }
    }
}
 
class demo
{
 
    public static void main(String args[])
    {
        Test obj1 = new Test();
        Test obj2;
        obj1.a = 10;
        obj2 = obj1.cloning();
        obj2.a = 20;
 
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj2.a = " + obj2.a);
    }
}