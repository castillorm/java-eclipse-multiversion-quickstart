package com.example.modern;

public class Main {

	public static void main(String[] args) {
		var name = "Foo";
		System.out.println("Hello again, Java! Welcome back, " + name);
		
		String json = """
                {
                    "message": "You are using modern Java",
                    "version": 21
                }
                """;
        System.out.println(json);

	}

}
