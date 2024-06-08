package com.itsc.ioc;

public class Launcher_class {

	public static void main(String[] args) {
		Student s = context.getBean(Student.class);
		s.setid("");
		s.setname("");
		s.setemail();

	}

}


//yaredmgmt@gmail.com