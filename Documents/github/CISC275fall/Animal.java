
public class Animal{
	String name;
	int legs;
	public Animal(String n, int x){
		this.name=n;
		this.legs=x;
	}
	public String getName(){
		return name;
	}
	public int getLegs(){
		return legs;
	}
	public String toString(){
		return name+legs;
	}
}
