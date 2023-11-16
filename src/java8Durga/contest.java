package java8Durga;

public class contest {
public static void main(String[] args) {
		
		StudentCon c=(name,rollnum,marksofstudent,age)->new StudentConRef(name, rollnum, marksofstudent, age);
		
		StudentCon s=StudentConRef::new;
		StudentConRef studentCon = s.get("Naresh Yadav", 45, 79, 25);
		System.out.println(studentCon);

}
}