public class App {
    public static void main(String[] args) {
        String choice = "";
        String exitString = "3";

        while(!choice.equals(exitString)) {
            GUI.showMenu();
            choice = Engine.getKeyboardValue();

            switch (choice) {
                case "1" -> {}
                case "2" -> {}
                case "3" -> {break;}
            }
        }

    }
}
