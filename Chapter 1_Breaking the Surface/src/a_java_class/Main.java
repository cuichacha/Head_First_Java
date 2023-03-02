package a_java_class;

/**
 * @author Will Dufresne
 * @Date: 2023-03-02 17:10
 * @Description: The main class in a java class section
 */
public class Main {
    public static void main(String[] args) {
        int x = 3;
        String name = "Drik";
        doSomething(x);
        doSomethingAgainAndAgain(x);
        doSomethingUnderThisCondition(x, name);
    }

    private static void doSomething(int x) {
        x = x * 17;
        System.out.println("x is " + x);
        double d = Math.random();
        // this is a comment
    }

    private static void doSomethingAgainAndAgain(int x) {
        while (x > 12) {
            x= x -1;
        }

        for (x = 0; x < 10; x++) {
            System.out.println("x is now " + x);
        }
    }

    private static void doSomethingUnderThisCondition(int x, String name) {
        if (x == 10) {
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }

        if (x < 3 & name.equals("Drik")) {
            System.out.println("Gently");
        }
        System.out.println("this line runs no matter what");
    }
}