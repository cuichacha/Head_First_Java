package why_java_is_cool;

import java.io.FileNotFoundException;

/**
 * @author Will Dufresne
 * @Date: 2023-03-02 17:02
 * @Description: The main class in why java is cool section
 */
public class Main {
    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 15) {
            myDog.bark(8);
        }

        while (x > 3) {
            myDog.play();
        }

        int[] numList = {2, 4, 6, 8};

        System.out.println("Hello");
        System.out.println("Dog: " + name);
        String num = "8";

        int z = Integer.parseInt(num);

        try {
            readTheFile("myFIle.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    private static void readTheFile(String path) throws FileNotFoundException {

    }

    private record Dog(String name, int size) {

        public void bark(int times) {

        }

        public void play() {

        }
    }
}