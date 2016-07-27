// This program calculates stock transactions for a Mister Joe Mahoney.

public class StockTransactionProgram
{
   public static void main(String[] args)
   {
	String name;
	name = "Joe";
	double purchased = 1000; //Joe purchased 1000 shares.
	double paid = 32.87; //Joe paid $32.87 per share.
	double sold = 33.92; //Joe sold the stock for $33.92 per share.
	double commission = .02; //Joe paid the stockbroker 2% for both commissions.
	double totalStockPurchased;
	double commissionPaid;
	double totalPaid;
	double totalStockSold;
	double commissionSold;
	double totalSold;
	double totalProfit;
	totalStockPurchased = purchased * paid;
	commissionPaid = totalStockPurchased * commission;
	totalPaid= totalStockPurchased + commissionPaid;

	totalStockSold = purchased * sold;
	commissionSold = totalStockSold * commission;
	totalSold = totalStockSold - commissionSold;
	
	totalProfit = totalSold - totalPaid;
	
	System.out.println(name + " paid $" + totalStockPurchased + " for the stock.");
	System.out.println(name + " paid his broker a commission of " + commissionPaid + " on the purchase.");
	System.out.println("So, " + name + " paid a total of $" + totalPaid);
	
	System.out.println(name + " sold the stock for $" + totalStockSold);
	System.out.println(name + " paid his broker a commission of $" + commissionSold + " on the sale.");
	System.out.println("So, " + name + " received a total of $" + totalSold);

	System.out.println(name + "'s" + " profit or loss: $" + totalProfit);
	
	
   }
}
