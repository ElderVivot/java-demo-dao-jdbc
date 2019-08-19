package model.dao;

import model.dao.impl.SellerDaoJDBC;

// Factory é um padrão de programação onde retorna sempre um objeto
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
