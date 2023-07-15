package PrePlacementTraning.Java_Assign_5;
//Q6.Write a program to create and call a custom exception

// Custom exception class
class CustomException extends Exception {
    public CustomException() {
        super("This is a custom exception");
    }
}

// Main class
public class Que6{
    public static void main(String[] args) {
        try {
            // Throw custom exception
            throw new CustomException();
        } catch (CustomException e) {
            // Catch and handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

