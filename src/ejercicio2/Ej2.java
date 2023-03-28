package ejercicio2;
import javax.swing.*;
import java.io.*;
import java.io.BufferedReader;

public class Ej2 {
    public static void main(String[] args) {

        String archivo = "carpetaDeArchivo\\numeros.txt";
        int suma = 0;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = entrada.readLine())!= null) {
                String[] numeros = linea.split("[,\\s]+");
                for (String num : numeros) {
                    suma += Integer.parseInt(num);
                }
            }
            JOptionPane.showMessageDialog(null,"La Suma del archivo es: "+suma);

        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo");
        } catch (IOException e) {
            System.out.println("no se encontro el archivo");
        }

    }
}
