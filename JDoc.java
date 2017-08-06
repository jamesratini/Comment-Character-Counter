public class JDoc extends CharCounterState
{
	private static JDoc instance = null;

	private JDoc()
	{}

	public static JDoc getInstance()
	{
		if(instance == null)
		{
			instance = new JDoc();
		}

		return instance;

	}

	public void foundChar(CharCounter c)
	{
		c.iterateJDoc(1);
	}

	public void foundSlash(CharCounter c)
	{
		c.iterateJDoc(1);
	}
	public void foundStar(CharCounter c)
	{
		// could be exiting
		c.changeState(Star.getInstance());
	}
	public void foundQuote(CharCounter c)
	{
		c.iterateJDoc(1);
	}


}