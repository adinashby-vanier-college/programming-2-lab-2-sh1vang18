package com.prog2.labs;
/**
 * @author adinashby
 *
 */
public class Account {
	
	/**
	 * i) Define three instance variables called accountNumber, name and amount.
	 */
	private int accountNumber;
        private String name;
        private double amount;
	/**
	 * ii) Define one static variable called numberOfAccounts.
	 */
	private static int numberOfAccounts;
	/**
	 * Write your test code below in the main (optional).
	 */
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * iii) A default constructor.
	 */
            public Account() {
         // numberOfAccounts++;
        }
	/**
	 * iv) A constructor that takes all the parameters and initializes them 
	 */
	
	public Account(int accountNumber, String name, double amount) {
		
            this.accountNumber = accountNumber;
              this.name = name;
             this.amount = amount;
                //numberOfAccounts++;
	}
	
	/**
	 * v) Getters and setters (accessors and mutators).
     * @return 
	 */
         public int getAccountNumber() {
            return accountNumber;
        }

        public String getName() {
            return name;
        }

        public double getAmount() {
            return amount;
        }

        public static int getNumberOfAccounts() {
            return numberOfAccounts;
        }
        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
}

        public void setName(String name) {
            this.name = name;
}

        public void setAmount(double amount) {
            this.amount = amount;
}
	
	/**
	 * vi) Adds the parameter value to the amount field.
	 * 
	 * @param amountToBeDeposited a positive number.
	 *
	 * @return result new value.
	 */
	public double deposit(double amountToBeDeposited) {
            amount += amountToBeDeposited;
		return amount;
	}
	
	/**
	 * vii) Subtracts the parameter value from the amount field.
	 * 
	 * @param amountToBeWithdrawn a positive number.
	 *
	 * @return result new value.
	 */
	public double withdraw(double amountToBeWithdrawn) {
            amount -= amountToBeWithdrawn;
		return amount;
	}
	
	/**
	 * viii) Adds %2 interest to the amount field.
	 *
	 * @return result new value.
	 */
	public double calculateInterest() {
            amount += (amount * 0.02);
		return amount;
	}
	
	/**
	 * ix) To show the values inside the object .
	 *
	 * @return result the string containing the values.
	 */
	public String toString() {
		return accountNumber + name + amount;
	}
	
	/**
	 * x) To compare if two instances of Account class are equal or not.
	 *
	 * @param anotherAccount another instance of the Account class.
	 *
	 * @return result the string containing the values.
	 */
	public boolean equals(Account anotherAccount) {
		return false;
	}
}
