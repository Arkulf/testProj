
public class Start {

	
	
	public static void main(String[] args) {
		System.out.println("Hello");
        System.out.println(show1());
        Simple s1 = new Simple();
        Simple s2 = new Simple(3);
        Simple s3 = new Simple(99999);
        System.out.println(s1.a+ " " +s1.f);
        System.out.println(s2.a+ " " +s2.f);
        System.out.println(s3.a+ " " +s3.f);
        
        Animal a1 = new Animal("Dog","Bullen",33); 
       
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

