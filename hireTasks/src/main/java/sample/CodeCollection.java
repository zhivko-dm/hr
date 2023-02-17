package sample;

import java.util.ArrayList;
import java.util.List;

import data.Person;
import data.Point;

public class CodeCollection {

	public static void main(String[] args) {

		/**
		 * Task 1 The following java code for Point class. What do you think about it?
		 * 
		 */
//		doPoint();
		
		/**
		 * Task 2 build up the method to return a list with persons. Randomize the first/last name 
		 * 
		 * 
		 */
//		printList(generatePersonList(15));
		
		/**
		 * Task 3 Group a list of People by last name. Get all people with family name Mueller should return a list with Person type objects
		 * 
		 * 
		 */
//		groupByLastName(generatePersonList(15));


	}

	

	/**
	 * Task 1
	 */
	static void doPoint() {
		Point p = new Point(0,1);
		System.out.println(p);
	}

	/**
	 * Task 2
	 */
	public static List<Person> generatePersonList(int size) {
		String[] firstNames = { "John", "Peter", "Mike", "Jean", "Spring" };
		String[] lastnames = { "Johnson", "Walker", "Mueller", "Lopez"};
		
		List<Person> pList = new ArrayList<>();

		
		
		return pList;
	}

	/**
	 * Task 3
	 */
	public static void groupByLastName(List<Person> people) {
		
		/* write your solution here below */
		
		
	}
	

	public static void printList(List<?> listToPring){
		System.out.println("List size: "+listToPring.size());
		listToPring.forEach(s -> System.out.println(s));
	}
		
}