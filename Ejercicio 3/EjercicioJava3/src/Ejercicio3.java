/*Realice  un programa que lea una cadena de n caracteres e imprima el resultado que se obtiene cada vez que se realice una
* rotacion de caracter a la derecha sobre dicha  cadena. El proceso finalizara cunado se haya obtenido nuevamente la cadena
* de caracteres original
* Ejemplo:
* HOLA  AHOL    LAHO    OLAH    HOLA */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese una cadena: ");
        String cadena = sc.next();

        System.out.println(cadena);
        for (int i = 0; i < cadena.length(); i++) {
            cadena = cadena.substring(1) + cadena.charAt(0);
            System.out.println(cadena);
        }



    }
}
