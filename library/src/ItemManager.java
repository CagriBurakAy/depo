	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
public class ItemManager {
	private int count = 0;

		private List<Book> bookList;
		private List<Magazine> magazineList;
		public ItemManager(String bookFile, String magazineFile) throws Exception {
			Scanner scanner = new Scanner(new File(bookFile));
			
			bookList = new ArrayList<Book>();
			while (scanner.hasNext()) {
				Book book = new Book();
				book.setIsbn(scanner.next());
				book.setAuthorId(scanner.nextInt());
				book.setName(scanner.next());
				book.setPublishYear(scanner.nextInt());
				book.setPublisher(scanner.next());
				count++;
				book.setId(count);
				bookList.add(book);
			}
			scanner.close();
			Scanner scan = new Scanner(new File(magazineFile));
			

		magazineList = new ArrayList<Magazine>();
		while (scan.hasNext()) {
			Magazine magazine = new Magazine();
			magazine.setName(scan.next());
			magazine.setPublisher(scan.next());
			magazine.setIssn(scan.next());
			magazine.setMonth(scan.nextInt());
			count++;
			magazine.setId(count);
			magazineList.add(magazine);
		}
		scan.close();
		}
		public void printBookList() {
			for (Book book : bookList) {
				System.out.println(book);
			}
		}

		public Book search(String isbn) {
			for (Book book : this.bookList) {
				if(book.getIsbn().toUpperCase().contains(isbn.toUpperCase()))
					return book;
			}
			return null;
		}
		public List<Book> search(String publisher , int syear, int eyear){
			ArrayList<Book> found=new ArrayList<Book>();
			for(Book book:bookList){
				if(book.getPublisher().equalsIgnoreCase(publisher)&&book.getPublishYear()>syear&&book.getPublishYear()<eyear)
					found.add(book);
			}
			return found;}
			public List<Magazine> searchMagazine(String name, int month){
				ArrayList<Magazine> found=new ArrayList<Magazine>();
				for(Magazine magazine:magazineList){
					if(magazine.getName().equalsIgnoreCase(name)&&magazine.getName().equalsIgnoreCase(name)&&magazine.getMonth()==month)
						found.add(magazine);
				}
				return found;
		}
			public List<Magazine> searchMagazineByName(String name){
				ArrayList<Magazine> found=new ArrayList<Magazine>();
				for(Magazine magazine:magazineList){
					if(magazine.getName().equalsIgnoreCase(name)&&magazine.getName().equalsIgnoreCase(name))
						found.add(magazine);
				}
				return found;
		}
		public Book searchBook (String name) {
			for (Book book : this.bookList) {
				if (book.getName().toUpperCase().contains(name.toUpperCase()) ) {
					return book;
				}
			}
			return null;
		}


		public void addBook(Book AddBook) {
			// TODO Auto-generated method stub
			bookList.add(AddBook);

		}

		public void deleteBook(Book book) {
			// TODO Auto-generated method stub
			bookList.remove(book);
		}

		public void printMagazineList() {
			for (Magazine magazine : magazineList) {
				System.out.println(magazine);
			}
			
		}

	}


