package com.jh.example.chap05_constructor.run;

import java.util.Date;

import com.jh.example.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		u1.inform();
		
		User u2 = new User("user01","pass01", "서재혁");
		u2.inform();
		
		User u3 = new User("user01", "pass01", "서재혁", new Date());
		u3.inform();
	}

}
