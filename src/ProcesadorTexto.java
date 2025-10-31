/**
 * Clase para procesar, manipular y analizar textos.
 * 
 * @author Gaysper
 */
public class ProcesadorTexto {

    private String frase;

    /**
     * Constructor que inicializa el procesador con un frase dado.
     * 
     * @param frase El frase a procesar.
     */
    public ProcesadorTexto(String frase) {
        this.frase = frase;
    }

    /**
     * Cuenta el número de palabras en el frase.
     * 
     * @return El número de palabras.
     */
    public int contarPalabras() {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }
        String[] palabras = frase.trim().split("\\s+");
        return palabras.length;
    }

    /**
     * Contar el número de caracteres en el frase.
     * 
     * @return El número de caracteres.
     */
    public int contarCaracteres() {
        if (frase == null || frase.isEmpty()) {
            return 0;
        }
        return frase.trim().length();
    }

    /**
     * Busca una palabra completa y especifica su posición en el frase, ignorando
     * mayúsculas
     * y minúsculas.
     * Si la palabra no se encuentra, devuelve -1
     * 
     * @param palabra La palabra a buscar.
     * @return La posición de la palabra o -1 si no se encuentra.
     */

    /*
     * Esta forma de buscar la palabra encuentra subcadenas, no palabras completas.
     * 
     * public int buscarPalabra(String palabra) {
     * if (frase == null || frase.isEmpty() || palabra == null || palabra.isEmpty())
     * {
     * return -1;
     * }
     * return frase.toLowerCase().indexOf(palabra.toLowerCase());
     * }
     */
    public int buscarPalabra(String palabra) {
        if (frase == null || frase.isEmpty() || palabra == null || palabra.isEmpty()) {
            return -1;
        }
        String[] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Convierte el frase a mayúsculas modificando el atributo frase.
     */
    public void convertirAMayusculas() {
        if (frase != null) {
            frase = frase.toUpperCase();
        }
    }

    /**
     * Convierte el frase a minúsculas modificando el atributo frase.
     */
    public void convertirAMinusculas() {
        if (frase != null) {
            frase = frase.toLowerCase();
        }
    }

    /**
     * Añade un caracter en la posición especificada.
     * 
     * @param caracter El caracter a añadir.
     * @param posicion La posición en la que se añadirá el caracter.
     */
    public void anyadirCaracter(char caracter, int posicion) {
        if (frase != null && posicion >= 0 && posicion <= frase.length()) {
            frase = frase.substring(0, posicion) + caracter + frase.substring(posicion);
        }
    }

    /**
     * Devuelve el frase actual, similar a un getter.
     * 
     * @return El frase.
     */
    public String obtenerTexto() {
        return frase;
    }
}
