package aplicattion;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(sellerDao);
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
