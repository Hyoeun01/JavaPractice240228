package ex_240306;


public class Ex_06_interface_subclass_2 implements test1 {

	@Override
	public void showMenuLunch() {
		System.out.println("점심메뉴 : "+this.menuLunch);
		
	}

	@Override
	public void showMenuDrink() {
		System.out.println("마실것 : "+ this.menu_drink);
		
	}

	@Override
	public void showMenuSnack() {
		System.out.println("과자 : "+ this.menu_snack);
		
	}


	
}
