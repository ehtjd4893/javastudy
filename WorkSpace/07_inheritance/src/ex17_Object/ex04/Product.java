package ex17_Object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

	private String model,manufacturer, Date;

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof Product) {
			Product p = (Product)obj;
			if(this.model.equals(p.getModel()) && this.manufacturer.equals(p.getManufacturer()))
				return true;
			return false;
		}
		return false;
	}
	
	
}
