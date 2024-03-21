package ex_240321_miniProject.shaved_ice;

public class Stock {

	private int milk;
	private int cmilk;
	private int rbean;
	private int bean;
	private int berry;
	private int mango;
	private int green;
	private int choco;
	
	public Stock (){}
	
	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getCmilk() {
		return cmilk;
	}

	public void setCmilk(int cmilk) {
		this.cmilk = cmilk;
	}

	public int getRbean() {
		return rbean;
	}

	public void setRbean(int rbean) {
		this.rbean = rbean;
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getBerry() {
		return berry;
	}

	public void setBerry(int berry) {
		this.berry = berry;
	}

	public int getMango() {
		return mango;
	}

	public void setMango(int mango) {
		this.mango = mango;
	}


	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getChoco() {
		return choco;
	}

	public void setChoco(int choco) {
		this.choco = choco;
	}




	@Override
	public String toString() {
		return String.format("Stock [milk=%s, cmilk=%s, rbean=%s, bean=%s, berry=%s, mango=%s, green=%s, choco=%s]",
				milk, cmilk, rbean, bean, berry, mango, green, choco);
	}
	
	
	
}

