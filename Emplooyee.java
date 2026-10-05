package D_S_Assignment;

public class Emplooyee {
    private int Id;
    private String First_name;
    private String last_name;
    private  double salary;


    //Constructure

    public Emplooyee(int id, String First_name, String last_name, double salary){
        this.Id = id;
        this.First_name = First_name;     // This can be used:
        this.last_name = last_name;       // A: To call an overloaded constructor.
        this.salary = salary;             // B: To access a private field in setters and constructor body.
    }
    public int getId(){
        return Id;
    }
    public String getFirst_name(){
        return First_name;
    }
    public  String getLast_name(){
        return last_name;
    }

    public String getFul_Name(){
        return First_name+ " " + last_name;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getAnualSalary(){
        return salary*12;
    }

    public double raiseSalary(double percent){
        double amount = salary* (percent / 100) + salary;
        return amount;
    }

    public String toString(){
        return "Employee:" + "\nID: " + Id + "\nName: "+ getFul_Name()+ "\nsalary: "+salary;
    }



}



class Test{
    public static void main(String[] args) {
        Emplooyee e1 = new Emplooyee(1, "Abdirahman","Ahmed",2500);
        System.out.println(e1);

    }
}


