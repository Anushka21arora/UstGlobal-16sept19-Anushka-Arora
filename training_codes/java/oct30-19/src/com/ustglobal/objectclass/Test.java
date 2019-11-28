package com.ustglobal.objectclass;
public class Test {
	public static void main(String[] args) {
		//	Mouse m = new Mouse();
		//	UsbPort.connect(m);
		PenDrive p = new PenDrive();
		UsbPort.connect(p);
	}
}
