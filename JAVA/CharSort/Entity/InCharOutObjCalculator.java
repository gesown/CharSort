package CharSort.Entity;

import CharSort.Interface.*;
import CharSort.Facade.*;
import CharSort.*;
import java.util.*;

public class InCharOutObjCalculator implements IInCharOutObjCalculator
{
	public final List<InChar> CalculateInCharOutObjects(List<InChar> inChars)
	{
		CharSort.model.ICSModel csModel = CSFacade.GetCSModel();
		ArrayList<InChar> retValue = new ArrayList<InChar>();
		ArrayList<Object> letters = inChars.stream().filter(s -> (s.InCharAscii >= csModel.getstartASCIILetters() && s.InCharAscii <= csModel.getendASCIILetters())).collect(Collectors.toList());
		ArrayList<Object> numbers = inChars.stream().filter(s -> (s.InCharAscii >= csModel.getstartASCIINumbers() && s.InCharAscii <= csModel.getendASCIINumbers())).collect(Collectors.toList());
		if (letters.size() == numbers.size())
		{
			for (int i = 0; i < letters.size(); i++)
			{
				retValue.add(letters.get(i));
				retValue.add(numbers.get(i));
			}
			return retValue;
		}
		for (Object item : letters)
		{
			retValue.add(item);
		}
		for (Object item : numbers)
		{
			retValue.add(item);
		}

		return retValue;
	}
}