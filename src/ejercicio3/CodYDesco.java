package ejercicio3;

public class CodYDesco {

    public static String Codificar(String texto, int numero){
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        texto = texto.toLowerCase();
        String cod = "";
        char caracter ;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            int posicion = abc.indexOf(caracter);
            if (posicion != -1) {
                cod += abc.charAt((posicion + numero) % abc.length());
            }
        }
        return cod;

    }
    public static String Decodificar(String texto, int numero){
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        texto = texto.toLowerCase();
        String decod = "";
        char caracter ;
        for (int i = 0; i < texto.length(); i++) {
            caracter = texto.charAt(i);
            int posicion = abc.indexOf(caracter);
            if (posicion + numero < 0) {
                decod += abc.charAt(abc.length() + (posicion - numero));
            }else {
                decod += abc.charAt((posicion - numero) % abc.length());
            }
        }
        return decod;

    }

}
