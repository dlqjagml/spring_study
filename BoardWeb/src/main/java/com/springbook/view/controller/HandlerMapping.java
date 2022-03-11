package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.board.GetBoardListController;
import com.springbook.view.user.LoginController;

public class HandlerMapping {
	//map은 <key, value>로 값을 지정한다.
	private Map<String, Controller> mappings;
	
	
	public HandlerMapping(){
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
	}
	
	public Controller getController(String path){
		return mappings.get(path);
		
	}

	
}
