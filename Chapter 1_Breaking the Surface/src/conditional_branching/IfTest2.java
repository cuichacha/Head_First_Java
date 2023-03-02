package conditional_branching;

/**
 * @author Will Dufresne
 * @Date: 2023-03-02 18:19
 * @Description: The if test 2 class in conditional branching section
 */
public class IfTest2 {
    public static void main(String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is NOT 3");
        }
        System.out.println("This runs no matter what");
    }
}