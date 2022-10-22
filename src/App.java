import DataBase.BMIDB;
import Model.BMI;

public class App {
    public static void main(String[] args) {
        BMIDB bmidb = new BMIDB();
        String choice = "";
        String exitString = "3";

        while(!choice.equals(exitString)) {
            GUI.showMenu();
            choice = Engine.getKeyboardValue();

            switch (choice) {
                case "1" -> {
                    GUI.showOption1Height();
                    double height = Double.parseDouble(Engine.getKeyboardValue());
                    GUI.showOption1Weight();
                    double weight = Double.parseDouble(Engine.getKeyboardValue());
                    BMI bmi = new BMI(height, weight, bmidb);
                    bmidb.addToBMIDB(bmi);
                    GUI.showOption2Answer();
                    System.out.println(bmi.getBmi() + "\n" +
                                        "STATUS: ");
                    GUI.showBMIMeaning(BMI.bmiMeaning(bmi.getBmi()));
                    System.out.println("Twoje ID: " + bmi.getID());
                    System.out.println();
                }
                case "2" -> {
                    double bmi;
                    GUI.showOption2();
                    bmi = bmidb.findByID(Integer.parseInt(Engine.getKeyboardValue()));
                    GUI.showOption2Answer();
                    System.out.println(bmi);
                    System.out.println("STATUS: ");
                    GUI.showBMIMeaning(BMI.bmiMeaning(bmi));
                    System.out.println();

                }
                case "3" -> {break;}
                default -> GUI.incorrectChoice();
            }
        }

    }
}
