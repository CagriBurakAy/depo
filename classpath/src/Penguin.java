
public class Penguin extends Seabird {
	
	public Penguin() {

	}
	
	public Penguin(String color, String voice, boolean wings) {
		this.setColor(color);
		this.setVoice(voice);
		this.setWings(wings);
	}

	@Override
	public void dive() {
		System.out.println("Penguin dives into the sea!");

	}

	@Override
	public void swim(int length) {
		System.out.println("Penguin swims " + length + "m  in the sea!");

	}

	@Override
	public void surface() {
		System.out.println("Penguin surfaces!");

	}

	@Override
	public void takeOff() {
		System.out.println("Penguins cannot fly :(");

	}

	@Override
	public void fly(int length) {
		System.out.println("Penguins cannot fly :(");

	}

	@Override
	public void land() {
		System.out.println("Penguins cannot fly :(");

	}

	@Override
	public void sing() {
		System.out.println("Penguin says " + getVoice());

	}

	@Override
	public void wave() {
		if(hasWings())
			System.out.println("Penguin waves!");
		else
			System.out.println("Penguin has no wings!");

	}

}
