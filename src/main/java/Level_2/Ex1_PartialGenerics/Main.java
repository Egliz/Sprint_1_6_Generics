package Level_2.Ex1_PartialGenerics;

public class Main {
    public static void main(String[] args) {


        Person person = new Person("Mari", "Rivera",36);
        GenericMethods.printElements("Hello world", person, 20);

        GenericMethods.printElements("ABC", 1.20, true);
    }
}
