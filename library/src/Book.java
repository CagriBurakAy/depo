

public class Book extends Item{

	private String isbn;
	private int authorId;

	private  int publishYear;
	public Book() {
	}
	
	public Book(int id,String name,String publisher,String isbn, int authorId, int publishYear) {
		super(id, name, publisher);
		this.isbn = isbn;
		this.authorId = authorId;
		this.publishYear = publishYear;

	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn +"ID="+getId()+ ", authorId=" + authorId + ", name=" + getName() + ", publishYear=" + publishYear
				+ ", publisher=" + getPublisher() + "]";
	}	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorId != other.authorId)
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (publishYear != other.publishYear)
			return false;
		return true;
	}

}