import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();
        StringBuilder stringBuilder = new StringBuilder(result);
        String reverse = stringBuilder.reverse().toString();
        printSomething(reverse);
        System.out.println(outputStream);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
