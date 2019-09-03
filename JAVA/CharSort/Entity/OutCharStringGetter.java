package CharSort.Entity;

import CharSort.Interface.*;
import CharSort.*;
import java.util.*;

public class OutCharStringGetter implements IOutCharStringGetter
{
	public final String GetOutCharString(List<InChar> outChars)
	{
		char[] chrOutArray = outChars.Select(s -> s.InCharInstance).ToArray();
		return new String(chrOutArray);
	}
}