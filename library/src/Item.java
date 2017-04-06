
import java.util.Scanner;

public class Item {
 public	static Scanner scanner;
	private int Id;
	private  String name;

	private String publisher;
	public Item() {
	}
	public Item(int Id, String name, String publisher) {
		
		this.setId(Id);
		this.setName(name);
	
		this.setPublisher(publisher);
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}
	
}