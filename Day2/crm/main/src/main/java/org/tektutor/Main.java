package org.tektutor;

public class Main {

	public void printModuleDetails() {
		System.out.println ("Main module");
	}

	public static void main ( String[] args ) {

		FrontEnd fe = new FrontEnd();
		BusinessLayer bl = new BusinessLayer();
		DataAccessLayer dal = new DataAccessLayer();
		Main mainModule = new Main();

		fe.printModuleDetails();
		bl.printModuleDetails();
		dal.printModuleDetails();
		mainModule.printModuleDetails();
	}

}
