package ejercicio3;
import java.io.*;
import java.nio.*;
import javax.swing.*;

public class Ej3 {
    public static void main(String[] args) {

        String palabra = JOptionPane.showInputDialog(null,"¡¡¡BIENVENIDOS!!!\n"+"Ingrese la palabra: ");
        int desplazar = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero de desplazo: "));
        String repuesta = JOptionPane.showInputDialog(null,"Que desea realiza? \n"+"c-Codificar \n"+"d-Decodificar");
        repuesta.toLowerCase();
//Guardamos  en el archivo entradas , lo ingresado en palabra
        ManejoArchivo.escrbirArchivo("carpetaDeArchivo\\entradas.txt",palabra);

        String palabracodificada ;
        String palabraDecodificar ;
//codificamos o decodificamos y gardamos en el archivo salidas
        if (repuesta.equals("c") || repuesta.equals("codificar")){
            palabracodificada = CodYDesco.Codificar(palabra,desplazar);
            ManejoArchivo.escrbirArchivo("carpetaDeArchivo\\salidas.txt", palabracodificada);
            JOptionPane.showMessageDialog(null,"La operacion se realizo con exito!");
        } else if (repuesta.equals("d") || repuesta.equals("decodificar")){
            palabraDecodificar = CodYDesco.Decodificar(palabra,desplazar);
            ManejoArchivo.escrbirArchivo("carpetaDeArchivo\\salidas.txt", palabraDecodificar);
            JOptionPane.showMessageDialog(null,"La operacion se realizo con exito!");

        }

    }
}
