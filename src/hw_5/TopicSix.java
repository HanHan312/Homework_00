package hw_5;
abstract class  Pen {
	private String brand;
	private double price;
	
	public Pen() {
	}
	public Pen(String brand,double price) {
		if(price>0)
			this.price=price;
		else 
			System.out.println("請確認售價");
	}
	public String getName() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String brand) {
		this.brand=brand;
	}
	public void setPrice(double price) {
			this.price=price;
	}
	public abstract void write();
}

class Pencil extends Pen{
	public void write() {
		System.out.print("削鉛筆在寫");
	}
	public Pencil(String brand,int price) {
		super(brand,price);
	}
	public double getPrice() {
		return (super.getPrice()*0.8);
	}
}
class InkBrush extends Pen {
	public void write() {
		System.out.print("沾墨汁在寫");
	}
	public InkBrush (String brand,int price) {
		super(brand,price);
	}
	public double getPrice() {
		return (super.getPrice()*0.9);
	}

}

public class TopicSix {
	public static void main(String[] args) {
		Pen[] hw = new Pen[2];

		hw[0] = new Pencil("百樂", 20);
		hw[1] = new InkBrush("雄獅", 50);
		for (int i = 0; i < hw.length; i++) {
			System.out.print("價格為:" + hw[i].getPrice());
			hw[i].write();
			System.out.println();
		}

	}

}
