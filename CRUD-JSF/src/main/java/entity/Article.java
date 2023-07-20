package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String description;
	
	private String brand;
	
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Article() {
		super();
	}

	public Article(String description, String brand, float price) {
		super();
		this.description = description;
		this.brand = brand;
		this.price = price;
	}
	
	
	
}
