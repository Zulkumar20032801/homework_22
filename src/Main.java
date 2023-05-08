import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String []alphabet={ "Aa\n",  "Bb\n" ,"Cc\n" , "Dd\n" ,
                "Ee\n" , "Ff\n" , "Gg\n" , "Hh\n" , "Ii\n",
                "Jj\n" , "Kk\n" , "Ll\n" , "Mm\n" , "Nn\n",
                "Oo\n" , "Pp\n" , "Qq\n" , "Rr\n" , "Ss\n" ,
                "Tt\n" , "Uu\n" , "Vv\n" , "Ww\n" , "Xx\n" ,
                "Yy\n" , "Zz\n" ,

                "0\n", "1\n","2\n","3\n","4\n","5\n","6\n","7\n","8\n","9\n"};

        try(FileWriter fileWriter=new FileWriter("alphabet.txt")){
            for (String a:alphabet) {

                fileWriter.write(a);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileReader fileReader = new FileReader("alphabet.txt")) {
            try (Scanner scanner = new Scanner(fileReader)) {
                int a = 1;
                while (scanner.hasNext()) {
                    while (a <= alphabet.length) {
                        System.out.println(a + "." + scanner.nextLine());
                        a++;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}