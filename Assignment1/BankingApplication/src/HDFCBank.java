import java.util.LinkedList;

public class HDFCBank {
	LinkedList<Account> acc = new LinkedList<>();

	
	
	
	public String createAccount(int accountNumber, int amount) throws InsufficientAccountBalanceOpeningException {
		if (amount < 500) {
			throw new InsufficientAccountBalanceOpeningException();
		}
		Account accs = new Account(accountNumber, amount);
		acc.add(accs);
		return "Account created";
	}

	
	
	
	private Account SearchAccount(int accountNumber) throws InvalidAccountNumberException {
		for (Account accs : acc) {
			if (accs.getAccountNumber() == accountNumber) {
				return accs;
			}
		}
		throw new InvalidAccountNumberException();
	}

	
	
	
	public int WithdrawAmount(int accountNumber, int amount)
			throws InsufficientAccountBalanceException, InvalidAccountNumberException {
		Account a = SearchAccount(accountNumber);
		{
			if (a.getAmount() >= 0) {
				a.setAmount(a.getAmount() - amount);
				return a.getAmount();
			}
		}
		throw new InsufficientAccountBalanceException();	}
	
	
	
	
	public int DepositAmount(int accountNumber, int amount) throws InvalidAccountNumberException
	{	
	Account a = SearchAccount(accountNumber);
		{
			a.setAmount(a.getAmount() + amount);
			return a.getAmount();
		}
	}
	
	
	
	
	
	public int FundTransfer(int withAcc, int depAcc, int amount) throws InsufficientAccountBalanceException, InvalidAccountNumberException
	{	
		
	Account a = SearchAccount(withAcc);
	Account b = SearchAccount(depAcc);
	WithdrawAmount(withAcc,amount);
	DepositAmount(depAcc, amount);
		return b.getAmount();
		
	}
	



}
