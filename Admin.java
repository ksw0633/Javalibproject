package cproject;

public class Admin extends User{
	int AdminCheck;
	
	public Admin() {}
	
	Admin(String Name, String Tel, String ID, String PW, int AdminCheck){
		super(Name, Tel, ID, PW);
		this.AdminCheck = AdminCheck;
	}
	
	void showAdmin() {
		super.showUser();
		System.out.println("������ ���� : "+this.AdminCheck);
		System.out.println();
	}
	
}
