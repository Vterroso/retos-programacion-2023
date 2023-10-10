import java.util.Scanner;

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, escriba el texto a encriptar: ");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine().toLowerCase();
        String textoEncriptado = "";
        for (int i = 0; i < texto.length(); i++) {
            switch (texto.charAt(i)) {
                case 'a':
                    textoEncriptado += "4";
                    break;
                case 'b':
                    textoEncriptado += "I3";
                    break;
                case 'c':
                    textoEncriptado += "[";
                    break;
                case 'd':
                    textoEncriptado += ")";
                    break;
                case 'e':
                    textoEncriptado += "3";
                    break;
                case 'f':
                    textoEncriptado += "|=";
                    break;
                case 'g':
                    textoEncriptado += "&";
                    break;
                case 'h':
                    textoEncriptado += "#";
                    break;
                case 'i':
                    textoEncriptado += "1";
                    break;
                case 'j':
                    textoEncriptado += "_|";
                    break;
                case 'k':
                    textoEncriptado += "|<";
                    break;
                case 'l':
                    textoEncriptado += "1";
                    break;
                case 'm':
                    textoEncriptado += "|\\/|";
                    break;
                case 'n':
                    textoEncriptado += "|\\|";
                    break;
                case 'o':
                    textoEncriptado += "0";
                    break;
                case 'p':
                    textoEncriptado += "|>";
                    break;
                case 'q':
                    textoEncriptado += "9";
                    break;
                case 'r':
                    textoEncriptado += "|2";
                    break;
                case 's':
                    textoEncriptado += "5";
                    break;
                case 't':
                    textoEncriptado += "7";
                    break;
                case 'u':
                    textoEncriptado += "|_|";
                    break;
                case 'v':
                    textoEncriptado += "\\/";
                    break;
                case 'w':
                    textoEncriptado += "\\/\\/";
                    break;
                case 'x':
                    textoEncriptado += "><";
                    break;
                case 'y':
                    textoEncriptado += "`/";
                    break;
                case 'z':
                    textoEncriptado += "2";
                    break;
                case '0':
                    textoEncriptado += "o";
                    break;
                case '1':
                    textoEncriptado += "L";
                    break;
                case '2':
                    textoEncriptado += "R";
                    break;
                case '3':
                    textoEncriptado += "E";
                    break;
                case '4':
                    textoEncriptado += "A";
                    break;
                case '5':
                    textoEncriptado += "S";
                    break;
                case '6':
                    textoEncriptado += "b";
                    break;
                case '7':
                    textoEncriptado += "T";
                    break;
                case '8':
                    textoEncriptado += "B";
                    break;
                case '9':
                    textoEncriptado += "g";
                    break;
                default:
                    textoEncriptado += texto.charAt(i);
                    break;
            }
        }
        System.out.println(textoEncriptado);
    }
}
