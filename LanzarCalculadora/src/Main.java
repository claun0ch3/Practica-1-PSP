import java.io.*;

public class Main {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        try {
            String[] comando = {"Calculadora.jar"};
            Process p = rt.exec(comando);

            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linea = "";

            while ((linea = br.readLine()) != null) { // Si la linea no es null, la muestra
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error de E/S");
        }
    }
}