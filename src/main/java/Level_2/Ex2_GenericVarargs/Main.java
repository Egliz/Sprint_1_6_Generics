package Level_2.Ex2_GenericVarargs;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Mari", "Rivera",36);
        GenericVarargs.printAll("Hello world", person, 20);

        GenericVarargs.printAll("ABC", 1.20, true);
    }
}
