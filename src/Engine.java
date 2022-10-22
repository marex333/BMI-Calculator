import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine {

    public static String getKeyboardValue () {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        }
        catch (IOException exception) {
            return  "";
        }
    }
}
