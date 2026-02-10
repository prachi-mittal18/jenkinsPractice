import java.io.BufferedReader;
import java.io.FileReader;
public class Method3 {
    public static void main(String[] args) {
     

      BufferedReader br = new BufferedReader(new FileReader("input.txt"));
int a = Integer.parseInt(br.readLine());
int b = Integer.parseInt(br.readLine());



        int result = Integer.parseInt(a) / Integer.parseInt(b);
        System.out.println("Result = " + result);
    }
}


