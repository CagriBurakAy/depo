import java.util.List;
import java.util.Scanner;

public class Program {
	
	private static Scanner scanner;
	

	public static void main(String[] args) throws Exception {
		scanner = new Scanner(System.in);
		ItemManager itemManager = new ItemManager("books.txt", "magazines.txt");
		AuthorManager authorManager = new AuthorManager("authors.txt");
		
		int selection = displayMenu();
		while (selection != 0) {
			if (selection < 1 || selection > 11) {
				System.out.println("Invalid option! Try again!");
			}
			else {
				if (selection == 1) {
					itemManager.printBookList();
				}
				else if (selection == 2) {
					authorManager.printAuthors();
				}
				else if (selection == 3) {
					itemManager.printMagazineList();
				}
				else if (selection == 4) {
					searchAuthors(authorManager);
				}
				else if (selection == 5) {
				searchWithIsbn(itemManager);
				}
				else if (selection == 6) {
				searchWithYearAndPublisher(itemManager);
				}
				else if (selection == 7) {
					editBook(itemManager);}
				else if(selection==8){
					addNewBook(itemManager);
				}
				 else if (selection == 9) {
						deleteBook(itemManager);
					}
				 else if (selection == 10) {
						searchMagazinesWithNameAndMonth(itemManager);
			}
				 else if (selection == 11) {
						searchAllLibraryByName(itemManager);
					}
			}
			selection = displayMenu();
		}
		
		scanner.close();
	}

	public static void searchAllLibraryByName(ItemManager itemManager) {
	System.out.println("enter name:");
	String name=scanner.next();
	List<Magazine> found = itemManager.searchMagazineByName(name);
	if (found.size() > 0) {
		for (Magazine magazine : found) {
			System.out.println(magazine);
		}
	}
	Book book = itemManager.searchBook(name);
	if (book != null) {

		System.out.println(book);
	} }

	

	public static void searchMagazinesWithNameAndMonth(ItemManager itemManager) {
		System.out.println("Enter name: ");
		String name=scanner.next();
		System.out.println("Enter month:");
		int month=scanner.nextInt();
		List<Magazine> found = itemManager.searchMagazine(name, month);
		if (found.size() > 0) {
			for (Magazine magazine : found) {
				System.out.println(magazine);
			}
		} else {
			System.out.println("No such book found!");
		}
	}

	public static void editBook(ItemManager itemManager) {
		// TODO Auto-generated method stub
		System.out.println("Enter ISBN:");
		String isbn=scanner.next();
		Book book = itemManager.search(isbn);
		System.out.println("enter name:");
		String name=scanner.next();
		System.out.println("enter publisher year:");
		int publishYear=scanner.nextInt();
		System.out.println("enter publisher:");
		String publisher=scanner.next();
		if (book != null) {
	
			      book.setName(name);
			      book.setPublishYear(publishYear);
			      book.setPublisher(publisher);
			      itemManager.printBookList();
		
		}
	}
	

	public static void deleteBook(ItemManager itemManager) {
		// TODO Auto-generated method stub
		System.out.println("Enter ISBN:");
		String isbn=scanner.next();
		Book book = itemManager.search(isbn);		if (book != null) {
			itemManager.deleteBook(book);
			System.out.println("Book deleted successfully!");
		} else {
			System.out.println("No such book found");
		}
	}
	

	public static void addNewBook(ItemManager itemManager) {
		// TODO Auto-generated method stub
		System.out.println("Enter isbn: ");
		String isbn = scanner.next(); 
		System.out.println("Enter name: ");
		String name = scanner.next();
		System.out.println("Enter author's id:");
		int aID = scanner.nextInt(); 
		System.out.println("Enter publish year:");
		int year = scanner.nextInt(); 
		System.out.println("Enter publisher:");
		String publisher = scanner.next(); 
		System.out.println("Enter ID: ");
		int id = scanner.nextInt();
		itemManager.addBook(new Book(id, name, publisher, isbn, aID, year));
	}

	public static void searchWithYearAndPublisher(ItemManager itemManager) {
		System.out.println("Enter publisher: ");
		String publisher=scanner.next();
		System.out.println("Enter syear:");
		int syear=scanner.nextInt();
		System.out.println("Enter eyear:");
		int eyear=scanner.nextInt();
		List<Book> found = itemManager.search(publisher,syear,eyear);
		if (found.size() > 0) {
			for (Book book : found) {
				System.out.println(book);
			}
		} else {
			System.out.println("No such book found!");
		}
	}
	

	public static void searchWithIsbn(ItemManager itemManager) {
		System.out.println("Enter Isbn: ");
		String isbn = scanner.next();
		
		Book books = itemManager.search(isbn);
		if (books!=null) {
			System.out.println(books);
			
		} else {
			System.out.println("No such book found!");
		}
	}
		
	
		
	

	public static int displayMenu() {
		System.out.println("Menu");
		System.out.println("1- Print books");
		System.out.println("2- Print authors");
		System.out.println("3- Print magazine");
		System.out.println("4- Search authors");
		System.out.println("5- Search ISBN");
		System.out.println("6- Search with Year and Publisher");
		System.out.println("7- Edit Book");
		System.out.println("8- Add Book");
		System.out.println("9- Delete Book");
        System.out.println("10-Search with name and month");
        System.out.println("11-Search item:");
		System.out.print("Your choice: ");
		int selection = scanner.nextInt();
		return selection;
	}
	
	public static void searchAuthors(AuthorManager authorManager) {
		System.out.println("Enter author's name: ");
		String aname = scanner.next();
		List<Author> authors = authorManager.search(aname);
		for (Author author : authors) {
			System.out.println(author);
		}
	}
}
