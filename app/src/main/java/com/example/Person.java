package com.example; // Package name

public class Person { // Class name: UpperCamelCase -> First Letter is Uppercase! -> here it is
                      // already correct, check the rest!

    public static final int MAX_AGE = 120; // Constant

    public String firstName; // Instance variable
    public String lastName; // Instance variable
    public int age; // Instance variable

    public String getFullName() { // Method name
        return firstName + " " + lastName;
    }

    public int getAgeInMonths() { // Method name
        return age * 12;
    }

    public static void main(String[] args) { // Main method (also normal method name rule applies here)
        Person person1 = new Person(); // Local variable

        System.out.println("Person's full name: " + person1.getFullName());
        System.out.println("Age in months: " + person1.getAgeInMonths());
    }
}
