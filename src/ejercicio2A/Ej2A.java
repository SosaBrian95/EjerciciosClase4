package ejercicio2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej2A {
    public static void main(String[] args) {

        String archivo = "carpetaDeArchivo\\numeros.txt";
        int suma = 0;
        int multiplicacion = 1;

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = entrada.readLine())!= null) {
                String[] numeros = linea.split("[,\\s]+");
                for (String num : numeros) {
                    suma += Integer.parseInt(num);
                    multiplicacion *= Integer.parseInt(num);
                }
            }

            String resputesta = JOptionPane.showInputDialog(null,"¡¡¡BIENVENIDOS!!!\n"+"Desea ver la suma o la multiplicacion del archivo?: \n a-Suma \n b-Multiplicar");
            resputesta.toLowerCase();
            if (resputesta.equals("a")) {
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
            } else if (resputesta.equals("b")) {
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);
            } else {
                JOptionPane.showMessageDialog(null, "la respuesta: "+resputesta+" no es valida");
            }

        } catch (FileNotFoundException e) {
            System.out.println("no se encontro el archivo");
        } catch (IOException e) {
            System.out.println("no se encontro el archivo");
        }

    }

}
