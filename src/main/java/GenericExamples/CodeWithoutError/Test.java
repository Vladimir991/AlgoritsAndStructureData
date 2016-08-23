package GenericExamples.CodeWithoutError;

public class Test {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(10);
        System.out.println(value1);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello Java with Generics!");
        System.out.println(value2);

        String string = value2.getValue();
    }
}
