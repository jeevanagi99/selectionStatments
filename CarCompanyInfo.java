package com.X_workz.selectionStatments;

public class CarCompanyInfo {

	public static void main(String[] args) {
		String companyName="kia";
		switch(companyName) {
		case "kia":
			System.out.println("car model:seltos");
			System.out.println("Engine capacity: 1353cc");
			System.out.println("Milage:16.5km");
			break;
		case "Honda":
			System.out.println("car model:Civic");
			System.out.println("Engine capacity: 1799cc");
			System.out.println("Milage:16.5km");
			break;
		case "Suzuki":
			System.out.println("car model:swift");
			System.out.println("Engine capacity: 1197cc");
			System.out.println("Milage:23.7km");
			break;
			default:
				System.out.println("car not found");
		}

	}

}
