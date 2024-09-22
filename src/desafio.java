import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "corriente";
        double saldo = 1599.99;

        System.out.println("***********");
        System.out.println("\nNombre del cliente " + nombre);
        System.out.println("El tipo de cuenta es " + tipoDeCuenta);
        System.out.println("Su saldo disponible es " + saldo);
        System.out.println("""
                \nElija una operacion:
                1. Ver saldo
                2. Depositar dinero
                3. Retirar dinero 
                9. Salir""");

        Scanner teclado = new Scanner(System.in);
        int operacion = teclado.nextInt();
        switch (operacion) {
            case 1:
                System.out.println("Su saldo disponible es " + saldo);
                System.out.println("\nGracias por utilizar nuestros servicios");
                break;
            case 2:
                System.out.println("ingrese monto a depositar ");
                double deposito = teclado.nextDouble();
                saldo += deposito;
                System.out.println("Su saldo disponible es " + saldo);
                System.out.println("\nGracias por utilizar nuestros servicios");
                break;
            case 3:
                System.out.println("ingrese monto a retirar ");
                double retiro = teclado.nextDouble();
                if (saldo < retiro) {
                    System.out.println("Saldo insuficiente");
                    System.out.println("\nGracias por utilizar nuestros servicios");
                }else {
                    saldo -= retiro;
                }
                System.out.println("Su saldo disponible es " + saldo);
                System.out.println("\nGracias por utilizar nuestros servicios");
                break;
            case 9:
                System.out.println("\nSaliendo... Gracias por utilizar nuestros servicios");
            default:
                System.out.println("Opcion no valida");
                System.out.println("\nGracias por utilizar nuestros servicios");

        }
    }
}
