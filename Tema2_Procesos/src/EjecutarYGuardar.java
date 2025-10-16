import java.io.File;
import java.io.IOException;

public class EjecutarYGuardar {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "ConcatenarTexto");

            pb.redirectOutput(new File("Texto_Procesado.txt"));
            pb.redirectError(new File("Texto_Procesado.txt"));
            pb.redirectInput(ProcessBuilder.Redirect.INHERIT);

            Process proceso = pb.start();
            int exitCode = proceso.waitFor();

            System.out.println("El proceso terminó con código: " + exitCode);
            System.out.println("La salida se guardó en Texto_Procesado.txt");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
