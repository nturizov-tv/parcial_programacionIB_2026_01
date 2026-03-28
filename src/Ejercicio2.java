import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double promedio;
        int contador = 0;
        int[] dias = new int[7];
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Ingrese el valor de venta de cada dia");
            dias[i] = scanner.nextInt();
        }
        for (int i = 0; i < dias.length; i++) {
            System.out.println("DIAS: " + dias[i]);
            if (dias[i]>100.000) {
                contador=contador+1;
                System.out.println("Los dias con ventas");
            }
        }
        
        scanner.close();
    }
}
