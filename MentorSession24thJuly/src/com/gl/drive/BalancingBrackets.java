package com.gl.drive;

import java.util.Stack;

public class BalancingBrackets {
	
	
	static boolean checkingbracketBalancing(String bracketExpression) {
		Stack <Character> Stack = new Stack<Character>();	
		for(int i = 0; i < bracketExpression.length(); i++)	
		{
			char x = bracketExpression.charAt(i);
			
			if (x == '(' || x == '{' || x == '[')
			{
				Stack.push(x);
				continue;
			}
			
			if(Stack.isEmpty())
				return false;
			char check;
			switch(x)  {
			case ')' : 
				check = Stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;
				
			case '}' :
				check = Stack.pop();
				if (check == '[' || check == '(')
					return false;
				break;
				
			case ']' :
				check = Stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
				
			}
		}
		return (Stack.isEmpty());
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExpression = "({[]})";
		boolean result;
		result = checkingbracketBalancing(bracketExpression);
		
       if(result)
    	    System.out.println("the entered string has balanced Brackets");
       else
    	   System.out.println("The entered string do not contain balanced brackets");
   
	}
	}
	
	


