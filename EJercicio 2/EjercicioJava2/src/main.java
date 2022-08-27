 /*Se desea realizar un histograma con los pesos de los alumnos de un determinado curso

PESO        Numero de alumnos
21          **
22          ****
23          ***************
24          ******
..          ..
El numeros de asteriscos se corresponde con el numero de alumnos del peso especificado

Realizar un programa que lea los pesos e imprima el histograma correspondiente.Suponer que los pesos estan comprendidos entre
los valores 10 y 100 kg. En el histograma solo apareceran los pesos que correspondan con 1 o mas alumnos
 */


 import java.util.Scanner;

 public class main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int nEstudiantes = sc.nextInt();
        System.out.println("PESO");
        for (int i = 0; i < nEstudiantes; i++) {
            System.out.println("Ingrese el peso del "+i+" estudiante: ");
            int pesoEstudiante = sc.nextInt();
        }
    }
}

