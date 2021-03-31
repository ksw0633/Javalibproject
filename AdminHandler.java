package cproject;
import java.util.*;
import java.util.regex.Pattern;

public class AdminHandler {
	Scanner s;
	User userList[] = new User[5];
	//Admin adminList[] = new Admin[1];
	Admin admin = new Admin();
	
	int userCnt;
	int AdminCheck;
	int adminLoginCnt = 0;
	int userLoginCnt = 0;
	String adminID = "admin";
	String adminPW = "admin";
	
	public AdminHandler() {
		s = new Scanner(System.in);

			
	}
	
	int CheckAD() {
		//System.out.print("�����ڶ�� 1�� �Է��ϰ� ����ڶ�� 0�� �Է��ϼ��� :");
		AdminCheck = Integer.parseInt(s.nextLine());
		return AdminCheck;
	}
	
	
	int adminLogin() {

		while(true)
		{
			System.out.print("������ ID�� �Է����ּ��� : ");
			String ID = s.nextLine();
			System.out.print("������ PW�� �Է����ּ��� : ");
			String PW = s.nextLine();
			
			if(ID.equals(adminID)&&PW.equals(adminPW)) {
				System.out.println("������ �α��� ����");break;
			}else
				System.out.println("�Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.");		
		}
		adminLoginCnt = 1;
		return adminLoginCnt;
	}
	
	void adminLogout() {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		adminLoginCnt = 0;
	}
	
	
	int userLogin() {
		System.out.print("����� ID�� �Է����ּ��� : ");
		String ID = s.nextLine();
		System.out.print("����� PW�� �Է����ּ��� : ");
		String PW = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)&&PW.equals(userList[i].PW)) {
					System.out.println("�α��� ����");break;
				}//else
					//System.out.println("�Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.");				
			}else
			{
				System.out.println("��ϵ��� ���� ������Դϴ�. ȸ�������� �����մϴ�.");
				registerUser();break;
			}
		}
		userLoginCnt = 1;
		return userLoginCnt;
	}
	
	void userLogout() {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		userLoginCnt = 0;
	}
	void registerUser() {	
		
		 if(userCnt == userList.length)
         {
        	 System.out.println("���� ������ ��� �ʱ�ȭ�մϴ�. �ٽ� �Է��ϼ���");
        	 for(int i = 0; i<userList.length;i++)
        	 {
        		 
        		 userCnt = 0;
        		 userList[i] = null;
        	 }
         }
		
	      String sPattern = "^[a-zA-Z0-9��-�R\\s]*$";
	      int retry = 0;
	      boolean regex;
	      
	      do {
				System.out.print("�̸��� �Է��ϼ��� : ");
				String Name = s.nextLine();
				 regex = Pattern.matches(sPattern, Name);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
		         
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				String Tel = s.nextLine();
				regex = Pattern.matches(sPattern, Tel);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
		         
				System.out.print("ID�� �Է��ϼ��� : ");
				String ID = s.nextLine();
				regex = Pattern.matches(sPattern, ID);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
		         
				System.out.print("PW�� �Է��ϼ��� : ");
				String PW = s.nextLine();
				regex = Pattern.matches(sPattern, PW);
		         if(regex != true) {
		            System.out.println("���ڸ� ������ ���ڿ��� �Է��ϼ��� ");
		            break;
		         }
				
				AdminCheck = 1;
				
				User user = new User(Name, Tel, ID, PW);
				userList[userCnt] = user;
				userCnt++;
				System.out.println("ȸ�� ����� �Ϸ�Ǿ����ϴ�.");
				
				
				
				System.out.println("�� �Է��Ͻðھ��? yes..1 no..0");
		        retry = s.nextInt();
		        s.nextLine();
	      }while(retry!=0);
	}
	
	void showUser() {
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null )
            {
				userList[i].showUser();
            }
			//else 
				//System.out.println("�Էµ� ������ �����ϴ�. ����ڸ� �߰����ּ���.");
		}
	}
	
	
	
	void findID() {
		System.out.print("����� �̸��� �Է����ּ��� : ");
		String Name = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(Name.equals(userList[i].Name)) {
					System.out.println(userList[i].Name+"�� ID�� "+userList[i].ID+"�Դϴ�.");
				}
			}
		}
	}
	
	void findPW() {
		System.out.print("����� ID�� �Է����ּ��� : ");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)) {
					System.out.println(userList[i].ID+"�� PW�� "+userList[i].PW+"�Դϴ�.");
				}
			}
		}
	}
	
	void removeUser(){
		System.out.println("������ Ż���Ͻðڽ��ϱ�? : Ż��� ���̵� �Է�");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]==null) {
				//System.out.println("null���Դϴ�.");
			}
			else if(ID.equals(userList[i].ID)) {
				userList[i]= null;
				System.out.println(ID+"�� �����Ǿ����ϴ�.");
				userCnt--;
				userLoginCnt = 0;
					
			}//else 
				//System.out.println("��ġ ����");
		}
	}
	
	void searchUser(){
		System.out.print("�˻��� ����� ID�� �Է����ּ���");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)) {
					System.out.println("ã���ô� ����� ������ ");
					userList[i].showUser();
					System.out.print(" �Դϴ�. ");
				}
//				else 
//					System.out.println("�Ǥ̤�");
			}
		}
	}
	
	void deleteUser() {
		System.out.print("������ ����� ID�� �Է����ּ��� :");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
			{
				if(userList[i]==null) {
					//System.out.println("null���Դϴ�.");
				}
				else if(ID.equals(userList[i].ID)) {
						userList[i]= null;
						System.out.println(ID+"�� �����Ǿ����ϴ�.");
						userCnt--;
				}//else 
					//System.out.println("��ġ ����");
			}
		}
	
	void sortUser() {
		System.out.println("��������� �����մϴ�.");
		 for(int i = 0; i<userList.length;i++)
         {
         if(userList[i]==null )
            {
               userList[i] = new User("a"+i,"010"+i,"user"+(i+1),"user"+(i+1));
               System.out.println("�����ڸ� �߰��Ͽ����ϴ�.");
               userCnt++;
            } 
         }
		 
		Arrays.sort(userList);
		
		for(int i = 0; i < userList.length;i++)
		{
			userList[i].showUser();	
		}
	}
	

}
