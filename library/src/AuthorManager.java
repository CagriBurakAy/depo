import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorManager {
	private List<Author> authorList;
	
	public AuthorManager(String filename) throws Exception {
		Scanner scanner = new Scanner(new File(filename));
		
		this.authorList = new ArrayList<Author>();
		while (scanner.hasNext()) {
			Author author = new Author();
			author.setId(scanner.nextInt());
			author.setName(scanner.next());
			author.setSurname(scanner.next());
			authorList.add(author);
		}
		
		scanner.close();
	}
	
	public void printAuthors() {
		for (Author author : this.authorList) {
			System.out.println(author);
		}
	}
	
	public List<Author> search(String name) {
		ArrayList<Author> list = new ArrayList<Author>();
		for (Author author : this.authorList) {
			if (author.getName().toUpperCase().contains(name.toUpperCase()) ||
				author.getSurname().toUpperCase().contains(name.toUpperCase())) {
				list.add(author);
			}
		}
		return list;
	}
}
