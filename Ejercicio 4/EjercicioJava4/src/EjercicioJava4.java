/*
La mediana de una lista de n numeros se define como el valor que es menor o igual que los valores correspondientes a la
mitad de los numeros, y mayor o igual que los valores correspondientes a la otra mitad.Por ejemplo la mediana de:
16 12 99 95 18 87 10
es 18 porque este valor es menor a 99,95 y 87(mitad de los numeros) y mayor que 16,12 y 10 (otra mitad)
Realizar un programa que lea un numero impar de valor y de como resultado la mediana.La entrada de valor finalizara cuando
se detecte la marca de fin de fichero

 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioJava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos que va a tener la lista: ");
        int nElementos = sc.nextInt();
        if (nElementos%2 == 0){
            System.out.println("Ingrese otro valor, la lista debe de ser impar");
        }
        else {
            ArrayList<Integer>listaMediana = new ArrayList<>();
            int num;
            for (int i = 0; i < nElementos; i++) {
                System.out.println("Ingrese un elemento a la lista: ");
                num  = sc.nextInt();
                listaMediana.add(num);
            }
            System.out.println(listaMediana);
            Collections.sort(listaMediana);
           int mitad = listaMediana.size() - 1;
            int mitad2 = mitad/2;

            System.out.println("La mediana de la lista es: " + listaMediana.get(mitad2));
        }

    }
}
