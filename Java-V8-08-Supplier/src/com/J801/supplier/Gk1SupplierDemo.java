package com.J801.supplier;
import java.util.Date;
import java.util.function.Supplier;

public class Gk1SupplierDemo {

	// Program to get System Date by using Supplier
	public static void main(String[] args) {
		
		Supplier<Date> theSupplier = () -> new Date();
		System.out.println(theSupplier.get());
		
		System.out.println(theSupplier.get());
		System.out.println(theSupplier.get());
		System.out.println(theSupplier.get());
		
		
	}
}
