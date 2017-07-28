class Ship{

	private int ShipId;
	private int ShipLength;
	private char ShipSymbol;
	private String ShipName;

	Ship(int id,int length,char symbol,String name)
	{
		this.ShipId = id;
		this.ShipLength = length;
		this.ShipSymbol = symbol;
		this.ShipName = name;
	}
	
	public int getId()
	{
	    return this.ShipId;
	}

	public int getLength()
	{
		return this.ShipLength;
	}

	public char getSymbol()
	{
		return this.ShipSymbol;
	}

	public String getName()
	{
		return this.ShipName;
	}


}
