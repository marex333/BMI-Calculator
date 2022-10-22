package DataBase;

import Model.BMI;
import java.util.ArrayList;

public class BMIDB {
    private ArrayList<BMI> bmiArrayList = new ArrayList<>();

    public ArrayList<BMI> getBmiArrayList() {
        return bmiArrayList;
    }
    public double findByID (int id) {
        for (BMI bmi : bmiArrayList) {
            if (bmi.getID() == id) {
                return bmi.getBmi();
            }
        }
        return 0;
    }
    public void addToBMIDB (BMI bmi) {
        bmiArrayList.add(bmi);
    }

}
