
public class main 
{
	public static void main(String[] args) 
	{
		if (args.length == 2) 
	    {
			int i = Integer.parseInt(args[0]); 
	        int j = Integer.parseInt(args[1]); 
	        int result = i + j; 
	        
	        System.out.print(i + " + " + j + " = " + result);
	    } 
	    else 
	    {
	    	System.out.print("Неверное количество параметров!"); 
	    }
    }
}
