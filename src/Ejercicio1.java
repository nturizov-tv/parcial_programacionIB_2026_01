import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Ingrese el valor total de la compra");
        double valorTotal = scanner.nextDouble();
        System.out.println("El valor total de la compra es de: "+valorTotal);
        scanner.close();
        double descuento;
        double valorDescontado;
        double valorFinal;

        if (valorTotal<50.000) {
            System.out.println("Usted no tiene descuento");
            System.out.println("Su total a pagar es de: "+valorTotal);
        }else if (valorTotal>=50.000 && valorTotal<=99.999) {
            descuento=valorTotal*((5/100)-valorTotal);
            System.out.println("TIENE DESCUENTO DEL 5%");
            System.out.println("Su descuento es de: "+descuento);
            valorDescontado= valorTotal-descuento;
            System.out.println("Se le ha descontado "+valorDescontado);
            valorFinal=valorTotal-valorDescontado;
            System.out.println("Su valor final a pagar es: "+valorFinal);
            System.out.println("Su total a apagar es de: ");
        }else if (valorTotal>=100.000 && valorTotal<=199.999) {
            descuento=valorTotal*((10/100)-valorTotal);
            System.out.println("TIENE DESCUENTO DEL 10%");
            System.out.println("Su descuento es de: "+descuento);
            valorDescontado= valorTotal-descuento;
            System.out.println("Se le ha descontado "+valorDescontado);
            valorFinal=valorTotal-valorDescontado;
            System.out.println("Su valor final a pagar es: "+valorFinal);
        }else if (valorTotal>=200.000) {
            descuento=valorTotal*((15/100)-valorTotal);
            System.out.println("TIENE DESCUENTO DEL 15%");
            System.out.println("Su descuento es de: "+descuento);
            valorDescontado= valorTotal-descuento;
            System.out.println("Se le ha descontado "+valorDescontado);
            valorFinal=valorTotal-valorDescontado;
            System.out.println("Su valor final a pagar es: "+valorFinal);
        
        }
    }
}
