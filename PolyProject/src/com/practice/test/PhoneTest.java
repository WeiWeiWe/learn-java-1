package com.practice.test;

import com.practice.tel.Camera;
import com.practice.tel.FourthPhone;
import com.practice.tel.INet;
import com.practice.tel.IPhoto;
import com.practice.tel.SmartWatch;

public class PhoneTest {

	public static void main(String[] args) {
		FourthPhone phone = new FourthPhone();
		phone.call();
		phone.message();
		phone.vedio();
		phone.music();
		phone.photo();
		phone.network();
		phone.game();
		System.out.println("=====================");

		IPhoto ip = new FourthPhone();
		ip.photo();
		ip = new Camera();
		ip.photo();
		System.out.println("=====================");
		
		System.out.println(INet.TEMP);
		INet net = new SmartWatch();
		System.out.println(net.TEMP);
		SmartWatch sw = new SmartWatch();
		System.out.println(sw.TEMP);
		net.connection();
		INet.stop();
		System.out.println("=====================");
		
		INet net2 = new SmartWatch();
		net2.connection();
		IPhoto ip2 = new SmartWatch();
		ip2.connection();
		System.out.println("=====================");
		
		INet net3 = new FourthPhone();
		net3.connection();
		IPhoto ip3 = new FourthPhone();
		ip3.connection();
	}

}
