package by.training.exproject.customers;

/*Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  toString(). 
Создать второй класс, агрегирующий коллекцию типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
Найти и вывести: 
a) список покупателей в алфавитном порядке; 
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public List<Customer> customersAbc(Customer[] cust, String customerName) {
		List<Customer> result = new ArrayList<Customer>();
		char[] custNameArray = customerName.toCharArray();
		int order1 = cust.length;
		int order2 = custNameArray.length;
		int temp;
		char min;
		char [][] arr = new char[order2][order1];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				min = arr[i][j];
				if (arr[i][j] < arr[i][j]) {
					min = custNameArray[i];
				}
			}
			
		}
		return result;
	}
	
	public List<Customer> customersbyCard(Customer[] cust) {
		List<Customer> result = new ArrayList<Customer>();

		for (Customer x : cust) {
			if (x.getCardNumber() <= 47575 && x.getCardNumber() > 100) {
				result.add(x);
			}
		}
		return result;
	}

}
