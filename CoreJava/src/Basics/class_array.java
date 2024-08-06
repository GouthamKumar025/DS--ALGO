import java.util.*;

class Student{
    String name;
    int age;
}

public class Main
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Goutham";
		s1.age = 17;
		
		
		Student s2 = new Student();
		s2.name = "Ram";
		s2.age = 16;
		
		Student student[] = new Student[3];
		student[0] = s1;
		student[1] = s2;
		for(int i=0;i<student.length;i++){
		   System.out.println(student[i].name + " " + student[i].age);
		}
	}
}
