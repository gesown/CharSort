package CharSort.Facade;

import CharSort.Entity.*;
import CharSort.Interface.*;
import CharSort.model.*;
import CharSort.*;
import java.util.*;

public final class CSFacade
{
	private static ICSModel csModel;
	public static List<InChar> CreateInCharObjects(String strInput)
	{
		IInCharObjCreator icobc = new InCharObjCreator();
		return icobc.CreateInCharObjects(strInput);
	}

	public static ICSModel GetCSModel()
	{
		if (csModel == null)
		{
			csModel = new CSModel();
		}
		return csModel;
	}

	public static List<InChar> CalculateInCharOutObjects(List<InChar> inChars)
	{
		IInCharOutObjCalculator icobc = new InCharOutObjCalculator();
		return icobc.CalculateInCharOutObjects(inChars);
	}

	public static String GetOutCharString(List<InChar> outChars)
	{
		IOutCharStringGetter icobc = new OutCharStringGetter();
		return icobc.GetOutCharString(outChars);
	}
}