//package cproject;
//import java.util.*;
//
//public class UserHandler{
//	Scanner s = new Scanner(System.in);
//	AdminHandler adminHandler = new AdminHandler();
//	User userList[] =  new User[5];
//	Admin adminList[];
//	
//	int userCnt;
//	int adminCnt;
//	int AdminCheck;
//	int loginCnt = 0;
	
//	void CheckAD() {
//		System.out.print("�����ڶ�� 1�� �Է��ϰ� ����ڶ�� 2fmf �Է��ϼ��� :");
//		AdminCheck = Integer.parseInt(s.nextLine());
//	}

	
//	void joinUser() {		
//		System.out.print("�̸��� �Է��ϼ��� : ");
//		String Name = s.nextLine();
//		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
//		String Tel = s.nextLine();
//		System.out.print("ID�� �Է��ϼ��� : ");
//		String ID = s.nextLine();
//		System.out.print("PW�� �Է��ϼ��� : ");
//		String PW = s.nextLine();
//		
//		User user = new User(Name, Tel, ID, PW);
//		userList[userCnt] = user;
//		userCnt++;
//
//		
//	}
//	
//	int userLogin() {
//		System.out.print("����� ID�� �Է����ּ��� : ");
//		String ID = s.nextLine();
//		System.out.print("����� PW�� �Է����ּ��� : ");
//		String PW = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null) {
//				if(ID.equals(userList[i].ID)&&PW.equals(userList[i].PW)) {
//					System.out.println("�α��� ����");break;
//				}//else
//					//System.out.println("�Է��Ͻ� ID�� PW�� ��ġ���� �ʽ��ϴ�.");				
//			}else
//			{
//				System.out.println("��ϵ��� ���� ������Դϴ�. ȸ�������� �����մϴ�.");
//				joinUser();break;
//			}
//		}
//		loginCnt = 1;
//		return loginCnt;
//	}
//	
//	void userLogout() {
//		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
//		loginCnt = 0;
//	}
	
//	void showUser() {
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null )
//            {
//				userList[i].showUser();
//            }
//			//else 
//				//System.out.println("�Էµ� ������ �����ϴ�. ����ڸ� �߰����ּ���.");
//		}
//	}
//	
//	void findID() {
//		System.out.print("����� �̸��� �Է����ּ��� : ");
//		String Name = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null) {
//				if(Name.equals(userList[i].Name)) {
//					System.out.println(userList[i].Name+"�� ID�� "+userList[i].ID+"�Դϴ�.");
//				}
//			}
//		}
//	}
//	
//	void findPW() {
//		System.out.print("����� ID�� �Է����ּ��� : ");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]!=null) {
//				if(ID.equals(userList[i].ID)) {
//					System.out.println(userList[i].ID+"�� PW�� "+userList[i].PW+"�Դϴ�.");
//				}
//			}
//		}
//	}
//	
//	void removeUser(){
//		System.out.println("������ Ż���Ͻðڽ��ϱ�? : Ż��� ���̵� �Է�");
//		String ID = s.nextLine();
//		
//		for(int i = 0; i<userList.length;i++)
//		{
//			if(userList[i]==null) {
//				//System.out.println("null���Դϴ�.");
//			}
//			else if(ID.equals(userList[i].ID)) {
//				userList[i]= null;
//					System.out.println(ID+"�� �����Ǿ����ϴ�.");
//					loginCnt = 0;
//			}//else 
//				//System.out.println("��ġ ����");
//		}
//	}
//	
//}
