//Define a class which represent a book in library. Include following members as data members
//
//Book number, book name, author, publisher, price, No. of copies issued
//
//Member function
//
//(i) To assign initial value
//
//(ii) To issue a book after checking its availability
//
//(iii) To return a book
//
//(iv) To display book information

package Day10;

class Book {
	// Class for creating library functions which are asked in the questions
	
	int bookNumber;
	String bookName;
	String author;
	String publisher;
	double price;
	int quantity;
	
	void AssignValue (int bookNumber, String bookName, String author, String publisher, double price, int quantity) {
		//Method for assigning values
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.quantity = quantity;
		
	}
	void IssueBook (int bookNumber) {
		//Method for issueing book
		if (quantity != 0 && bookNumber == this.bookNumber) {
			//if-else check satement to check quantity and book number
			System.out.println("\nYes the book is available. You can take one copy.");
		}
		else {
			System.out.println("\nNo the book is not available. Contact after few day.");
		}
	}
	void ReturnBook (int bookNumber) {
		//if-else check satement to check book number
		if ( bookNumber == this.bookNumber) {
			System.out.println("\nYou have returned the book.");
		}
		else {
			System.out.println("\nYou returned the wrong book");
		}
	}
	void BookInfo() {
		System.out.println("Serial Number: " + bookNumber
				+ " \nBook Name: " + bookName
				+ "\nBook Author: " + author
				+ "\npublisher: " + publisher
				+ "\nPrice: " + price
				+ "\nquantity: " + quantity);
	}
}

public class BookLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.AssignValue(2, "Science", "Abhishek", "xyz", 117.38, 0);
		book1.BookInfo();
		book1.IssueBook(1);
		book1.ReturnBook(1);
	}

}
//------------ Test Cases ------------

//TestCase1: 
//Input(argument) = 1, "Math", "Subham", "abc", 114.32, 5
//Output:
//Serial Number: 1 
//Book Name: Math
//Book Author: Subham
//publisher: abc
//Price: 114.32
//quantity: 5
//
//Yes the book is available. You can take one copy.
//
//You have returned the book.


//TestCase2: 
//Input(argument) = 2, "Science", "Abhishek", "xyz", 117.38, 0
//Output:
//Serial Number: 2 
//Book Name: Science
//Book Author: Abhishek
//publisher: xyz
//Price: 117.38
//quantity: 0
//
//No the book is not available. Contact after few day.
//
//You returned the wrong book
