//The libraries of SmallTownX need a new electronic rental system, and it is up to you to build it. SmallTownX has two libraries. Each library offers many books to rent. Customers can print the list of available books, borrow, and return books.
//Define two classes, Book and Library, that provide the functionality for the book database.

package Day021;

import java.util.*;
import static java.lang.Boolean.TRUE;


class Books {
//Class for books.
	
  String[] bname={"DSA","JAVA","OS","OOPs"};
  int[] available={4,6,7,4};
}
class Library extends Books {
//Class for library and its methods.
	
 Scanner in=new Scanner(System.in);
 void lists() {
//Method for display the book lists. 
      System.out.println("List of Books Available");
      for(int i=0;i<4;i++)
      {
          if(super.available[i]>0)
          {
              System.out.println(super.bname[i]+ " "+available[i]);
          }
      }
      System.out.println("\n");
  }
 void borrow() {
//Method for book borrowing.
      String book;
      System.out.println("List of Books");
      for(int i=0;i<4;i++) {
          System.out.println("Name: "+bname[i]+" "+"Available: "+available[i]);
      }
      System.out.print("Enter Book Name you want to borrow(Case Sensitive):");
      book=in.next();
      for(int i=0;i<4;i++) {
          if(bname[i].equals(book)==TRUE)
          {
              super.available[i]--;
              System.out.println("Borrow Successfull.");
          }
      }
      System.out.println("\n");

  }
 void return_books() {
//Method for returning book.
      String book;
      System.out.println("List of Books");
      for(int i=0;i<4;i++) {
          System.out.println("Name: "+bname[i]+" "+"Available: "+available[i]);
      }
      System.out.println("Enter Book Name you want to borrow(Case Sensitive):");
      book=in.next();
      for(int i=0;i<4;i++)  {
          if(bname[i].equals(book)==TRUE)
          {
              available[i]++;
              System.out.println("Return Successfull.");
          }
      }
      System.out.println("\n");

  }

}

public class BookRentalSystem {
	
	  public static void main(String arg[])
	  {
	      Scanner in=new Scanner(System.in);
	      int value=0;
	      Library obj=new Library();
	      while(value!=4) {
	          System.out.println("Press 1: To Display List of Available Books\nPress 2:To Borrow Book\nPress 3:To Return Book\nPress 4:To Exit");
	          System.out.print("Enter your choice:");
	          value = in.nextInt();
	          System.out.println("\n");
	          if (value == 1)
	              obj.lists();
	          else if (value == 2)
	              obj.borrow();
	          else if (value == 3)
	              obj.return_books();
	          else if (value == 4)
	              System.out.println("Thank You");
	          else
	              System.out.println("Wrong Input");
	      }
	      in.close();
	  }
	}



//------------ Test Cases -----------

//TestCase1:
//Press 1: To Display List of Available Books
//Press 2:To Borrow Book
//Press 3:To Return Book
//Press 4:To Exit
//Enter your choice:1
//
//
//List of Books Available
//DSA 4
//JAVA 6
//OS 7
//OOPs 4
//
//
//Press 1: To Display List of Available Books
//Press 2:To Borrow Book
//Press 3:To Return Book
//Press 4:To Exit
//Enter your choice:2
//
//
//List of Books
//Name: DSA Available: 4
//Name: JAVA Available: 6
//Name: OS Available: 7
//Name: OOPs Available: 4
//Enter Book Name you want to borrow(Case Sensitive):JAVA
//Borrow Successfull.
//
//
//Press 1: To Display List of Available Books
//Press 2:To Borrow Book
//Press 3:To Return Book
//Press 4:To Exit
//Enter your choice:3
//
//
//List of Books
//Name: DSA Available: 4
//Name: JAVA Available: 5
//Name: OS Available: 7
//Name: OOPs Available: 4
//Enter Book Name you want to borrow(Case Sensitive):
//JAVA
//Return Successfull.
//
//
//Press 1: To Display List of Available Books
//Press 2:To Borrow Book
//Press 3:To Return Book
//Press 4:To Exit
//Enter your choice:4
//
//
//Thank You




