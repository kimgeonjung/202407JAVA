package shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private int stock;
}
