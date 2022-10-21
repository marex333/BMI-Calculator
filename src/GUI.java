public class GUI {
    private static String s1 = "1. Oblicz BMI\n";
    private static String s2 = "2. Przypomnij BMI\n";
    private static String s3 = "3. Exit";
    private static double savedBMI = 0;

    public static double getSavedBMI() {
        return savedBMI;
    }

    public static void setSavedBMI(double savedBMI) {
        GUI.savedBMI = savedBMI;
    }

    public static void showMenu() {
        System.out.println(s1+s2+s3);
    }
}
