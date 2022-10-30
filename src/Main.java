
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product1=new Product();
		//Set Value
		product1.setName("A Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setImageUrl("image1.png");
		

		//Get value
		//System.out.println(product.name);
		
		Product product2=new Product();
	
		Product product3=new Product();
	
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<ul>");	
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0542385872");
		individualCustomer.setCustomerNumber("123451");
		individualCustomer.setFirstName("Egemen");
		individualCustomer.setLastName("Ünsür");
		
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("053331");
		corporateCustomer.setTaxNumber("12121111");
		corporateCustomer.setCustomerNumber("54321");
				
		Customer[] customers= {individualCustomer,corporateCustomer};
	}

	/*public static int topla(int... sayilar){ //Array görevi görür
	int toplam=0;
	for(int sayi:sayilar)
	{
		toplam+=sayi;
	}
		return toplam;
	}*/
}
