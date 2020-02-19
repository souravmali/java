import java.io.*;
import java.util.*;
import java.util.Scanner;

class stack1
{
	public static void main(String args[])
	{
		stack1 s=new stack1();

		s.push(10);
		s.push(11);
		System.out.println(s.peek());
		s.push(12);

		System.out.println(s.pop());

		s.show();		

				
						
	}
		int stack[]=new int[5];
		int top=0;
	public void push(int data)
	{
		
		
		stack[top] = data;
		top++; 
	}

		public int pop()
		{
			int data;
			top--;
			data=stack[top];
			stack[top]=0;
			return data;

		}

		public int peek()
		{
			int data;
			data=stack[top-1];
			return data;

		}

	public void show()
	{
		for(int n: stack)
		{
			System.out.print(n+" ");
		}
	}

}


