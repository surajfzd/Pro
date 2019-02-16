package com.cap.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cap.bean.Sale;
import com.cap.dao.ISaleRepo;
import com.cap.dao.SaleRepo;
import com.cap.service.ISaleService;
import com.cap.service.SaleService;

public class MainMethod {
	public static void main(String[] args)
	{
		ISaleRepo repo=new SaleRepo();
		ISaleService service=new SaleService(repo);
		
		Scanner scanner=new Scanner(System.in);
		
		
			
			boolean check=true;
			int flag=1;
			System.out.println("Enter Product Code");
			int product=scanner.nextInt();
			scanner.nextLine();
			while(check)
			{
				if(service.validateProductCode(product))
					check=false;
				else
					{
						System.out.println("Enter valid product code");
						product=scanner.nextInt();
						scanner.nextLine();
					}
			}
			check=true;
			System.out.println("Enter product quantity");
			int quantity=scanner.nextInt();
			scanner.nextLine();
			while(check)
			{
				if(service.validateQuantity(quantity))
					check=false;
				else
				{
					System.out.println("Enter quantity again");
					quantity=scanner.nextInt();
					scanner.nextLine();
				}
			}
			
			check=true;
			System.out.println("Enter product category");
			String cat =scanner.nextLine();
			while(check)
			{
				if(service.validateProdCat(cat))
					check=false;
				else
				{
					System.out.println("Enter category again");
					cat=scanner.nextLine();
				}
			}
			if(cat.equals("Electronics"))
			{
				flag=0;
			}
			
			check=true;
			System.out.println("Enter product name");
			String proname =scanner.nextLine();
			while(check)
			{
				
				if(service.validateProdName(proname, flag))
					check=false;
				else
				{
					System.out.println("Enter proname again");
					proname=scanner.nextLine();
				}
			}
			
			
			
			check=true;
			System.out.println("Enter product price");
			int price =scanner.nextInt();
			scanner.nextLine();
			while(check)
			{
				if(service.validateProductPrice(price))
					check=false;
				else
				{
					System.out.println("Enter product price again");
					price=scanner.nextInt();
					scanner.nextLine();
				}
			}
			int saleid=(int)Math.random()*1000;
			Sale sale=new Sale();
			sale.setSaleId(saleid);
			sale.setCatrgory(cat);
			sale.setProdCode(product);
			sale.setProdName(proname);
			sale.setQuantity(quantity);
			sale.getSaleDate();
			sale.setLineTotal(price*quantity);
			

			
			System.out.println("Quantity: " +sale.getQuantity());
			System.out.println("Total: " +sale.getLineTotal());
			
			System.out.println("*"+service.insertSaleDetails(sale));
			
			
		
	}

}
