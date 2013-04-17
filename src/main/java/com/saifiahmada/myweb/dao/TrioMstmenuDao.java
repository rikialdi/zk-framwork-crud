package com.saifiahmada.myweb.dao;

import java.util.List;

import com.saifiahmada.myweb.bean.TrioMstmenu;
import com.saifiahmada.myweb.hibernate.TrioGenericDao;

/** @author Saifi Ahmada Feb 7, 2013 4:47:13 PM  **/

public interface TrioMstmenuDao extends TrioGenericDao<TrioMstmenu> { 
	public List<TrioMstmenu> getListMenuByUser(String user);
}

