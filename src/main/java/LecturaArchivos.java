import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;

public class LecturaArchivos {

    //Lectura de archivo
    public static String readFile(String filename)
            throws FileNotFoundException {

        StringBuilder text = new StringBuilder();
        File file = new File(filename);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()){
            text.append(reader.nextLine());
            text.append(System.lineSeparator());


        }
        reader.close();
        return text.toString();

    }

    public static void main(String[] args) {

        String windowsPath = "C:\\Users\\natal\\OneDrive\\Documentos\\archivoProg.txt";
        String text = null;

        try {
            text= readFile(windowsPath);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if (text != null){
            JOptionPane.showMessageDialog(null, text);
        }
    }
}
