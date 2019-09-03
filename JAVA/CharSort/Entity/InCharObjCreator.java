package CharSort.Entity;

import CharSort.Interface.*;
import CharSort.*;
import java.util.*;

public class InCharObjCreator implements IInCharObjCreator
{
	public final List<InChar> CreateInCharObjects(String strInput)
	{
		ASCIIEncoding ae = new ASCIIEncoding();
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java unless the Java 10 inferred typing option is selected:
		var strByteArray = ae.GetBytes(strInput);
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java unless the Java 10 inferred typing option is selected:
		var strCharArray = strInput.toCharArray();
		int ixIn = 0;
		ArrayList<InChar> retValue = new ArrayList<InChar>();

//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java unless the Java 10 inferred typing option is selected:
		for (var item : strCharArray)
		{
			InChar ic = new InChar();
			ic.setInCharSequenceIn(ixIn);
			ic.setInCharInstance(strCharArray[ixIn]);
			ic.setInCharAscii(strByteArray[ixIn]);
			ic.setInCharAscii(item);
			retValue.add(ic);
			ixIn++;
		}

		return retValue;
	}
}