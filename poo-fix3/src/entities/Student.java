package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double finalGrade(){
        return n1 + n2 + n3;
    }
    public void verify(){
        System.out.println("FINAL GRADE: " + finalGrade());

        if (finalGrade() > 60){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60 - finalGrade()) + " POINTS");
        }
    }
}
