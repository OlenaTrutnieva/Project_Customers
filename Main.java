package by.training.exproject.customers;

import java.util.List;

/*Создать класс Customer, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  toString(). 
Создать второй класс, агрегирующий коллекцию типа Customer, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
Найти и вывести: 
a) список покупателей в алфавитном порядке; 
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Main {

	public static void main(String[] args) {
		Customer[] customer = new Customer[5];

		customer[0] = new Customer(100, "Ivanov Ivan Ivanovich", "Minsk, Some Nice str.", 1111, "FFJV4575745745YTR");
		customer[1] = new Customer(202, "Gavrilov Ivan Nikolaevich", "Minsk, Some Less Nice str345.", 834, "FFJDGHFGHJ47867547YTR");
		customer[2] = new Customer(466, "Herlach Andrey Nikolaevich", "Minsk, Some Bel str.", 47575, "FFJV4575745745YURT567TR");
		customer[3] = new Customer(4546, "Browless Alf Petrovich", "Prague, Any str.", 86433, "FFJV43575745FDGHJF4356J");
		customer[4] = new Customer(1166, "Pendal Magic Wtyk", "Minsk, Any Bel str.", 87, "FFJV4575745745YURT567TR");
		
		CustomerLogic logic = new CustomerLogic();
		
		List<Customer> customersbyCard = logic.customersbyCard(customer);
		
		OutPrint print = new OutPrint();
		
		print.printSelectedCustomers(customersbyCard);

	}
	
	

}
