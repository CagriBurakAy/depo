
public abstract class Seabird implements IFloatable, IFlyable {
	private String color;
	private String voice;
	private boolean wings;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public boolean hasWings() {
		return wings;
	}
	public void setWings(boolean wings) {
		this.wings = wings;
	}
	
	public abstract void sing();
	public abstract void wave();
}
