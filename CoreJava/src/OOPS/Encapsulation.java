package OOPS;

public class Encapsulation {

    String student_name;
    int roll_no;
    char grade;

    void display(){
        System.out.println(student_name);
        System.out.println(roll_no);
        System.out.println(grade);
    }


    void setStudent_name(String name){
        this.student_name = name;
    }

    void setRoll_no(int roll_no_student){
        this.roll_no = roll_no_student;
    }

    void setGrade(char grade_obtained){
        this.grade = grade_obtained;
    }

    String getStudent_name(){
        return student_name;
    }
    int getRoll_no(){
        return roll_no;
    }
    char getGrade(){
        return grade;
    }


    public static void main(String[] args) {
        Encapsulation ec = new Encapsulation();
        ec.setStudent_name("Goutham");
        ec.setRoll_no(17);
        ec.setGrade('A');
        ec.display();
    }

}
