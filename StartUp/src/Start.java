import java.io.IOException;
import java.util.ArrayList;
import java.util.Random; 
public class Start {

  //       animals = new String[10];
         static String[] animals = { 
        		    "Dog", "cat", "Pig",
        		    "Horse", "Cow", "Elephant", 
        		    "Crocodile","Bull","Bird","Ant","Mouse"
        		};
         static String[] names;
         static Random rand = new Random();
         static int x=0;
         static ArrayList<Animal> zoo = new ArrayList<Animal>();
         
	public static void main(String[] args) {
		        
        ReadToArray rFile = new ReadToArray();
        try {
			names=rFile.readLines("namesList.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
        
        while (x<rand.nextInt(100)){
        createAnimals(x, rand.nextInt(10),names[rand.nextInt(908)]);
        x++;}
	}

		
	//Method Create animals
	
			private static void createAnimals(int no,int antype, String name){				
			zoo.add(new Animal(animals[antype],name,rand.nextInt(1000)));
			}			
	
}  

