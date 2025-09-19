import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-jar", "..\\Calculadora_jar\\Calculadora.jar");
            Process proceso = pb.start();

            InputStream is = proceso.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linea = "";
            linea = br.readLine();
            System.out.println(linea);
            linea = br.readLine();
            System.out.println(linea);

            OutputStream os = proceso.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(3 + "\n");
            bw.flush();
            linea = br.readLine();
            System.out.println(linea);
            bw.write(3 + "\n");
            bw.flush();
            linea = br.readLine();
            System.out.println(linea);
            bw.write('+' + "\n");
            bw.flush();
            linea = br.readLine();
            System.out.println(linea);


        } catch (IOException e) {
            System.err.println("Error al lanzar la calculadora: " + e.getMessage());
        }
    }
}