import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Start {

	// animals = new String[10];
	static String[] animals = { "Dog", "cat", "Pig", "Horse", "Cow", "Elephant", "Crocodile", "Bull", "Bird", "Ant",
			"Mouse" };
	static String[] gender = { "Male", "Female" };
	static String[] names;
	static Random rand = new Random();
	static int x = 0;
	static ArrayList<Animal> zoo = new ArrayList<Animal>();

	public static void main(String[] args) {

		ReadToArray rFile = new ReadToArray();
		try {
			names = rFile.readLines("namesList.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		while (x < rand.nextInt(100)) {
			createAnimals(x, rand.nextInt(10), names[rand.nextInt(908)]);
			x++;
		}
		int a = 0;
		for (Animal tmpAnimal : zoo) {
			a++;
			System.out.println("djur " + a + ": " + tmpAnimal.toString());
		}

	}

	// Method Create animals

	private static void createAnimals(int no, int antype, String name) {
		int gix = rand.nextInt(2);
		if (animals[antype].equals("Bird")) {
			zoo.add(new Bird(name, gender[gix], rand.nextInt(100)));}
			
			else if (animals[antype].equals("Cow")) {
				zoo.add(new Cow(name, gender[1], rand.nextInt(100)));	
			
		} else {
			zoo.add(new Animal(name,animals[antype],gender[gix], rand.nextInt(1000)));
		}
	}

}
