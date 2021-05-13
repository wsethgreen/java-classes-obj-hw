

public class Main {
    public static void main(String[] args) {

        // Create a new pet object named hodor
        Pet hodor = new Pet();

        // Set hodor's attributes
        hodor.setName("Hodor");
        hodor.setAge(9);
        hodor.setLocation("Columbus, Ohio");
        hodor.setType("dog");

        // Print the attributes to the console to ensure it's working.
        System.out.printf("I have a pet named %s. \n%s is a %s that is %s years old. \n%s resides in %s.", hodor.name, hodor.name, hodor.type, hodor.age, hodor.name, hodor.location);

    }




}