package by.htp.less.bank;

public class BankLogic {
	
	public int printPosBalance(Bank bank) {
	
		int balance = 0;
		
		for(int i = 0; i < bank.getBank().size(); i++) {
			if(bank.getCount(i).isAccess()) {
				if(bank.getCount(i).getBalance() >= 0) {
					balance += bank.getCount(i).getBalance();
				}
			}
		}
		return balance;
	}
	
	public int printNegBalance(Bank bank) {

		int balance = 0;
		
		for(int i = 0; i < bank.getBank().size(); i++) {
			if(bank.getCount(i).isAccess()) {
				if(bank.getCount(i).getBalance() < 0) {
					balance += bank.getCount(i).getBalance();
				}
			}
		}
		return balance;
	}
	
	public Bank findByNumCount(Bank bank, int num) {
		Bank _bank = new Bank();
		
		for(int i = 0; i < bank.getBank().size(); i++) {
			if(bank.getCount(i).isAccess()) {
				if(bank.getCount(i).getNumCount() == num) {
					_bank.add(bank.getCount(i));
				}
			}
		}
		return _bank;
	}
	
	public Bank findByNameAndLastName(Bank bank, String name, String lastName) {
		Bank _bank = new Bank();
		
		for(int i = 0; i < bank.getBank().size(); i++) {
			if(bank.getCount(i).isAccess()) {
				if(bank.getCount(i).getLastName().compareTo(lastName) == 0) {
					if(bank.getCount(i).getNameUser().compareTo(name) == 0) {
						_bank.add(bank.getCount(i));
					}
				}
			}
		}	
		return _bank;
	}
	
	public void print(Bank bank) {
		for(int i = 0; i < bank.getBank().size(); i++) {
			if(bank.getCount(i).isAccess()) {
				System.out.println(bank.getCount(i).getBalance());
				System.out.println(bank.getCount(i).getLastName());
				System.out.println(bank.getCount(i).getNameUser());
				System.out.println(bank.getCount(i).getNumCount());
				System.out.println();
			}
		}
			
		
		
	}

}
