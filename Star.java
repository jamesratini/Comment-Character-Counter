public class Star extends CharCounterState
{
	private static Star instance = null;

	private Star()
	{}

	public static Star getInstance()
	{
		if(instance == null)
		{
			instance = new Star();
		}

		return instance;

	}

	public void foundChar(CharCounter c)
	{
		// Might have gotten here from Multi or JDoc
		if(c.getPrevState() == MultiLineComment.getInstance())
		{
			c.iterateMulti(2);
			c.changeState(MultiLineComment.getInstance());
		}
		else
		{
			// must be from JDoc
			c.iterateJDoc(2);
			c.changeState(JDoc.getInstance());
		}
	}

	public void foundSlash(CharCounter c)
	{
		if(c.getPrevState() == MultiLineComment.getInstance())
		{
			c.iterateMulti(2);
			c.changeState(Code.getInstance());
		}
		else
		{
			// must be from JDoc
			c.iterateJDoc(2);
			c.changeState(Code.getInstance());
		}
	}
	public void foundStar(CharCounter c)
	{	
		
		if(c.getPrevState() == MultiLineComment.getInstance())
		{
			c.iterateMulti(2);
			c.changeState(MultiLineComment.getInstance());
		}
		else
		{
			// must be from JDoc
			c.iterateJDoc(2);
			c.changeState(JDoc.getInstance());
		}
	}
	public void foundQuote(CharCounter c)
	{
		
		if(c.getPrevState() == MultiLineComment.getInstance())
		{
			c.iterateMulti(2);
			c.changeState(MultiLineComment.getInstance());
		}
		else
		{
			// must be from JDoc
			c.iterateJDoc(2);
			c.changeState(JDoc.getInstance());
		}
	}
}