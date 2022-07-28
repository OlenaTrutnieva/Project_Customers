package by.training.exproject.customers;

import java.util.List;

public class OutPrint {
	public static void printSelectedCustomers(List<Customer> cust) {
		for (Customer x : cust) {
			System.out.println("Customer ID: " + x.getId() + ";  Customer name: " + x.getCustomerName() + ";  Customer address: " +x.getAddress() + ";  Card Number: " + x.getCardNumber() + ";  Bank Account: " + x.getBankAccount() + ".");;
		}
		System.out.println();
	}


}
