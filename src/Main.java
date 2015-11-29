import java.util.Scanner;

/**
 * Created by mac on 14/08/2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Interpreter interpreter = new Interpreter();

        while (true) {
            String line = s.nextLine();
            interpreter.parse(line);
        }
    }
}
