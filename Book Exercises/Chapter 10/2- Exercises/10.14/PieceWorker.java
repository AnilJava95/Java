/*
 * Author's name and email: Michael
 * Program description: Added PieceWorker class to Figs. 10.4-10.9.
 * Latest version: 5:49 PM, 9/13/2019.
 * Older versions: 
 */

public class PieceWorker extends Employee
{
   private float wage;
   private int pieces;
	
	public PieceWorker(String firstName, String lastName, 
      String socialSecurityNumber, float wage, int pieces)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0)
			throw new IllegalArgumentException("Wage must be >= 0.");
		
		if (pieces < 0)
			throw new IllegalArgumentException("Pieces must be >= 0.");
		
		this.wage = wage;
		this.pieces = pieces;
	}

	public float getWage()
	{
		return wage;
	}

	public int getPieces()
	{
		return pieces;
	}

	public void setWage(float wage)
	{
		if (wage < 0.0)
			throw new IllegalArgumentException("Wage must be >= 0.");
		
		this.wage = wage;
	}

	public void setPieces(int pieces)
	{
		if (pieces < 0)
			throw new IllegalArgumentException("Pieces must be >= 0.");
		
		this.pieces = pieces;
	}
	
	@Override
	public double earnings()
	{
		return wage * pieces;
	}
   
	@Override
	public String toString()
	{
		return String.format("pieceworker employee: %s%n%s: $%.2f; %s: %d", super.toString(), 
			"wage per piece", getWage(), "number of pieces", getPieces());
	}
	
   
}