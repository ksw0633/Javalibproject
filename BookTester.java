package cproject;

import java.util.Scanner;

public class BookTester {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      BookHandler b1 = new BookHandler();
      
      int sel;
      
      do
      {
         System.out.println("\n���ϴ� �޴��� �����ϼ���");
         System.out.println("1. ���� �Է�");
         System.out.println("2. ���� ���");
         System.out.println("3. ���� �˻�");
         System.out.println("4. ���� ����");
         System.out.println("5. ���� ����");
         System.out.println("6. ���� �ݳ� �뿩");
         System.out.println("0. ����");
         sel =s.nextInt();
         
         switch(sel) {
         case 1 : System.out.println("å�� ������ 5������ �Է� �����ϸ� 5�����ķ� �Է� �� �����Ͱ� �ʱ�ȭ�˴ϴ�.");
        	 b1.inputBook();break;
         case 2 : b1.outBook(); break;
         case 3 :System.out.println("���� �˻�  : 1, ���� �˻�  : 2, ���ǻ� �˻� : 3, ���ڵ� �˻� : 4, ���� �˻� : 5, �Ǹŷ� �˻� : 6, ���� �˻� : 7 "); 
            sel = s.nextInt();
            if(sel==1) {
            b1.searchBook(); break;
            }
            else if(sel==2){
               b1.searchBook2(); break;
            }
            else if(sel==3){
               b1.searchBook3(); break;
            }
            else if(sel==4){
               b1.searchBook4(); break;
            }
            else if(sel==5){
               b1.searchBook5(); break;
            }
            else if(sel==6){
               b1.searchBook6(); break;
            }
            else if(sel==7){
               b1.searchBook7(); break;
            }else 
               System.out.println("�߸��� ���Դϴ�.");break;
            
         case 4 : b1.sortBook(); break;
         case 5 : System.out.println("å �������� ���� : 1, å �ڵ�� ����  : 2, ������� �����Ǵ��� ����: 3");
	         sel = s.nextInt();
	         if(sel == 1) {
	            b1.deleteBook1(); break;
	         }
	         else if(sel == 2) {
	            b1.deleteBook2(); break;
	         }
	         else if(sel == 3) {
	            b1.deleteBook3(); break;
	         }
            else
               System.out.println("�߸��� ���Դϴ�.");break;
     
         case 6 : System.out.println("�����ϱ�  : 1, �ݳ��ϱ�  : 2"); 
         sel = s.nextInt();
            if(sel == 1) {
            b1.borrowBook(); break;
            }
            else if(sel == 2) {
               b1.returnBook();break;
            }
            else
               System.out.println("�߸��� ���Դϴ�.");break;
         }
      }while(sel!=0);
      s.close();
   }

}