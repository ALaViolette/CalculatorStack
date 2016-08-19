package testDataStructure;

import java.util.Scanner;
import java.util.Stack;

public class calculator {
	
	public static void main(String[] arg){
		
		int last;
		int first;
		int math;
	Stack<Integer> s = new Stack<Integer>();
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please input you equation");
	String input= scan.nextLine(); 
	//52*3+
	//63-1+
	
	
	for(int i = 0 ; i<input.length() ;i++){
		char a = input.charAt(i);
	switch(a){
	case'+':
		last = s.pop();
		first = s.pop();
		 math = first + last;
		s.push(math);
		break;
	case'-':
		last = s.pop();
		first = s.pop();
		math = first - last;
		s.push(math);
		break;
		
	case'/':
		last = s.pop();
		first = s.pop();
		math = first / last;
		s.push(math);
		break;
		
	case'*':
		last = s.pop();
		first = s.pop();
		math = first * last;
		s.push(math);
		break;
	
	default:	
		int number = Character.getNumericValue(a);
		s.push(number);
		break;
		}
		}System.out.println(input+ " = "+s.pop());
	
	
	
	}
}
