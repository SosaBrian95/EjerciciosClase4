package ejercicio3;

import java.io.*;

public class ManejoArchivo {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se creo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void escrbirArchivo(String nombreArchivo,String contenidoArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenidoArchivo);
            salida.close();
            System.out.println("Se escribio el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String leer = entrada.readLine();
            while (leer != null) {
                System.out.println(leer);
                leer = entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }


    public static void eliminarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("El archivo se elimino");
    }

}
