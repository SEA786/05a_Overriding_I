package com.cc.java;

public class Parent {
    //Method overriding in Java is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
    public String sayHello() {
        return "Hello from Parent";   
}
 public String sayHelloString(String Str) {
    
    return Str + " Parent!";

 }
}