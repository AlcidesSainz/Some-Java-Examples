import java.util.Scanner;
/*Realice un programa que calcule e imprima los multiplos de 7 que existen entre 2 numeros m y n
* (siendo estos ingresados por el teclado),validar que no permita ingresar valores negativos para m y n, y si m es mayor
* que n, entonces los valores se intercambian */
public class main {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de m: ");
        m = sc.nextInt();
        System.out.println("Ingrese el valor de n: ");
        n = sc.nextInt();

        multiploSiete(m, n);
    }
    public static void comprobarValores(int m, int n){
        if (m>n){
            int aux;
            aux = m;
            m = n;
            n = aux;
            System.out.println("El valor de m ahora es: " + m);
            System.out.println("El valor de n ahora es: " + n);
            multiploSiete(m,n);
        }
    }
    public static void multiploSiete(int m,int n){
        if (m<0 || n<0){
            System.out.println("Uno de los numeros ingresados es negativo, intente ingresarlos una vez mas");
        }else {
            comprobarValores(m,n);
            for (int i = m; i < n; i++) {
                if (i%7==0){
                    System.out.println(i + " es multiplo de 7");
                }
            }
        }

    }

}
