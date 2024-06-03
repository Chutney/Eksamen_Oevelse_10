public class BMI {

    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight/Math.pow(height,2);
    }


    public boolean isUnderWeight() {
        return calculateBMI() < 18.5;
    }

    public boolean isOverWeight() {
        return calculateBMI() > 25;
    }

    public boolean isNormalWeight() {
        return (!isOverWeight() && !isUnderWeight());
    }

}
