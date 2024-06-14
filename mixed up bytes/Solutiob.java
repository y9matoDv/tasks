import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
            var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
            var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] byteIn = inputStream.readAllBytes();
            byte[] byteOut = new byte[byteIn.length];
            for (int i = 0; i < byteIn.length; i += 2) {
                if (i < byteIn.length - 1) {
                    byteOut[i] = byteIn[i + 1];
                    byteOut[i + 1] = byteIn[i];
                } else {
                        byteOut[i] = byteIn[i];
                    }
            }
                outputStream.write(byteOut);
        }catch (IOException e){
                    System.out.println("Something went wrong : " + e);
        }
    }
}
