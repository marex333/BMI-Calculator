public class GUI {
    private static String o1 = "1. Oblicz BMI\n";
    private static String o2 = "2. Przypomnij BMI\n";
    private static String o3 = "3. Exit";
    private static double savedBMI = 0;

    public static double getSavedBMI() {
        return savedBMI;
    }

    public static void setSavedBMI(double savedBMI) {
        GUI.savedBMI = savedBMI;
    }

    public static void showMenu() {
        System.out.println(o1 + o2 + o3 + "\n\n\n //////////////////////////////////////////////////");
    }

    public static void incorrectChoice() {
        System.out.println("Incorrect choice. Try again!");
    }

    public static void showOption1Height() {
        System.out.println(o1 + "Podaj swój wzrost[cm]: ");
    }
    public static void showOption2() {
        System.out.println(o2 + "Podaj swoje ID: ");
    }
    public static void showOption2Answer() {
        System.out.println("Twoje BMI wynosi: ");
    }

    public static void showOption1Weight() {
    System.out.println("Podaj swóją wagę[kg]: ");
    }
    public static void showSavedBMI() {
        System.out.println(getSavedBMI());
    }
    public static void showBMIMeaning (int bmiCode) {
        switch (bmiCode) {
            case 1 -> System.out.println("Niedowaga!");
            case 2 -> System.out.println("Norma!");
            case 3 -> System.out.println("Nadwaga!");
            case 4 -> System.out.println("Otyłość!");
        }
    }
}
