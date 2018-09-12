

public class Dog extends Animal implements Comparable<Dog>{

	public Dog(String n, int x){
		super(n,x);
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
	@Override 
	public int compareTo(Dog d){
		return this.legs-this.legs;
	}
}
