import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

public class Method3 {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the reader
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line1 = br.readLine();
            String line2 = br.readLine();

            if (line1 == null || line2 == null) {
                System.err.println("Error: input.txt must contain at least two lines.");
                return;
            }

            int a = Integer.parseInt(line1);
            int b = Integer.parseInt(line2);
            int result = a * b;
            System.out.println("Result = " + result);

        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error: input.txt contains non-integer data. Please ensure both lines are valid numbers.");
        }
    }
}
