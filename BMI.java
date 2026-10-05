package D_S_Assignment;

public class BMI {
    // Fields
    private String name;
    private int age;
    private double weight;
    private double height;

    // Constructors
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    // Methods
    public double getBMI() {
        double bmi = (weight * 703) / (height * height);
        return Math.round(bmi * 100.0) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}


class TestBMI {
    public static void main(String[] args) {
        BMI p1 = new BMI("Ali", 20, 145, 70);
        System.out.println("Name is: " + p1.getName());
        System.out.println("BMI is: " + p1.getBMI());
        System.out.println("Status is: " + p1.getStatus());

        System.out.println("------------------------------------");

        BMI p2 = new BMI("Aisha", 215, 68); 
        System.out.println("Name is: " + p2.getName());
        System.out.println("Age is: " + p2.getAge());
        System.out.println("BMI is: " + p2.getBMI());
        System.out.println("Status is: " + p2.getStatus());
    }
}
