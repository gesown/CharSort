package CharSort;

import CharSort.Facade.*;
import CharSort.Entity.*;
import java.util.*;

public class Program
{
	static void main(String[] args)
	{

		String strInput = args[0];
		List<InChar> InChars = CSFacade.CreateInCharObjects(strInput);
		List<InChar> OutChars = CSFacade.CalculateInCharOutObjects(InChars);
		String outCharString = CSFacade.GetOutCharString(OutChars);
		System.out.println("String Input: " + strInput);
		System.out.println("String Output: " + outCharString);
		new Scanner(System.in).nextLine();
	}
}