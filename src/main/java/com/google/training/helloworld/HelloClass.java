package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public String getMessage() {
        return message;
    }
    public HelloClass (String name, String period) {
        this.message = "Good " + period + " " + name + "!";
    }
    public HelloClass(String age, int one){
    	this.message = "Hello, "+ age+" years old human!";
    }
}
