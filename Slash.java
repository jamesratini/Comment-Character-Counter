public class Slash extends CharCounterState
{
	private static Slash instance = null;

	private Slash()
	{}

	public static Slash getInstance()
	{
		if(instance == null)
		{
			instance = new Slash();
		}

		return instance;

	}

	public void foundChar(CharCounter c)
	{
		// the slash wasn't used to mark a comment
		c.iterateCode(2);
		c.changeState(Code.getInstance());
	}

	public void foundSlash(CharCounter c)
	{
		c.iterateSingle(2);
		c.changeState(Comment.getInstance());
	}
	public void foundStar(CharCounter c)
	{
		// /* could be multi line comment or jdoc comment
		c.changeState(SlashStar.getInstance());
	}
	// Finding Quote/NewLine unnecessary, wont compile/not counted


}