
public class Start {

	public static void main(String[] args) {
		System.out.println("Hello");
        System.out.println(show1());
        Simple s1 = new Simple();
        Simple s2 = new Simple(3);
        Simple s3 = new Simple(99999);
        System.out.println(s1.a+ " " +s1.f);
        System.out.println(s2.a+ " " +s2.f);
       
	}

	private static int show1(){
		return 1;
	}
		
	}

class Simple{  
	 int a=10;  
	 float f=a;
	 int showConst;
      Simple(){   
    	  show(1);
		}
      
      	
      Simple(int b){
    	  this.a=b;
    	  show(2);
		}  
	     
		static void show(int g){
			System.out.println("call from class "+ g );
		}
	
	}  

