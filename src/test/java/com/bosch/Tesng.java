package com.bosch;

import org.junit.Before;
import org.junit.After;
import org.testng.annotations.Test;
import org.junit.Assert;

public class Tesng
{

private Basic_arithmetic arithmetic_operations;

@Before
public void createObject(){
arithmetic_operations= new Basic_arithmetic();
}

@Test
public void testsum(){
   int input1 = 10;
   int input2 = 20;
   Assert.assertEquals(30, arithmetic_operations.sum(input1,input2));
   System.out.println("Hello");
}
}
