package org.example;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

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

    //Escritura de archivo

    public static String writeFile (String filename, String text)
            throws IOException {

        FileWriter writer = new FileWriter(filename);
        writer.write(text);
        writer.close();

        return text.toString();

    }


    public static void main(String[] args) {

        //String windowsPath = "C:\\Users\\natal\\OneDrive\\Documentos\\archivoProg.txt";
        String windowsPath = "C:\\Users\\natal\\OneDrive\\Documentos\\Prueba.txt";

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