package COM_EXAMPLE; // Package name

public class Person { // Class name: UpperCamelCase -> First Letter is Uppercase! -> here it is
                      // already correct, check the rest!

    public static final int max-age=120; // Constant

    public String First_Name; // Instance variable
    public String Last_Name; // Instance variable
    public int Age; // Instance variable

    public String GET_FULL_NAME() { // Method name
        return First_Name + " " + Last_Name;
    }

    public int GET_AGE_IN_MONTHS() { // Method name
        return Age * 12;
    }

    public static void main(String[] args) { // Main method (also normal method name rule applies here)
        Person Person1 = new Person(); // Local variable

        System.out.println("Person's full name: " + Person1.GET_FULL_NAME());
        System.out.println("Age in months: " + Person1.GET_AGE_IN_MONTHS());
    }
}
