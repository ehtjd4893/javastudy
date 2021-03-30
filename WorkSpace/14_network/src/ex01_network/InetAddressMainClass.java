package ex01_network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressMainClass {

	public static void main(String[] args) {
		// 원격 호스트
		String host = "www.naver.com";
		
		// 인터넷 주소를 처리하는 InetAddress
		InetAddress ia = null;
		
		try {
			ia = InetAddress.getByName(host);
			System.out.println(ia);
			System.out.println(ia.getHostName());//www.naver.com
			System.out.println(ia.getHostAddress());//223.130.195.200
			
			InetAddress[] ias = InetAddress.getAllByName(host);
			for(InetAddress i : ias)
				System.out.println(i.getHostName() +"의 ip 주소: " + i.getHostAddress());
			System.out.println();
			byte[] byteIp = ia.getAddress();
			System.out.print("[");
			for(byte b : byteIp) {
				if(b < 0)
					System.out.print(b + 256 + ", ");
				else
					System.out.print(b + ", ");
			}
			System.out.println("]");
			short[] ip = new short[byteIp.length];
			for(int i = 0; i<ip.length;i++) {
				ip[i] = (short)(byteIp[i] < 0 ? byteIp[i]+256 : byteIp[i]);
			}
			System.out.println(Arrays.toString(ip));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
