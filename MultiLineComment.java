public class MultiLineComment extends CharCounterState
{
	private static MultiLineComment instance = null;

	private MultiLineComment()
	{}

	public static MultiLineComment getInstance()
	{
		if(instance == null)
		{
			instance = new MultiLineComment();
		}

		return instance;

	}

	public void foundChar(CharCounter c)
	{
		c.iterateMulti(1);	
	}

	public void foundSlash(CharCounter c)
	{
		c.iterateMulti(1);
	}
	public void foundStar(CharCounter c)
	{
		c.changeState(Star.getInstance());
	}
	public void foundQuote(CharCounter c)
	{
		c.iterateMulti(1);
	}
}