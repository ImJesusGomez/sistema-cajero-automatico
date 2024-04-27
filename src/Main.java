import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Importamos la clase scanner para ingresar datos del usuario
        Scanner s = new Scanner(System.in);

        // Declaremos una variable que nos ayudara a continuar el ciclo for
        int eleccion = 0;

        // Declaramos variables que usaremos en el sistema
        double saldo = 0;
        double dineroDepositar;
        double dineroRetirar;

        // Damos la bienvenida al usuario
        System.out.println("------- Bienvenido al Sistema de Cajero Automático -------\n");

        // Usamos un ciclo while para elaborar el proceso de acciones del cajero automático
        while(eleccion != 4){
            // Presentamos al usuario el menú de opciones
            System.out.println("\n------- Menú -------");
            System.out.println("""
                    Opciones:\s
                    1. Consultar el saldo de la cuenta.
                    2. Depositar dinero en la cuenta.
                    3. Retirar dinero de la cuenta.
                    4. Salir del programa.""");

            // Le pedimos al usuario que ingrese una opción
            System.out.println("Elige una opción: ");
            eleccion = s.nextInt();

            // Usamos un condicional para ejecutar las acciones del cajero automático
            if(eleccion == 1){
                System.out.println("Elección: Consultar Saldo");
                System.out.println("Saldo: $" + saldo);
                System.out.println("... Volviendo al menú principal");

            } else if(eleccion == 2){
                System.out.println("Elección: Depositar dinero");
                System.out.println("¿Cuánto dinero deseas depositar?");
                dineroDepositar = s.nextDouble();
                saldo = saldo + dineroDepositar;
                System.out.println("Deposito exitoso de $" + dineroDepositar);
                System.out.println("... Volviendo al menú principal");
            } else if (eleccion == 3) {
                System.out.println("Elección: Retirar dinero");
                System.out.println("¿Cuánto dinero deseas retirar?");
                dineroRetirar = s.nextDouble();

                if(dineroRetirar > saldo){
                    System.out.println("Cantidad de dinero inválida");
                    System.out.println("...Volviendo al menú principal");
                } else {
                    saldo = saldo - dineroRetirar;
                    System.out.println("Retiro exitoso de $" + dineroRetirar);
                    System.out.println("Saldo actual: $" + saldo);
                    System.out.println("... Volviendo al menú principal");
                }
            //En caso de que el usuario ingrese una opcián inválida, por ejemplo mayor a 4 se le mostrará que es una elección invalida
            } else{
                System.out.println("Elección Inválida!!");
            }
        }

        // Terminamos el programa
        System.out.println("\nGracias por usar el Sistema de Cajero Automático");
    }
}