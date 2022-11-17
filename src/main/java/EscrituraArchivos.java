import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraArchivos {

    //Escritura de archivo

    public static String writeFile (String filename, String text)
            throws IOException {

        FileWriter writer = new FileWriter(filename);
        writer.write(text);
        writer.close();

        return text.toString();

    }

    public static void main(String[] args) {

        String windowsPath = "C:\\Users\\natal\\OneDrive\\Documentos\\Prueba.txt";
        String text = null;

        try {
            writeFile(windowsPath, "Holii");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (text != null){
            JOptionPane.showMessageDialog(null, text);
        }

    }
}
