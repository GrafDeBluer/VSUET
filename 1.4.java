
public class main 
{
	static String login = "D117";
    static String Password = "qwerty";
	
    public static void main(String[] args) {
	    if ( (args[0].equals(login)) & (args[1].equals(Password)) ) 
	    {
	    	System.out.print("Вас узнали. Добро пожаловать!"); 
	    } 
	    else 
	    {
	        System.out.print("Данные не распознаны. Доступ запрещен!"); 
	    }
    }
}
