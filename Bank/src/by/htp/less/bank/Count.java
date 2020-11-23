package by.htp.less.bank;

public class Count {
	
	private int balance;
	private boolean access;
	private int numCount;
	private String nameUser;
	private String lastName;
	
	public Count(int balance, int numCount, String nameUser, String lastName, boolean access) {
		
		this.balance = balance;
		this.access = access;
		this.numCount = numCount;
		this.nameUser = nameUser;
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getNameUser() {
		return nameUser;
	}
	
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public boolean isAccess() {
		return access;
	}

	public void setAccess(boolean access) {
		this.access = access;
	}

	public int getNumCount() {
		return numCount;
	}

	public void setNumCount(int numCount) {
		this.numCount = numCount;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (access ? 1231 : 1237);
		result = prime * result + balance;
		result = prime * result + numCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Count other = (Count) obj;
		if (access != other.access)
			return false;
		if (balance != other.balance)
			return false;
		if (numCount != other.numCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Count [balance=" + balance + ", access=" + access + ", numCount=" + numCount + "]";
	}


}
