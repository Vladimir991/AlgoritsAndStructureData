package GenericExamples.CodeWithError;

public class Test {
    public static void main(String[] args) {
        BoxPrinter value1 = new BoxPrinter(10);
        System.out.println(value1);
        Integer intValue1 = (Integer) value1.getValue();

        BoxPrinter value2 = new BoxPrinter("Hello Java!");
        System.out.println(value2);

        Integer intValue2 = (Integer) value2.getValue();
    }
}
