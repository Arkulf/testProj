
public class Cow extends Animal{
	double tailLength; // cm

	Cow(String name, String gender, int weight) {
		super(name, gender, weight);
		
		calcWingspan(this.gender, this.weight);

	}

	private void calcWingspan(String gender, int weight) {
		// TODO Auto-generated method stub

		if (gender.equals("Male")) {
			tailLength = 5 + (weight / 10);
		} else {
			tailLength = 3.14;
		}
	}

	public String toString() {
		return "This Cow " + this.name + "is a: " + this.gender + " its weigt is: " + this.weight
				+ "kg and its tail length is " + tailLength + "cm";
	}
}
