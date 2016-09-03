package com.ys.socket.sericeandclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClient {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		DataOutputStream dataOutputStream = null;
		DataInputStream dataInputStream = null;
		Scanner str = null;
		Socket ser = new Socket("127.0.0.1", 9999);

		// 得到输入流 可能得到的数据流不全，我们可以使用封装的DataInputStream
		dataInputStream = new DataInputStream(ser.getInputStream());
		// 输出流，输出数据到Server
		dataOutputStream = new DataOutputStream(ser.getOutputStream());
		// String str ="hello this is the info from Client";
		while (true) {
			try {
				String netStr = new Scanner(System.in).next();
				if ("exit".equals(netStr)) {
					dataOutputStream.writeUTF(netStr);
					dataOutputStream.flush();
					ser.close();
					break;
				}
				dataOutputStream.writeUTF(netStr);
				System.out.println("get data from Server...."
						+ dataInputStream.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("开始推出");
	}
}
