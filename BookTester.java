package cproject;

import java.util.Scanner;

public class BookTester {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      BookHandler b1 = new BookHandler();
      
      int sel;
      
      do
      {
         System.out.println("\n원하는 메뉴를 선택하세요");
         System.out.println("1. 도서 입력");
         System.out.println("2. 도서 출력");
         System.out.println("3. 도서 검색");
         System.out.println("4. 도서 정렬");
         System.out.println("5. 도서 삭제");
         System.out.println("6. 도서 반납 대여");
         System.out.println("0. 종료");
         sel =s.nextInt();
         
         switch(sel) {
         case 1 : System.out.println("책의 개수는 5개까지 입력 가능하며 5개이후로 입력 시 데이터가 초기화됩니다.");
        	 b1.inputBook();break;
         case 2 : b1.outBook(); break;
         case 3 :System.out.println("제목 검색  : 1, 저자 검색  : 2, 출판사 검색 : 3, 북코드 검색 : 4, 가격 검색 : 5, 판매량 검색 : 6, 연도 검색 : 7 "); 
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
               System.out.println("잘못된 값입니다.");break;
            
         case 4 : b1.sortBook(); break;
         case 5 : System.out.println("책 제목으로 삭제 : 1, 책 코드로 삭제  : 2, 어떤구조로 삭제되는지 실행: 3");
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
               System.out.println("잘못된 값입니다.");break;
     
         case 6 : System.out.println("대출하기  : 1, 반납하기  : 2"); 
         sel = s.nextInt();
            if(sel == 1) {
            b1.borrowBook(); break;
            }
            else if(sel == 2) {
               b1.returnBook();break;
            }
            else
               System.out.println("잘못된 값입니다.");break;
         }
      }while(sel!=0);
      s.close();
   }

}