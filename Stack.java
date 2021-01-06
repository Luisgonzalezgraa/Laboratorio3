
import java.util.Scanner;


public class Stack {
    public static void main(String[] args) {

        int opcionIngresada1 = 0;
        Scanner opcionIngresada;
        System.out.println("####BIENVENIDO HA SIMULADOR DE STACK-OVERFLOW##########");
        System.out.println("1. Registrarse");
        System.out.println("2. Ingresar");
        while (opcionIngresada1 != 6){
            System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ###");
            System.out.println("## Registrado como: User123 ##");
            System.out.println("Escoja su opción: ");
            System.out.println("1. Agregar nueva pregunta");
            System.out.println("2. Responder pregunta");
            System.out.println("3. Dar recompensa");
            System.out.println("4. Aceptar respuesta");
            System.out.println("5. Cerrar sesión");
            System.out.println("6. Salir del programa ");
            System.out.println("INTRODUZCA SU OPCIÓN: ");
            opcionIngresada = new Scanner(System.in);
            opcionIngresada1 = opcionIngresada.nextInt();
            switch(opcionIngresada1)
            {
                case 1:
                    System.out.println("####FIN DE SIMULACIÓN####");
                    break;
                case 2:
                    System.out.println("####FIN DE SIMULACIÓN####");
                    break;
                case 3:
                    System.out.println("####FIN DE SIMULACIÓN####");
                    break;
                case 4:
                    System.out.println("####FIN DE SIMULACIÓN####");
                    break;
                case 5:
                    System.out.println("####FIN DE SIMULACIÓN#####");
                    break;
                case 6:
                    System.out.println("####FIN DE SIMULACIÓN#####");
                    break;
                default:
                    System.out.println("Opción ingresada invalida.");
                    break;
            }
        }
    }
}
