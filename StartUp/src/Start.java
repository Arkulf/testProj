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
		System.out.println("Hello");
        System.out.println(show1());
        Simple s1 = new Simple();
        Simple s2 = new Simple(3);
        Simple s3 = new Simple(99999);
        System.out.println(s1.a+ " " +s1.f);
        System.out.println(s2.a+ " " +s2.f);
        System.out.println(s3.a+ " " +s3.f);
        
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
        
     
      //  for (Animal z : zoo)
      //     System.out.print( z.getTyp());
      //     System.out.println();
	}

		
	//Method Create animals
	
			private static void createAnimals(int no,int antype, String name){
				
			zoo.add(new Animal(animals[antype],name,rand.nextInt(1000)));
			}
			
	
	private static int show1(){
		return 1;
	}
		
	}

//Another class in same file
class Simple{  
	// Variable declaration
	int a=10;  
	 float f=a;
	 int showConst;
	 static int instCnt =0;
	 //Constructor 1
      Simple(){   
    	  show(1);
    	  instCnt++;
		}
      
    //Constructor 2 	
      Simple(int b){
    	  this.a=b;
    	  show(2);
    	  instCnt++;
		}  
	 // method show   
		static void show(int g){
			System.out.println("call from class "+ g + " No of inst= " + instCnt);
		}
		
		
		
		
	}  

