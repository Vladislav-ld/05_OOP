package by.htp.less.bank;

public class Main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.add(new Count(9000, 1, "AAA", "AAA", true));
		bank.add(new Count(10000, 2, "AAA", "AAA", true));
		bank.add(new Count(3000, 3, "BBB", "BBB", true));
		bank.add(new Count(-1000, 4, "BBB", "BBB", false));
		bank.add(new Count(-3000, 5, "CCC", "CCC", true));
		bank.add(new Count(7000, 6, "DDD", "DDD", true));
		bank.add(new Count(6000, 7, "DDD", "DDD", false));
		bank.add(new Count(4000, 8, "EEE", "EEE", true));
		bank.add(new Count(11000, 9, "EEE", "EEE", false));
		bank.add(new Count(3000, 10, "EEE", "EEE", true));
		bank.add(new Count(-9000, 11, "EEE", "EEE", true));
		bank.add(new Count(-8000, 12, "FFF", "FFF", false));
		bank.add(new Count(2000, 13, "FFF", "FFF", true));
		bank.add(new Count(-2000, 14, "FFF", "FFF", false));

		
		BankLogic logic = new BankLogic();
		
		System.out.println(logic.printNegBalance(bank));
		System.out.println(logic.printPosBalance(bank));
		System.out.println();
		
		logic.print(logic.findByNameAndLastName(bank, "BBB", "BBB"));
		
		logic.print(logic.findByNumCount(bank, 1));
		
		logic.print(logic.findByNumCount(bank, 4));
	}

}
