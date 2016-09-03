package com.ys.socket.sericeandclient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class myruning extends Thread {
	private Socket ser;

	public myruning(Socket ser) {
		this.ser = ser;
	}

	@Override
	public void run() {
		try {
			while (true && !ser.isClosed()) {
				// TODO Auto-generated method stub
				// 得到输入流 可能得到的数据流不全，我们可以使用封装的DataInputStream
				DataInputStream dataInputStream = new DataInputStream(
						ser.getInputStream());
				String getStr = dataInputStream.readUTF();
				if (!getStr.trim().equals("exit")) {
					System.out.println("get data from Client...." + getStr);
					// 输出流，输出数据到Client
					DataOutputStream dataOutputStream = new DataOutputStream(ser.getOutputStream());
					String str = "hello this is the info from Server";
					dataOutputStream.writeUTF(str);
				}else{
				break;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}