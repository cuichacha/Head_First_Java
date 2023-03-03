package making_objects;

/**
 * @author Will Dufresne
 * @Date: 2023-03-03 20:10
 * @Description: The dog class in making objects section
 */
public class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff! Ruff!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.size = 40;
        dog.bark();
    }
}