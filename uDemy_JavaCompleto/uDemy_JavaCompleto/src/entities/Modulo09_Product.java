//uDemy, curso Java Completo, secao 9 ??, aula ??
//codigo em https://github.com/marcmir70/uDemy_JavaCompleto_09_consThisSobrEncap
package entities;

public class Modulo09_Product {
	public String name;
	public double price;
	public int quantity;
	
	public Modulo09_Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Modulo09_Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;		
	}
	
	public String toString() { //sobreposicao
		return name + ", $ " 
			+ String.format("%.2f", price) + ", " 
			+ quantity + " units, Total: $ " 
			+ String.format("%.2f", totalValueInStock());
	}

}
