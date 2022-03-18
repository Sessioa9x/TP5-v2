package Model;

import java.util.Date;

public class Transaction {
	int id;
	String name;
	User user;
	float montant;
	Date date;
	
	
	public Transaction(int id, String name, User user, float montant, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
		this.montant = montant;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
