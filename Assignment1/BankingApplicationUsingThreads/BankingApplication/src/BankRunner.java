
public class BankRunner implements Runnable {
	HDFCBank bank;

	public BankRunner(HDFCBank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("first")) {
				System.out.println("Account Balance: " + bank.WithdrawAmount(1001, 1000));
			} else {
				System.out.println("Account Balance: " + bank.WithdrawAmount(1001, 1000));
			}
		} catch (InsufficientAccountBalanceException ex) {
			System.out.println("Insufficient Account Balance");
		} catch (InvalidAccountNumberException ex) {
			System.out.println("Invalid Account ");
		}
	}

}
