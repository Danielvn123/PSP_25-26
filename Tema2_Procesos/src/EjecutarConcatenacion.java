import java.io.IOException;

public class EjecutarConcatenacion {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "ConcatenarTexto");

            pb.inheritIO();

            Process proceso = pb.start();

            int exitCode = proceso.waitFor();

            System.out.println("El proceso terminó con código: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
