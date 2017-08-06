public class Code extends CharCounterState
{
	private static Code instance = null;

	private Code()
	{

	}

	public static Code getInstance()
	{
		if(instance == null)
		{
			instance = new Code();
		}

		return instance;
	}

	public void foundChar(CharCounter c)
	{
		// iterate code counter
		c.iterateCode(1);
	}

	public void foundSlash(CharCounter c)
	{
		// move to slash state
		c.changeState(Slash.getInstance());
	}
	public void foundStar(CharCounter c)
	{
		// star is treated as char when in 1code
		c.iterateCode(1);
	}
	public void foundQuote(CharCounter c)
	{
		// move to quote state
		c.iterateCode(1);
		c.changeState(Quote.getInstance());
	}
}