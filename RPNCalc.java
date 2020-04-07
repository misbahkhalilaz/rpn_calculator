import java.util.Scanner;

public class RPNCalc 
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter Postfix Expression, press enter after each operator or operand, insert period to stop insertion:");
		RPN_Calc();
		
	}//main()
	
	
	
	private static void RPN_Calc()
	{
		RPNStack input = new RPNStack();
		RPNStack exp = new RPNStack();
		char ch='a';
		
		Scanner scanner = new Scanner(System.in);
		while(ch!='.')
		{
			exp.push(scanner.next());
			ch = exp.top().charAt(0);
		}//while
		exp.pop();
		scanner.close();
		
		while(exp.isEmpty() == false)
		{
			input.push(exp.pop());
		}//while
		
		double val1,val2;
		
		while(input.isEmpty() == false)
		{
			if(Character.isDigit(input.top().charAt(0)))
			{
				exp.push(input.pop());
			}
			else
			{
				val1 = Double.parseDouble(exp.pop());
				val2 = Double.parseDouble(exp.pop());
				switch(input.pop().charAt(0)) 
                { 
                    case '+': 
                    	exp.push(Double.toString(val2+val1)); 
                    break; 
                      
                    case '-': 
                    	exp.push(Double.toString(val2-val1)); 
                    break; 
                      
                    case '/': 
                    	exp.push(Double.toString(val2/val1)); 
                    break; 
                      
                    case '*': 
                    	exp.push(Double.toString(val2*val1)); 
                    break; 
              } //Switch
			}
		}//while
		
		System.out.println("Result = " + exp.pop());
		
	}//RPN_Calc()
	
	
}//Class
