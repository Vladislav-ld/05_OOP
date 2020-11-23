package by.htp.less.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List<Count> bank;
	
	public Bank() {
		bank = new ArrayList<Count>();
	}
	
	public void add(Count c) {
		bank.add(c);
	}
	
	public List<Count> getBank() {
		return bank;
	}
	
	public Count getCount(int index) {
		if(index >= bank.size()) {
			return null;
		}
		return bank.get(index);
	}
	

}
