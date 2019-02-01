
public class Client {
	public static void main(String[] args) throws Exception {
		HDFCBank bank = new HDFCBank();
		
		System.out.println(bank.createAccount(1001, 51000));
		System.out.println(bank.createAccount(1002, 7000));
		
		BankRunner bankRunner=new BankRunner(bank);
		
		Thread child1=new Thread(bankRunner, "first");
		child1.start();
		
		Thread child2=new Thread(bankRunner, "second");
		child2.start();
}
}

		/*try {
			System.out.println(bank.createAccount(1001, 51000));
			System.out.println(bank.createAccount(1002, 7000));
			System.out.println("Balance: " + bank.WithdrawAmount(1003, 1000));
			System.out.println("Balance: " + bank.DepositAmount(1002, 3000));
			//System.out.println("Balance After fund transfer: " + bank.FundTransfer(1001,1002, 1111));
		}

		catch (InsufficientAccountBalanceException ex) {
			System.out.println("Insufficient Account Balance");
		} catch (InvalidAccountNumberException ex) {
			System.out.println("Invalid Account ");
		}
		catch (InsufficientAccountBalanceOpeningException ex) {
			System.out.println("Insufficient Opening Account Balance");
		}

	}

}
*/