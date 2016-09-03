package com.ys.diywebserver;

import javax.jws.WebService;

@WebService
public class DIYWebServer implements MeMyInterfaceServer {

	@Override
	public String queryTheWeather(String city) {
		System.out.println("this "+city+" is diyWebServer>>>>>>>>>>>>>..........");
		
		return "Server "+city+"return the result is 天气是晴转多云";
	}

	
}
