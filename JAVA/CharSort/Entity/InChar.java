package CharSort.Entity;

import CharSort.Interface.*;
import CharSort.*;

public class InChar implements IInChar
{
	private char InCharInstance;
	public final char getInCharInstance()
	{
		return InCharInstance;
	}
	public final void setInCharInstance(char value)
	{
		InCharInstance = value;
	}
	private int InCharAscii;
	public final int getInCharAscii()
	{
		return InCharAscii;
	}
	public final void setInCharAscii(int value)
	{
		InCharAscii = value;
	}
	private int InCharSequenceIn;
	public final int getInCharSequenceIn()
	{
		return InCharSequenceIn;
	}
	public final void setInCharSequenceIn(int value)
	{
		InCharSequenceIn = value;
	}
}