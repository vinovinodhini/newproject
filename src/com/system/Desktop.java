package com.system;

public class Desktop implements HardWare, Software 	//child class
{
	
	private void desktopModel() {
		System.out.println("HP");

	}

	@Override
	public void hardwareResources() {
		System.out.println("marketing store");
		
	}

	@Override
	public void softwareResources() {
		System.out.println("CPU,Hard drivr");
		
	}
public static void main(String[] args) {
	Desktop dk=new Desktop();
	dk.desktopModel();
	dk.hardwareResources();
	dk.softwareResources();
	//git push and pull
		int  a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	
	//git push
	System.out.println("second update");

	
}
}
