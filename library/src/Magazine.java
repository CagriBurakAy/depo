
public class Magazine extends Item {
private String issn;
private int month;
public Magazine() {
}
	public Magazine(int Id, String name, String publisher,String issn,int month) {
		super(Id, name, publisher);
		this.issn=issn;
		this.month=month;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String toString() {
		return "Magazine [id=" + super.getId() // It is the same usage as writing getId() here
		+ ", name=" + super.getName() 
		+ ", publisher=" + super.getPublisher() 
		+ ", ISSN=" + issn
		+ ", month=" + month + "]";
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (issn == null) {
			if (other.issn != null)
				return false;
		} else if (!issn.equals(other.issn))
			return false;
		if (month != other.month)
			return false;
		return true;
	}
}

