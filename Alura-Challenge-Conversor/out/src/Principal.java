import java.io.IOException;
import java.util.Scanner;

public class Principal {


    public static void main(String[] args) throws IOException, InterruptedException {

        String origen = null;
        String destino = null;
        String cantidad = null;
        int opcion = 0;
        int salida;

        while (opcion != 7) {
            System.out.println("Bienvenido al Conversor de moneda\n");

            System.out.println("1) Convertir Dólar a Peso Argentino");
            System.out.println("2) Peso Argentino a Dólar");
            System.out.println("3) Dólar a Real Brasileño");
            System.out.println("4) Real Brasileño a Dólar");
            System.out.println("5) Dólar a Peso Colombiano");
            System.out.println("6) Peso Colombiano a Dólar");
            System.out.println("7) Salir");

            Scanner eleccion = new Scanner(System.in);
            opcion = eleccion.nextInt();

            ConsultaValorDeConversion consulta = new ConsultaValorDeConversion();
            Moneda moneda = consulta.buscaValor("USD", "ARS", "20");


            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la cantidad que deseas convertir");
                    Scanner cantidadConvertir = new Scanner(System.in);
                    cantidad = cantidadConvertir.nextLine();
                    moneda = consulta.buscaValor("USD", "ARS", cantidad);
                    System.out.println("El valor de su conversion es " + moneda.conversion_result());
                    break;

                case 2:
                    System.out.println("Ingresa la cantidad que deseas convertir");
                    cantidadConvertir = new Scanner(System.in);
                    cantidad = cantidadConvertir.nextLine();
                    moneda = consulta.buscaValor("ARS", "USD", cantidad);
                    System.out.println("El valor de su conversion es " + moneda.conversion_result());
                    break;

                case 3:
                    System.out.println("Ingresa la cantidad que deseas convertir");
                    cantidadConvertir = new Scanner(System.in);
                    cantidad = cantidadConvertir.nextLine();
                    moneda = consulta.buscaValor("USD", "BRL", cantidad);
                    System.out.println("El valor de su conversion es " + moneda.conversion_result());
                    break;

                case 4:
                    System.out.println("Ingresa la cantidad que deseas convertir");
                    cantidadConvertir = new Scanner(System.in);
                    cantidad = cantidadConvertir.nextLine();
                    moneda = consulta.buscaValor("BRL", "USD", cantidad);
                    System.out.println("El valor de su conversion es " + moneda.conversion_result());
                    break;

                case 5:
                    System.out.println("Ingresa la cantidad que deseas convertir");
                    cantidadConvertir = new Scanner(System.in);
                    cantidad = cantidadConvertir.nextLine();
                    moneda = consulta.buscaValor("USD", "COP", cantidad);
                    System.out.println("El valor de su conversion es " + moneda.conversion_result());
                    break;

                case 6:
                    System.out.println("Ingresa la cantidad que deseas convertir");
                    cantidadConvertir = new Scanner(System.in);
                    cantidad = cantidadConvertir.nextLine();
                    moneda = consulta.buscaValor("COP", "USD", cantidad);
                    System.out.println("El valor de su conversion es " + moneda.conversion_result());
                    break;

                default:
                    System.out.println("Opción inválida");
            }
//dollar a peso argentino, peso argentino a dolar, dolar a real brasileno, real brasileno a dolar, dolar a peso colombiano, peso colombiano a dolar.

        }
    }

}