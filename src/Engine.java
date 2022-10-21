import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine {
    public static double bmiCalculator(double height, double weight) {
        GUI.setSavedBMI(weight / Math.sqrt(height/100));
        return (weight / Math.sqrt(height/100));
    }
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
