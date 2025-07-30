package castingApp;

class cat {
	void sound() {
		System.out.println("Meow");
	}

}
class Tiger extends cat{
	void sound() {
		System.out.println("Roar");
	}
	void food() {
		System.out.println("Non veg");	
	}
}	
public class Animal {
	
	public static void main(String[] args) {
		cat c; //reference variable
		c = new cat();
		c.sound();
		c = new Tiger();
		c.sound();
		//class casting
		((Tiger)c).food();
	}
}
