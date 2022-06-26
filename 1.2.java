
public class main 
{
	public static void main(String[] args) 
	{
        if (args.length > 0) 
        {
            System.out.print("Вы ввели " + args.length + " параметра (ов)."); /* Сообщение пользователю */
        } 
        else 
        {
            System.out.print("Вы не передавали параметров."); /* Сообщение пользователю */
        }
    }
}
