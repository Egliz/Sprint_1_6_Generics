package Level_2.Ex1_PartialGenerics;

public class GenericMethods {
        public static <T, V> void printElements(String fixedElement, T element2, V element3) {
            System.out.println("Element 1: " + fixedElement + " Element 2: " + element2 + " Element 3: " + element3);
        }
    }


