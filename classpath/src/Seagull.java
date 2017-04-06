
public class Seagull extends Seabird {	

	public Seagull() {

	}
	
	public Seagull(String color, String voice, boolean wings) {
		this.setColor(color);
		this.setVoice(voice);
		this.setWings(wings);
	}

	@Override
	public void dive() {
		System.out.println("Seagull dives into the sea!");

	}

	@Override
	public void swim(int length) {
		System.out.println("Seagull swims " + length + "m  in the sea!");

	}

	@Override
	public void surface() {
		System.out.println("Seagull surfaces!");

	}

	@Override
	public void takeOff() {
		if(hasWings())
			System.out.println("Seagull starts flying!");
		else
			System.out.println("Seagull has no wings!");

	}

	@Override
	public void fly(int length) {
		if(hasWings())
			System.out.println("Seagull flies " + length + "m  in the air!");
		else
			System.out.println("Seagull has no wings!");

	}

	@Override
	public void land() {
		if(hasWings())
			System.out.println("Seagull landed!");
		else
			System.out.println("Seagull has no wings!");

	}

	@Override
	public void sing() {
		System.out.println("Seagull says " + getVoice());

	}

	@Override
	public void wave() {
		if(hasWings())
			System.out.println("Seagull waves!");
		else
			System.out.println("Seagull has no wings!");
		
	}

}
