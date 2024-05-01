
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leitura {

    public String entDados(String rotulo) {

        System.out.println(rotulo);
        String ret = "";

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

       
        try {
            ret = buff.readLine();
        } catch (IOException ioe) {
            System.out.println("\nERRO\n");
        }
        return ret;


      
    }

}
