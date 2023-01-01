package com.faith.app;

import com.faith.model.BillCalculation;
import com.faith.model.Customer;
import com.faith.model.DeliveryApp;
import com.faith.model.Order;

public class SRP_Principle {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Rahi", "Nagercoil");
		Order order1 = new Order();
		order1.setItemName("Pizza");
		order1.setQuantity(2);
		order1.setCustomer(customer1);

		order1.prepareOrder();

		BillCalculation billCalculation = new BillCalculation(order1);
		billCalculation.calculateBill();

		DeliveryApp deliveryApp = new DeliveryApp(order1);
		deliveryApp.delivery();
	}
}
