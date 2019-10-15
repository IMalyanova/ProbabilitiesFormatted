import java.io.*;

public class ProbabilitiesFormatted {

    public static void main(String[] args) throws IOException {
        String letter = "";
        String path = "D:/Projects/10/пункт3/Probabilities.txt";
        String fileFormatted = "D:/Projects/10/пункт3/Probabilities formatted.txt";

        FileInputStream stream = new FileInputStream(path);
        PrintWriter pw = new PrintWriter(fileFormatted);

        for (;;){
            int code = stream.read();
            if (code < 0){
                break;
            }
            char c = (char) code;
            letter = letter + String.valueOf(c);
        }

        String array[] = letter.split("\t");
        for (String element : array){
            if (element.length() < 11){
                int item = 11 - element.length();
                for (int i = 0; i < item; i++ ){
                    element = element + " ";
                }
            }
            pw.write(" |   " + element);
            System.out.print(element);
        }
        pw.flush();
        pw.close();

    }
}
