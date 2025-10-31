import java.util.Scanner;

/**
 * Clase MenuProcesador que representa el menú del procesador de texto.
 * Permite interactuar con el usuario y gestionar las opciones del procesador.
 * 
 * @author Gaysper
 */
public class MenuProcesador {
    private ProcesadorTexto procesador;
    private Scanner scanner;

    /**
     * Constructor que inicializa el menú con un texto dado.
     * 
     * @param texto El texto a procesar.
     */
    public MenuProcesador(String texto) {
        this.procesador = new ProcesadorTexto(texto);
        this.scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú y gestiona las opciones del usuario controlando que op sea un
     * entero.
     * 
     */
    public void mostrarMenu() {
        int op = -1;
        while (op != 0) {
            System.out.println("\n==============================\n" +
                    "|| Menú Procesador de Texto ||\n" +
                    "==============================\n" +
                    "|     1. Contar palabras     |\n" +
                    "------------------------------\n" +
                    "|   2. Contar caracteres     |\n" +
                    "------------------------------\n" +
                    "|    3. Buscar palabra       |\n" +
                    "------------------------------\n" +
                    "| 4. Convertir a mayúsculas  |\n" +
                    "------------------------------\n" +
                    "| 5. Convertir a minúsculas  |\n" +
                    "------------------------------\n" +
                    "|     6. Añadir caracter     |\n" +
                    "------------------------------\n" +
                    "|  7. Mostrar frase actual   |\n" +
                    "------------------------------\n" +
                    "|          0. Salir          |\n" +
                    "==============================\n" +
                    "Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("\nPor favor, ingrese un número válido:");
                scanner.nextLine();
            }
            op = scanner.nextInt();
            scanner.nextLine();
            gestionarOpcion(op);
        }
    }

    /**
     * Gestiona la opción seleccionada por el usuario.
     * 
     * @param op La opción seleccionada.
     */
    public void gestionarOpcion(int op) {
        switch (op) {
            case 1:
                System.out.println("\nNúmero de palabras: " + procesador.contarPalabras());
                break;
            case 2:
                System.out.println("\nNúmero de caracteres: " + procesador.contarCaracteres());
                break;
            case 3:
                System.out.print("\nIngrese la palabra a buscar: ");
                String palabra = scanner.nextLine();
                int posicion = procesador.buscarPalabra(palabra);
                if (posicion != -1) {
                    System.out.println("\nLa palabra se encuentra en la posición: " + posicion);
                } else {
                    System.out.println("\nLa palabra no se encontró.");
                }
                break;
            case 4:
                procesador.convertirAMayusculas();
                System.out.println("\nTexto convertido a mayúsculas.");
                break;
            case 5:
                procesador.convertirAMinusculas();
                System.out.println("\nTexto convertido a minúsculas.");
                break;
            case 6:
                System.out.print("Ingrese el carácter a añadir: ");
                char caracter = scanner.nextLine().charAt(0);
                System.out.print("Ingrese la posición donde añadir el carácter: ");
                int posicionAnyadir = scanner.nextInt();
                scanner.nextLine();
                procesador.anyadirCaracter(caracter, posicionAnyadir);
                System.out.println("\nCarácter añadido.");
                break;
            case 7:
                System.out.println("\nFrase actual: " + procesador.obtenerTexto());
                break;
            case 0:
                System.out.println("\nSaliendo del programa.");
                break;
            default:
                System.out.println("\nOpción no válida. Intente de nuevo.");
        }
    }

}
