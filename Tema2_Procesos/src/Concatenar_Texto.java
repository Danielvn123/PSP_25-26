import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Concatenar_Texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        String concatenado = cadena1 + " " + cadena2;

        try (FileWriter writer = new FileWriter("Texto_Concatenado.txt")) {
            writer.write(concatenado);
            System.out.println("Texto concatenado guardado en Texto_Concatenado.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
