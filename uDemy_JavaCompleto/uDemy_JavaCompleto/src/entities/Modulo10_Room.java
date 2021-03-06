//uDemy, curso Java Completo, secao 13, aula 89 - exercicio de fixacao
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package entities;

public class Modulo10_Room {
	private String name;
	private String email;
	
	public Modulo10_Room(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() { //sobreposicao
		return name + ", " + email;
	}

}
