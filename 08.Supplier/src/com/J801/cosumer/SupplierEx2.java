package com.J801.cosumer;

import java.util.function.Supplier;

public class SupplierEx2 {

	// To Generate 6 Digit OTP
	public static void main(String[] args) {

		Supplier<String> theSupplierOTP = () -> {
			String otp = "";

			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};

		System.out.println("The OTP is: "+theSupplierOTP.get());
		System.out.println("The OTP is: "+theSupplierOTP.get());
		System.out.println("The OTP is: "+theSupplierOTP.get());
		
		
		
		
		
	}

}
