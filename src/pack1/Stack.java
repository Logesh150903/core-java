package pack1;

import java.util.LinkedList;
import java.util.Scanner;

public class Stack {
	LinkedList ll;
	Scanner s;

	Stack() {
		ll = new LinkedList();
		s = new Scanner(System.in);
	}

	void push() {
		System.out.println("Enter the element to be pushed onto stack:");
		String element = s.next();
		ll.addLast(element);
		System.out.println("The element " + element + " is pushed onto stack successfully...");
	}

	void pop() {
		if (ll.isEmpty()) {
			System.out.println("Stack is Empty...");
			return;
		}
		String element = (String) ll.removeLast();
		System.out.println("The popped element is " + element);
	}

	void display() {
		if (ll.isEmpty()) {
			System.out.println("Stack is Empty...");
			return;
		}
		System.out.println("The contents of stack are:");
		System.out.println(ll);
	}

	public static void main(String[] args) throws Exception {
		Stack obj = new Stack();
		int choice;
		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			choice = obj.s.nextInt();
			switch (choice) {
			case 1:
				obj.push();
				Thread.sleep(1000);
				break;
			case 2:
				obj.pop();
				Thread.sleep(1000);
				break;
			case 3:
				obj.display();
				Thread.sleep(1000);
				break;
			case 4:
				System.out.println("Exiting...");
				Thread.sleep(1000);
				System.exit(0);
			default:
				System.out.println("Wrong Choice...");
				Thread.sleep(1000);
			}
		} while (true);
	}
}
