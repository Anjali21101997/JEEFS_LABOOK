package com.cg.studentBookManagement.dbUtil;

import java.util.Scanner;

import com.cg.com.studentBookManagement.serviceImpl.BookServiceImpl;
import com.cg.com.studentBookManagement.serviceImpl.StudentServiceImpl;
import com.cg.studentBookManagement.service.BookService;
import com.cg.studentBookManagement.service.StudentService;

public class MenuUtil {
	private StudentService studentService;
	private BookService bookservice;
	public MenuUtil()
	{
		studentService=new StudentServiceImpl();
		bookservice=new BookServiceImpl();
	}
	public void start()
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		String continueChoice;
		
		do {
			showMenu();		
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookManagement();
				System.out.println("Enter Your Choice");
				int ch=sc.nextInt();
				if(ch==1)
				{
					System.out.println("Enter Book ID");
					int book_ID=sc.nextInt();
					System.out.println("Enter Book Name");
					String book_name=sc.next();
					bookservice.addBook(book_ID,book_name );
					System.out.println("--------------------Successfully Added--------------------------");
				}
				else if(ch==2)
				{
					System.out.println("Enter Book ID");
					int book_ID=sc.nextInt();
					bookservice.deleteBook(book_ID);
					System.out.println("-----------------------Successfully Deleted------------------------");
					
				}
				
				break;
				
			case 2:
				System.out.println("Enter Student ID");
				int std_ID=sc.nextInt();
				System.out.println("Enter Student Name");
				String std_Name=sc.next();
				studentService.addStudent(std_ID, std_Name);
				System.out.println("---------------Student Successfully Added-------------------");
				
				
				break;
			case 3:
				System.out.println("Enter Student Id ");
				int std_ID1=sc.nextInt();
				bookservice.findBook();
				System.out.println("Enter Book Id From above List");
				int book_ID=sc.nextInt();
				studentService.issueBook(std_ID1,book_ID);
				System.out.println("------------------------"+book_ID+"Successfully Issued and added in record------------------");
				break;
				
			case 4:
				System.out.println("Enter Student ID");
				int student_ID=sc.nextInt();
				System.out.println("Enter Book Id which You Want To Return");
				int Book_Id1=sc.nextInt();
				studentService.returnBook(student_ID, Book_Id1);
				System.out.println("-------------------- This "+Book_Id1+"  Returned Successfully----------------------------- ");
				
				
				
				break;
			
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Do you want to continue : [yes/no]");
			continueChoice = sc.next();
		}while(continueChoice.equalsIgnoreCase("yes"));
	}
	
		
	
	
	public void showMenu()
	{
		
		System.out.println("**********LIBRARY OF BOOKS MANAGEMENT**********");
		System.out.println("1.Book Management Like ADD Book,Delete Book");
		System.out.println("2.ADD student");
		System.out.println("3.Issue Book");
		System.out.println("4.Return Book");
		System.out.println("0.Exit");
		System.out.println();
		
		
		
	}
	public void bookManagement()
	{
		System.out.println("1.ADD BOOK");
		System.out.println("2.DELETE BOOK");
	}
	

}

