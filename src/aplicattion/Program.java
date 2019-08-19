package aplicattion;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department department = new Department(1, "Books");
		System.out.println(department);
		
		Seller seller = new Seller(1, "Elder", "elder@gmail.com", new Date(), 3000.0, department);
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(sellerDao);

	}

}
