package cproject;

public class User implements Comparable<User> {
	String Name;
	String Tel;
	String ID;
	String PW;
	
	User(){}
	
	User(String Name, String Tel, String ID, String PW){
		this.Name = Name;
		this.Tel = Tel;
		this.ID = ID;
		this.PW = PW;
	}
	
	public void showUser() {
		System.out.println("-------------------");
		System.out.println("이름 : "+this.Name);
		System.out.println("전화번호 : "+this.Tel);
		System.out.println("ID : "+ this.ID);
		System.out.println("PW : "+this.PW);
		System.out.println();
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return Name.compareTo(((User)o).Name);
	}
}
