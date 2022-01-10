package org.test;

public class Desktop implements HardWare,SoftWare{

	@Override
	public void hardWareResources() {
		System.out.println("Design Field");
	}
	@Override
	public void softWareResouces() {
		System.out.println("Windows 10");
		
	}
	public static void main(String[] args) {
		Desktop d =new Desktop();
		d.hardWareResources();
		d.softWareResouces();
	}
}
