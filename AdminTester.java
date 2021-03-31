package cproject;
import java.util.*;

public class AdminTester {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AdminHandler adminHandler = new AdminHandler();
		BookHandler b1 = new BookHandler();
		
		int checkNum;
		int num = 0;
		int retry = 0;
		
		System.out.print("�����ڸ� 1, ȸ���̸� 2�� �Է����ּ��� : ");
		checkNum = adminHandler.CheckAD();
		
		do {
			if(checkNum==1) {
				//do {
					 if(adminHandler.adminLoginCnt == 0) {
								adminHandler.adminLogin();
							
						 }else {
						 System.out.println("������ �����Դϴ�. ����� �����ϼ��� : ");
						 System.out.println("1 : ȸ�� ���");
						 System.out.println("2 : ȸ�� ���� ���");
						 System.out.println("3 : ȸ�� �˻�");
						 System.out.println("4 : ȸ�� ����");
						 System.out.println("5 : ȸ�� ����");
						 System.out.println("0 : ��ɼ���â���� �̵�");
						num = s.nextInt();
						
						switch(num)
						{
							case 1 : adminHandler.registerUser();break;
							case 2 : adminHandler.showUser();break;
							case 3 : adminHandler.searchUser();break;
							case 4 : adminHandler.deleteUser();break;
							case 5 : adminHandler.sortUser();break;
							case 0 : break;
						}
					}
				//}while(num!=0);
			}
				
				else if(checkNum==2) {
					//do {
					 if(adminHandler.userLoginCnt == 0) {
						System.out.println("��� ����");
						System.out.println("1 : �α��� ");
						System.out.println("2 : ȸ������ ");
						num = s.nextInt();
						if(num == 1)
							adminHandler.userLogin();
						else if(num == 2) {
							adminHandler.registerUser();
							}

					 }else {
					 System.out.println("����� �����Դϴ�. ����� �����ϼ��� : ");
					 System.out.println("1 : ���� ã��");
					 System.out.println("2 : ȸ�� Ż��");
					 System.out.println("3 : ���� ����");
					 System.out.println("4 : �α׾ƿ� ");
					 System.out.println("5 : ȸ������");
					num = s.nextInt();
					
					switch(num)
					{
						case 1 : System.out.print("1 : ID ã�� 2 : PW ã��");
							num = s.nextInt();
						if(num == 1)
						{
							adminHandler.findID();break;
						}
						else if(num == 2)
						{
							adminHandler.findPW();break;
						}else
							System.out.println("�߸����Է�");
						
						case 2 : adminHandler.removeUser();break;
						case 3 : 
							do {
						System.out.println("\n���ϴ� �޴��� �����ϼ���");
				         System.out.println("1. ���� �Է�");
				         System.out.println("2. ���� ���");
				         System.out.println("3. ���� �˻�");
				         System.out.println("4. ���� ����");
				         System.out.println("5. ���� ����");
				         System.out.println("6. ���� �ݳ� �뿩");
				         System.out.println("0. ����");
				         num =s.nextInt();
				         
				         switch(num) {
				         case 1 : System.out.println("å�� ������ 5������ �Է� �����ϸ� 5�����ķ� �Է� �� �����Ͱ� �ʱ�ȭ�˴ϴ�.");
				        	 b1.inputBook();break;
				         case 2 : b1.outBook(); break;
					     case 3 : System.out.println("���� �˻�  : 1, ���� �˻�  : 2, ���ǻ� �˻� : 3, ���ڵ� �˻� : 4, ���� �˻� : 5, �Ǹŷ� �˻� : 6, ���� �˻� : 7 "); 
					            num = s.nextInt();
					            if(num==1) {
					            b1.searchBook(); break;
					            }
					            else if(num==2){
					               b1.searchBook2(); break;
					            }
					            else if(num==3){
					               b1.searchBook3(); break;
					            }
					            else if(num==4){
					               b1.searchBook4(); break;
					            }
					            else if(num==5){
					               b1.searchBook5(); break;
					            }
					            else if(num==6){
					               b1.searchBook6(); break;
					            }
					            else if(num==7){
					               b1.searchBook7(); break;
					            }else 
					               System.out.println("�߸��� ���Դϴ�.");break;
					            
					         case 4 : b1.sortBook(); break;
					         case 5 : System.out.println("å �������� ���� : 1, å �ڵ�� ����  : 2, ������� �����Ǵ��� ����: 3");
						         num = s.nextInt();
						         if(num == 1) {
						            b1.deleteBook1(); break;
						         }
						         else if(num == 2) {
						            b1.deleteBook2(); break;
						         }
						         else if(num == 3) {
						            b1.deleteBook3(); break;
						         }
					            else
					               System.out.println("�߸��� ���Դϴ�.");break;
					     
					         case 6 : System.out.println("�����ϱ�  : 1, �ݳ��ϱ�  : 2"); 
					         num = s.nextInt();
					            if(num == 1) {
					            b1.borrowBook(); break;
					            }
					            else if(num == 2) {
					               b1.returnBook();break;
					            }
					            else
					               System.out.println("�߸��� ���Դϴ�.");break;
					         }
							
							}while(num!=0);	
							if(num == 0)
								System.out.println();
						case 4 : adminHandler.userLogout();break;
						case 5 : adminHandler.showUser();break;
						}
					}
				//}while(checkNum!=0);
				}
				else
					System.out.println("�߸��� �Է� ���Դϴ�.");
				
		System.out.println("��� �Ͻ÷��� 1��, ������/����� ��ȯ�� 2�� ����� 0�� ? : ");
		retry = s.nextInt();
		if(retry == 0)
		{
			adminHandler.userLogout();
		}else if(retry ==2)
		{
			System.out.print("�����ڸ� 1, ȸ���̸� 2�� �Է����ּ��� : ");
			checkNum = adminHandler.CheckAD();
		}
	}while(retry!=0);
	}
}
