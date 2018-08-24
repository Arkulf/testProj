
public class Bird extends Animal {
	double wingSpan; // cm

	Bird(String name, String gender, int weight) {
		super(name, gender, weight);
		// TODO Auto-generated constructor stub

		calcWingspan(this.gender, this.weight);

	}

	private void calcWingspan(String gender, int weight) {
		// TODO Auto-generated method stub

		if (gender.equals("Male")) {
			wingSpan = 5 + (weight / 10);
		} else {
			wingSpan = 3.14;
		}
	}

	public String toString() {
		return "This bird " + this.name + "is a: " + this.gender + " its weigt is: " + this.weight
				+ "g and its wingspan is " + wingSpan + "cm";
	}

}
