package Level_1.Ex2_GenericMethods;

public class Main {
    public static void main(String[] args) {


        Person person = new Person("Mari", "Rivera",36);
        GenericMethods.printElements(person, "Hello world", 20);

        GenericMethods.printElements(1.20, "ABC", true);
    }
}
