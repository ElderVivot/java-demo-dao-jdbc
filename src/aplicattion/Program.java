package aplicattion;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("");
		
		System.out.println("=== TEST 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		for( Seller seller2: sellers ) {
			System.out.println(seller2);
		}

		System.out.println("");
		
		System.out.println("=== TEST 3: Seller findAll ===");
		sellers = sellerDao.findAll();
		for( Seller seller2: sellers ) {
			System.out.println(seller2);
		}
		
		System.out.println("");
		
		System.out.println("=== TEST 4: Seller insert ===");
		Seller newSeller = new Seller(null, "Elder", "elder@gmail.com", new Date(), 2000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("");
		
		System.out.println("=== TEST 5: Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Amanda"); // altera��o de teste
		sellerDao.update(seller);
	}

}
