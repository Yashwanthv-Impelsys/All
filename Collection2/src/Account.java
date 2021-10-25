
public class Account 
{
	private int accountNumber;
	private String accountType; //Savings current
	private float balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(string accountType) {
		this.accountType = accountType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public Account(int accountNumber, String accountType, float balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	@Override
	public int hashCode() {
		return this.accountNumber;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNumber != other.accountNumber)
			return false;
		return true;
		
	}
	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}
	
	public int compareTo( final Account acct)
	{
		return Integer.compare(this.getAccountNumber(), acct.accountNumber);
		
	}
}
//a1.equals(a2)






