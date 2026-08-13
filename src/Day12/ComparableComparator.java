package Day12;
import java.util.*;

class Students implements Comparable<Students>{
	
	int ID;
	String Name;
	int marks;
	
	Students(int ID, String Name, int marks){
		this.ID = ID;
		this.Name = Name;
		this.marks = marks;
	}

	@Override
	public int compareTo(Students other) {
		
		return this.ID - other.ID;
	}
	
	void display() {
		System.out.println(ID + " " + Name + " " + marks);
	}
}

public class ComparableComparator {
	
	public static void main(String[] args) {
		ArrayList<Students> students = new ArrayList<>();
		
		students.add(new Students(101,"Akash",98));
		students.add(new Students(105,"Kalith",85));
		students.add(new Students(104,"Ibrahim",89));
		students.add(new Students(103,"Dhavamani",90));
		
		Collections.sort(students);
		
		for (Students s : students) {
			s.display();
		}
		
	}

}
