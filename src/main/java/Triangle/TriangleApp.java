package Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {

    static int theNumber;
//    private static int anInt;

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);

    }

    private static int triangle(int n) {
        System.out.println("Entering: n = " + n);
        if (n == 1) {
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = n + triangle(n - 1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }

    public static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
