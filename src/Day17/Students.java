package Day17;

import java.io.Serializable;

public class Students implements Serializable {
	int id;
	String name;
	int marks;
	
	Students(int id, String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}
