package Level_1.Ex1_NoGenericMethods;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods noGenericM1 = new NoGenericMethods("One", "Two", "Three");
        NoGenericMethods noGenericM2 = new NoGenericMethods("Three", "One", "Two");

        System.out.println(noGenericM1.getElement1() + ", " + noGenericM1.getElement2() + ", " + noGenericM1.getElement3());
        System.out.println(noGenericM2.getElement1() + ", " + noGenericM2.getElement2() + ", " + noGenericM2.getElement3());

    }

}
