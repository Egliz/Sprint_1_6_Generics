package Level_2.Ex2_GenericVarargs;

public class GenericVarargs {

    @SafeVarargs
    public static <T> void printAll(String fixedElement, T... elements) {
        System.out.println("Fixed element: " + fixedElement);
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
