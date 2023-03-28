package ejerciocio1C;
import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class Ej1C {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"¡¡¡Bienvenidos!!!");
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        String letra = JOptionPane.showInputDialog("Bien, ahora ingrese una letra para para mostrarlos ordenados: \n"+"a-ascendente\n"+"d-descendente\n");

        Ordenar(num1,num2,num3,letra);

    }
    public static void Ordenar(int num1, int num2, int num3, String caracter){
        Integer numeros[]={num1,num2,num3};
        caracter = caracter.toLowerCase();

        if(caracter.equals("a")){
            Arrays.sort(numeros);
            JOptionPane.showMessageDialog(null,numeros);

        } else if (caracter.equals("d")) {
            Arrays.sort(numeros, Comparator.reverseOrder());
            JOptionPane.showMessageDialog(null,numeros);

        }else {
            JOptionPane.showMessageDialog(null,caracter+" No es una opcion ingresada no es valida");
        }
    }
}
