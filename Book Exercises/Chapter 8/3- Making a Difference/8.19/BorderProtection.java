/*
 * Author's name and email: Michael
 * Program description: This class has attributes about a passenger useful for 
 *  border protection agents.
 * Latest version: 5:55 PM, 9/10/2019.
 * Older versions: 
 */

import java.time.LocalDate;

public class BorderProtection
{
	String name;
	int passportNumber;
	LocalDate passportIssueDate;
	boolean isCarryingAgriculturalProducts;
	boolean isCarryingWeapons;
	boolean isCarryingMoreThanTenGrand;
   String lastDestination1;
   String lastDestination2;
   String lastDestination3;
   String agriculturalProductStatus;
   String weaponStatus;
   String moneyStatus;
   boolean pastActionTaken;
	
	public BorderProtection()
	{
		
	}
}