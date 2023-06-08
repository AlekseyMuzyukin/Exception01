import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example01 {
        public static void main(String[] args) {
        try {
            arraySize(null);
//            arraySize(new int[]{1,2,3});
            arithmeticException(10, 0);
//            arithmeticException(10, 1);
            fileReader("filenotfound.txt");
        }
        catch (NullPointerException nP){
            System.out.println(nP.getMessage());
        }
        catch (ArithmeticException aE){
            System.out.println(aE.getMessage());
        }
        catch (FileNotFoundException fNF){
            System.out.println(fNF.getMessage());
        }
    }

    public static int arraySize(int[] array){
        return array.length;
    }
    public static int arithmeticException(int number1, int number2){
        return number1 / number2;
    }
    public static void fileReader(String fileName) throws FileNotFoundException {
        FileReader fr = new FileReader(fileName);
        try {
            String newStr = String.valueOf(fr.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}