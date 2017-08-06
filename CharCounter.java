public class CharCounter
{
	private CharCounterState currentState = null;
	private int codeCount = 0;
	private int jdocCount = 0;
	private int multiLineCount = 0;
	private int singleLineCount = 0;

	// Previous state will be used to determine if ending a multi
	// line comment or a jdoc comment
	private CharCounterState previousState = null;

	public CharCounter()
	{
		changeState(Code.getInstance());
	}

	public CharCounterState getPrevState()
	{
		return previousState;
	}
	public int getCodeCount()
	{
		return codeCount;
	}
	public int getJDocCount()
	{
		return jdocCount;
	}
	public int getMultiCount()
	{
		return multiLineCount;
	}
	public int getSingleCount()
	{
		return singleLineCount;
	}
	public void changeState(CharCounterState x)
	{
		previousState = currentState;
		currentState = x;
	}
	public void iterateCode(int x)
	{
		codeCount += x;
	}
	public void iterateJDoc(int x)
	{
		jdocCount += x;
	}
	public void iterateMulti(int x)
	{
		multiLineCount += x;
	}
	public void iterateSingle(int x)
	{
		singleLineCount += x;
	}

	public void Char()
	{
		currentState.foundChar(this);
	}
	public void Slash()
	{
		currentState.foundSlash(this);
	}
	public void Star()
	{
		currentState.foundStar(this);
	}
	public void Quote()
	{
		currentState.foundQuote(this);
	}
	public void NewLine()
	{
		currentState.foundNewLine(this);
	}
	public void printCounts()
	{
		System.out.println("Number of Code Characters: " + getCodeCount());
		System.out.println("Number of JDoc Characters: " + getJDocCount());
		System.out.println("Number of Multi Line Comment Characters: " + getMultiCount());
		System.out.println("Number of Single Line Comment Characters: " + getSingleCount());

	}
}