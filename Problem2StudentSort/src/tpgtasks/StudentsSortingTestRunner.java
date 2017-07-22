package tpgtasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student {
		public Student(int id, String name, double gPA) {
			super();
			this.id = id;
			this.name = name;
			GPA = gPA;
		}
		int id;
		String name;
		double GPA;
		
		
}
class StudentComparor implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
    	if (s1.GPA == s2.GPA){
			if (s1.name.equals(s2.name)){
				if (s1.id == s2.id)
					return 0;
				else
					return s1.id < s2.id ? -1 : 1;
			}else{
				return s1.name.compareTo(s2.name);
			}
		}else{
			return s1.GPA > s2.GPA ? -1 : 1;
		}
    }
}
public class StudentsSortingTestRunner {

	
	public static void main(String[] args) {
		List<Student> student_list = new ArrayList<Student>();
		//generate some test data
		student_list.add(new Student(33, "Tina", 3.68));
		student_list.add(new Student(85, "Louis", 3.85));
		student_list.add(new Student(56, "Samil", 3.75));
		student_list.add(new Student(19, "Samar", 3.75));
		student_list.add(new Student(24, "Lorry", 3.76));
		student_list.add(new Student(19, "Lorry", 3.76));
		 System.out.println("Before Sorting:");
		   for(Student student: student_list){
				System.out.println(student.GPA + " " + student.name+ " " + student.id);
			}
		Collections.sort(student_list,new StudentComparor());

		   /* Sorted List*/
		   System.out.println("After Sorting:");
		   for(Student student: student_list){
				System.out.println(student.GPA + " " + student.name+ " " + student.id);
			}
	}

}
