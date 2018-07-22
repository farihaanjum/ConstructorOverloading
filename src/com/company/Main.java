package com.company;

public class Main {

    public static void main(String[] args) {
	Laptop device = new Laptop(); //shows error in the empty parentheses due to the first change in laptop class
	device.brand = "Hp";
	//works when no parameterized constructor is declared or in the presence of a empty constructor

	device.ram(8);
	device.display("15.6 inches");

	Laptop deviceConfig = new Laptop("hp", "golden"); //golden replaces red

	deviceConfig.ram(6);
	deviceConfig.display("14.8 inches");
    }
}
