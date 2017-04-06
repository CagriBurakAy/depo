
public class BlackCormorant extends Seabird {
	
	public BlackCormorant() {

	}
	

	public BlackCormorant(String color, String voice, boolean wings) {
		this.setColor(color);
		this.setVoice(voice);
		this.setWings(wings);
	}

	@Override
	public void dive() {
		System.out.println("Black Cormorant dives into the sea!");

	}

	@Override
	public void swim(int length) {
		System.out.println("Black Cormorant swims " + length + "m  in the sea!");

	}

	@Override
	public void surface() {
		System.out.println("Black Cormorant surfaces!");

	}

	@Override
	public void takeOff() {
		if(hasWings())
			System.out.println("Black Cormorant starts flying!");
		else
			System.out.println("Black Cormorant has no wings!");

	}

	@Override
	public void fly(int length) {
		if(hasWings())
			System.out.println("Black Cormorant flies " + length + "m  in the air!");
		else
			System.out.println("Black Cormorant has no wings!");

	}

	@Override
	public void land() {
		if(hasWings())
			System.out.println("Black Cormorant landed!");
		else
			System.out.println("Black Cormorant has no wings!");

	}

	@Override
	public void sing() {
		System.out.println("Black Cormorant says " + getVoice());

	}

	@Override
	public void wave() {
		if(hasWings())
			System.out.println("Black Cormorant waves!");
		else
			System.out.println("Black Cormorant has no wings!");
		
	}

}
