
public class Animal {
	String typ,namn;
	int vikt;
Animal(String typ, String namn, int vikt){
	this.typ=typ;
	this.namn=namn;
	this.vikt=vikt;
	
	System.out.println("A "+ typ + " called " + namn + " is created its weight is " + vikt+ "kg");
	
}
}
