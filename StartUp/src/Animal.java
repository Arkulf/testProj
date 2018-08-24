
public class Animal {
	String name, gender,type;
	int weight;

	Animal(String name, String gender, int weight) {
		this.gender=gender;
		this.name = name;
		this.weight = weight;

	}

	
	public Animal(String name, String type, String gender, int weight) {
		this.gender=gender;
		this.name = name;
		this.weight = weight;
		this.type = type;
	}


	public String toString() {
		return "A " + type + " Namn: " + this.name + " Gender: " + this.gender + " vikt: " + this.weight+"g";
	}

}
