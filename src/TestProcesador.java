import java.util.Scanner;

/**
 * Clase TestProcesador que contiene el método main para iniciar el programa.
 * Permite al usuario ingresar un texto inicial y acceder al menú del procesador
 * de texto.
 * 
 * @author Gaysper
 * @version 1.00
 */
public class TestProcesador {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("\nBienvenido al Procesador de Texto\n" +
                "\nPor favor, ingrese el texto inicial:");
        String textoInicial = scanner.nextLine();
        if (textoInicial == null || textoInicial.isEmpty() || textoInicial.matches("\\d+")) {
            System.err.println("El texto no puede estar vacío ni ser un número. Saliendo del programa.");
            return;
        }
        MenuProcesador menu = new MenuProcesador(textoInicial);
        menu.mostrarMenu();
    }
}
