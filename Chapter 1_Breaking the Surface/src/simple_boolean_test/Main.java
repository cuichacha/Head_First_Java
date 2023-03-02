package simple_boolean_test;

/**
 * @author Will Dufresne
 * @Date: 2023-03-02 18:01
 * @Description: The main class in simple boolean test section
 */
public class Main {
    public static void main(String[] args) {
        int x = 4;
        while (x > 3) {
            // loop code will run because x is greater than 3
            x= x -1; // or we'd loop forever
        }

        int z = 27;
        while (z == 17) {
            // loop code will not run because z is not equal to 27
        }
    }
}