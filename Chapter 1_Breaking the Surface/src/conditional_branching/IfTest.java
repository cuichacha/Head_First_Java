package conditional_branching;

/**
 * @author Will Dufresne
 * @Date: 2023-03-02 18:18
 * @Description: The if test class in conditional branching section
 */
public class IfTest {
    public static void main(String[] args) {
        int x = 3;
        if (x == 3) {
            System.out.println("x must be 3");
        }
        System.out.println("This runs no matter what");
    }
}