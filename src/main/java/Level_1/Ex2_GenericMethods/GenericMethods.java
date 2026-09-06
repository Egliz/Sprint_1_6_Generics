package Level_1.Ex2_GenericMethods;

public class GenericMethods {

    public static <T, U, V> void printElements(T element1, U element2, V element3) {

        System.out.println("Element 1:" + element1 + "Element 2: " + element2 + "Element 3: " + element3);
    }
}
