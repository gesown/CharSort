package CharSort.model;

import CharSort.*;

public class CSModel implements ICSModel
{
	public CSModel()
	{
		setstartASCIILetters(0x41);
		setstartASCIINumbers(0x30);
		setendASCIILetters(0x7a);
		setendASCIINumbers(0x39);
	}
	private int startASCIINumbers;
	public final int getstartASCIINumbers()
	{
		return startASCIINumbers;
	}
	public final void setstartASCIINumbers(int value)
	{
		startASCIINumbers = value;
	}
	private int endASCIINumbers;
	public final int getendASCIINumbers()
	{
		return endASCIINumbers;
	}
	public final void setendASCIINumbers(int value)
	{
		endASCIINumbers = value;
	}
	private int startASCIILetters;
	public final int getstartASCIILetters()
	{
		return startASCIILetters;
	}
	public final void setstartASCIILetters(int value)
	{
		startASCIILetters = value;
	}
	private int endASCIILetters;
	public final int getendASCIILetters()
	{
		return endASCIILetters;
	}
	public final void setendASCIILetters(int value)
	{
		endASCIILetters = value;
	}
}