public class CharCounterState
{
	public void foundChar(CharCounter c)
	{
		System.out.println("Invalid: foundChar");
	}
	public void foundSlash(CharCounter c)
	{
		
		System.out.println("Invalid: foundSlash");
	}
	public void foundStar(CharCounter c)
	{
		System.out.println("Invalid: foundStar");
	}
	public void foundSingleComment(CharCounter c)
	{
		System.out.println("Invalid: foundSingleComment");
	}
	public void foundMultiComment(CharCounter c)
	{
		System.out.println("Invalid: foundMultiComment");
	}
	public void foundJDoc(CharCounter c)
	{
		System.out.println("Invalid: foundJDoc");
	}
	public void foundQuote(CharCounter c)
	{
		System.out.println("Invalid: foundQuote");
	}
	public void foundNewLine(CharCounter c)
	{
		System.out.println("Invalid: foundNewLine");
	}
}