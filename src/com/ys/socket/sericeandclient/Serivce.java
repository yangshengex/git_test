package com.ys.socket.sericeandclient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serivce {
	
	public static void main(String[] args) {
		
		//一直监听client的连接
			try {
				ServerSocket serverSocket = new ServerSocket(9998);
				//开始接受数据
				while(true){
				Socket ser = serverSocket.accept();
				myruning myruning = new myruning(ser);
				myruning.start();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

}
