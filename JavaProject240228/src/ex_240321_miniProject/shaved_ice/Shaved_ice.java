package ex_240321_miniProject.shaved_ice;

public class Shaved_ice extends Object {

	private String name;
	private String size;
	private String cmilk;
	private String rbean;
	private String takeout;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCmilk() {
		return cmilk;
	}
	public void setCmilk(String cmilk) {
		this.cmilk = cmilk;
	}
	public String getRbean() {
		return rbean;
	}
	public void setRbean(String rbean) {
		this.rbean = rbean;
	}
	public String getTakeout() {
		return takeout;
	}
	public void setTakeout(String takeout) {
		this.takeout = takeout;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "Shaved_icd [name=" + name + ", size=" + size + ", cmilk=" + cmilk + ", rbean=" + rbean + ", price=" + price
				+", takeout=" + takeout+ "]";
	}
	
	
}
