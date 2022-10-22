package Model;

import DataBase.BMIDB;
import java.util.Random;

public class BMI {
    private double heightCM;
    private double heightM;
    private double weightKG;
    private double bmi;
    private int id;

    public BMI(double heightCM, double weightKG, BMIDB bmidb) {
        this.heightCM = heightCM;
        this.weightKG = weightKG;
        heightM = heightCM / 100;
        id = generateID(bmidb);
        bmi = calculateBMI();
    }

    public double getHeightM() {
        return heightM;
    }

    public double getBmi() {
        return bmi;
    }

    public void setHeightM(double heightM) {
        this.heightM = heightM;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }

    private double calculateBMI() {
        return weightKG / Math.pow(heightM, 2);
    }

    private int generateID(BMIDB bmidb) {
        Random random = new Random();
        boolean copyFlag = false;
        do {
            copyFlag = false;
            this.setID(random.nextInt(1000000000));
            for (BMI bmi : bmidb.getBmiArrayList()) {
                if (bmi.getID() == this.getID()) {
                    copyFlag = true;
                }
            }
        } while (copyFlag) ;
        return getID();
    }
    public static int bmiMeaning(double bmi) {
        if (bmi < 25) return 1;
        if (bmi < 30) return 2;
        if (bmi < 40) return 3;
        return 4;
    }
}
