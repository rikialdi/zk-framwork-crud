package com.saifiahmada.myweb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.myweb.bean.TrioMstaccessrole;
import com.saifiahmada.myweb.dao.TrioMstaccessroleDao;
import com.saifiahmada.myweb.facade.MasterFacade;

/** @author Saifi Ahmada Feb 8, 2013 2:37:47 PM  **/

public class TestAccessRole {
	
	public static void main(String[] args) {
		
		System.out.println("Mulai bro");
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MasterFacade mf = (MasterFacade) ap.getBean("masterFacade");
		
		TrioMstaccessroleDao dao = mf.getTrioMstaccessroleDao();
		
		TrioMstaccessrole ar = new TrioMstaccessrole("ROLE02", "T10GLMST001");
		
		ar.setVstat("A");
		
		dao.save(ar, "saifi");
		
		System.out.println("Selesai && Sukses");
		
		
		
	}
	
}

