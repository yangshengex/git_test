package com.ys.webserverclientTest;

import com.ys.webserverclient.DIYWebServer;
import com.ys.webserverclient.DIYWebServerService;

public class DIYWebServerClientTest {
	public static void main(String[] args) {
		//在DIYWebServer+Service类中找到一个get+DIYWebServer+port的方法得到接口，
		DIYWebServer diyWebServer = new DIYWebServerService().getDIYWebServerPort();
		//使用接口的方法，返回服务处理会后的值
		System.out.println(diyWebServer.queryTheWeather("beijing "));
	}
}
