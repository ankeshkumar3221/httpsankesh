package org.simplilearn.workshop.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="prouduct")
public class Prouduct {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="prouducts")
    private String prouduct;
    @Column(name="brand")
    private String brand;
    @Column(name="price")
    private String price;
    
    
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProuduct() {
		return prouduct;
	}
	public void setProuduct(String prouduct) {
		this.prouduct = prouduct;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Prouduct() {
		super();
	}
	@Override
	public String toString() {
		return String.format("Prouduct [id=%s, prouduct=%s, brand=%s, price=%s]", id, prouduct, brand, price);
	}
	
    
    
	
	    
	}


