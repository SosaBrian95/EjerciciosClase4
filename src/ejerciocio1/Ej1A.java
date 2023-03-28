package ejerciocio1;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.*;

public class Ej1A {
    public static void main(String[] args) {
        Integer numeros[]={15,20,78};
        String letra = JOptionPane.showInputDialog("Hola,Ingrese ingrese una letra para para mostrarlos ordenados: \n"+"a-ascendente\n"+"d-descendente\n");
        letra = letra.toLowerCase();

        if(letra.equals("a")){
            Arrays.sort(numeros);
            JOptionPane.showMessageDialog(null,numeros);

        } else if (letra.equals("d")) {
            Arrays.sort(numeros, Comparator.reverseOrder());
            JOptionPane.showMessageDialog(null,numeros);

        }else {
            JOptionPane.showMessageDialog(null,letra+" No es una opcion ingresada no es valida");
        }

    }

}

