package com.saifiahmada.myweb.dao;

import java.util.List;

import com.saifiahmada.myweb.bean.TrioMstmenu;
import com.saifiahmada.myweb.bean.TrioMstuser;
import com.saifiahmada.myweb.hibernate.TrioGenericDao;

/** @author Saifi Ahmada Feb 7, 2013 4:52:49 PM  **/

public interface TrioMstuserDao extends TrioGenericDao<TrioMstuser> { 
	public TrioMstuser findUserByUsername(String username);
	
}

