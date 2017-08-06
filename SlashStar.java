public class SlashStar extends CharCounterState
{
	private static SlashStar instance = null;

	private SlashStar()
	{}

	public static SlashStar getInstance()
	{
		if(instance == null)
		{
			instance = new SlashStar();
		}

		return instance;

	}

	public void foundChar(CharCounter c)
	{
		// enter multi line comment
		c.iterateMulti(3);
		c.changeState(MultiLineComment.getInstance());
	}

	public void foundSlash(CharCounter c)
	{
		c.iterateMulti(3);
		c.changeState(MultiLineComment.getInstance());
	}
	public void foundStar(CharCounter c)
	{
		c.iterateJDoc(3);
		c.changeState(JDoc.getInstance());
	}
	public void foundQuote(CharCounter c)
	{
		c.iterateMulti(3);
		c.changeState(MultiLineComment.getInstance());
	}
}