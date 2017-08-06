public class Comment extends CharCounterState
{
	private static Comment instance = null;

	private Comment()
	{

	}

	public static Comment getInstance()
	{
		if(instance == null)
		{
			instance = new Comment();
		}

		return instance;
	} 

	public void foundChar(CharCounter c)
	{
		c.iterateSingle(1);
	}
	public void foundSlash(CharCounter c)
	{
		c.iterateSingle(1);
	}
	public void foundQuote(CharCounter c)
	{
		c.iterateSingle(1);
	}
	public void foundStar(CharCounter c)
	{
		c.iterateSingle(1);
	}
	public void foundNewLine(CharCounter c)
	{
		c.changeState(Code.getInstance());
	}
}