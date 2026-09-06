package Level_2.Ex2_GenericVarargs;

public class GenericVarargs {

    public static <T> void printAll(T... elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}
