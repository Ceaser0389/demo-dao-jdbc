package application;

import java.sql.Date;

import model.dao.SellerDao;
import model.dao.impl.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1,"books");
		System.out.println(obj);
		
		
		Seller seller = new Seller(21 , "bob" , "bob@gmail.com" , 
		 new Date(0, 0, 0), 3000.00 , obj);

		
		System.out.println(seller);
		
		
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		
		
		
	}

}
