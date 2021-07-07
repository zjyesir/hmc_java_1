package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;

import jdk.tools.jlink.internal.Platform;

public class NetTest {

	public NetTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
//		socketExample();
		
		inetAddressExample();
		
	}
	
	static void socketExample() {
		ServerSocket server;
		try {
			server = new ServerSocket(8000);
			Socket socket = server.accept();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	static void inetAddressExample() {
		ServerSocket server;
		try {
			//1. 从socket中获取InetAddress
//			服务器程序可以用InetAdress类获取客户端的IP地址和主机名字等信息
//			server = new ServerSocket(8000);
//			Socket socket = server.accept();
//			InetAddress inetAddress = socket.getInetAddress();
//			inetAddress.getHostName();
//			2. 静态创建，通过主机名或者IP静态创建
			InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
			System.out.println("host name: "+inetAddress2.getHostName());
			System.out.println("host address: "+inetAddress2.getHostAddress());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
