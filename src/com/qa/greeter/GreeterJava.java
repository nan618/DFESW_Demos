package com.qa.greeter;

public class GreeterJava {
	private GreetingJava greeting;

    public GreeterJava(GreetingJava greetingJava) {
        this.greeting = greetingJava;
    }

    public String greetJava() {
        return this.greeting.greet();
    }

    public GreetingJava getGreetingJava() {
        return greeting;
    }

    public void setGreeting(GreetingJava greetingjava) {
        this.greeting = greetingjava;
    }

}
