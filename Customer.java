package by.training.exproject.customers;

import java.util.Arrays;

/*Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  toString(). 
Создать второй класс, агрегирующий коллекцию типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
Найти и вывести: 
a) список покупателей в алфавитном порядке; 
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Customer {

	private int id;
	private String customerName;
	private String address;
	private long cardNumber;
	private String bankAccount;

	public Customer() {
		id = 0;
		customerName = "";
		address = "";
		cardNumber = 0;
		bankAccount = "";
	}

	public Customer(int id,String customerName, String address, long cardNumber, String bankAccount) {
		this.id = id;
		this.customerName = customerName;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", address=" + address + ", cardNumber="
				+ cardNumber + ", bankAccount=" + bankAccount + "]";
	}


}
