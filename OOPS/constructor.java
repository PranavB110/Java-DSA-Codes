
public class constructor {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Pranav");
		Student s3 = new Student(123);
		Student s4 = new Student("Bhakare", 23);
		

	}

}

class Student {
	int roll;
	String name;
	
	Student(){
		System.out.println("If i am not created then also by default I get created...just dont do anything");
		System.out.println("I dont have return type");
		}
	
	Student(int roll){
		this.roll = roll;
	}
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	}

