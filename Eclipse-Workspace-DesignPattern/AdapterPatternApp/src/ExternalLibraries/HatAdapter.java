package ExternalLibraries;

import com.techlab.model.Item;

public class HatAdapter implements Item {
	private Hat hat;
	
	public HatAdapter(Hat h) {
		this.hat = h;
	}

	@Override
	public String itemName() {
		// TODO Auto-generated method stub
		return hat.getLongName();
	}

	@Override
	public double itemPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}

}
