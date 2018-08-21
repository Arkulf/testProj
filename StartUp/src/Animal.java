
public class Animal {
	String typ,namn;
	int vikt;
Animal(String typ, String namn, int vikt){
	this.typ=typ;
	this.namn=namn;
	this.vikt=vikt;
	
	System.out.println("A "+ typ + " called " + namn + " is created its weight is " + vikt+ "kg");
	
}
public String getTyp() {
	return typ;
}
public void setTyp(String typ) {
	this.typ = typ;
}
public String getNamn() {
	return namn;
}
public void setNamn(String namn) {
	this.namn = namn;
}
public int getVikt() {
	return vikt;
}
public void setVikt(int vikt) {
	this.vikt = vikt;
}
}
