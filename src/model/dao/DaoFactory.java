package model.dao;

import model.dao.impl.SellerDaoJDBC;

// Factory � um padr�o de programa��o onde retorna sempre um objeto
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
