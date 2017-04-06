
public class Author {
	private int id;
	private String aname;
	private String surname;
	
	public Author(int id, String aname, String surname) {
		this.id = id;
		this.aname = aname;
		this.surname = surname;
	}
	public Author() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return aname;
	}
	public void setName(String aname) {
		this.aname = aname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + aname + ", surname=" + surname + "]";
	}

	
}
