import java.util.ArrayList;
import java.util.Collections;

public class List {

public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Student> slist=new ArrayList<Student>();
slist.add(new Student("Naina", 19, 2));
slist.add(new Student("Bhavatha", 22, 3));
slist.add(new Student("Karunya", 21,5 ));
slist.add(new Student("Sharanya", 26, 1));
/*Sorting based on name*/
System.out.println("Sorting collection based on Name:");
Collections.sort(slist, Student.NameComparator);

for(Student str:slist) {
System.out.println(str);
}


/*Sorting based on age*/
System.out.println("Sorting collection based on Age:");
Collections.sort(slist, Student.Age);

for(Student str:slist) {
System.out.println(str);
}

/*Sorting based on id*/
System.out.println("Sorting collection based on Id:");
Collections.sort(slist, Student.Id);

for(Student str:slist) {
System.out.println(str);
}



}



}