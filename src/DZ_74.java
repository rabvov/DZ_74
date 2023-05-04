import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class DZ_74 {
    public static void main(String[] args) throws FileNotFoundException {
        String str;
        int n = 5;
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\rak15\\IdeaProjects\\DZ_74\\File");

        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++) {
                str = scanner.next();
                if (str.length()>n){
                    byte [] b = str.getBytes();
                    fileOutputStream.write(b);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
scanner.close();
    }
}
