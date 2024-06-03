public class Main {

    public static void main(String[] args) {
        BMI bmi = new BMI(100, 1.82);


        System.out.println(bmi.calculateBMI());
        System.out.println("Underweight: "+bmi.isUnderWeight());
        System.out.println("Overweight: "+bmi.isOverWeight());
        System.out.println("Normalweight: "+bmi.isNormalWeight());
    }


}
