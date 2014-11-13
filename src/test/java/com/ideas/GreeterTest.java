package com.ideas;

import org.junit.Assert;
import org.junit.Test;

public class GreeterTest {

    @Test
    public void testGreetMessage(){
        Greeter greeter = new Greeter();
        Assert.assertEquals("Hello Harry", greeter.greet("Harry"));
    }

//    @Test
//    public void testFailGreetMessage(){
//        Greeter greeter = new Greeter();
//        Assert.assertEquals("Hello Harry1" , greeter.greet("Harry"));
//    }
}
