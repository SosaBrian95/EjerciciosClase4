package ejercicio1B;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class Ej1B {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hola, Bienvenidos ingrese 3 valores numericos: ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer valor: "));
        String letra = JOptionPane.showInputDialog("Bien, ahora ingrese una letra para para mostrarlos ordenados: \n"+"a-ascendente\n"+"d-descendente\n");
        letra = letra.toLowerCase();
        Integer numeros[]={num1,num2,num3};

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
