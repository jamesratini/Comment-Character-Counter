public class Quote extends CharCounterState
{
	private static Quote instance = null;

	private Quote()
	{}


	public static Quote getInstance()
	{
		if(instance == null)
		{
			instance = new Quote();
		}

		return instance;
	}

	public void foundChar(CharCounter c)
	{
		// iterate code
		c.iterateCode(1);
	}
	public void foundQuote(CharCounter c)
	{
		// go back to code state and iterate code
		c.iterateCode(1);
		c.changeState(Code.getInstance());
	}
	public void foundSlash(CharCounter c)
	{
		c.iterateCode(1);
	}
	public void foundStar(CharCounter c)
	{
		c.iterateCode(1);
	}
}