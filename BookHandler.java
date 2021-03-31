package cproject;
import java.util.*;
import java.util.regex.Pattern;

import cproject.Book;

public class BookHandler {
   Book bookList[] = new Book[5];//x(array)
   Vector<Book> BookVector = new Vector<Book>();//declaring new vector

   int bookCnt = 0;//x(array)
   Scanner s;
   
   public BookHandler() {
      s= new Scanner(System.in);   
   }
   
   void inputBook(){
      String sPattern = "^[a-zA-Z0-9�-�R\\s]*$";
      int retry = 0;
      boolean regex;
      
      do
      {
    	  //if(bookList[bookCnt]==null)
    	 // {
    			  
    		 
         System.out.print("å  � : ");
         String bookTitle = s.nextLine();
         regex = Pattern.matches(sPattern, bookTitle);
         if(regex != true) {
            System.out.println("�ڸ� � �ڿ� �Է�ϼ� ");
            break;
         }
         
         System.out.print("å  � : ");
          String bookAuthor = s.nextLine();
          regex = Pattern.matches(sPattern, bookAuthor);
          if(regex != true) {
             System.out.println("�ڸ� � �ڿ� �Է�ϼ� ");
             break;
          }
          
         System.out.print("�ǻ� : ");
         String bookPublisher = s.nextLine();
         regex = Pattern.matches(sPattern, bookPublisher);
         if(regex != true) {
            System.out.println("�ڸ� � �ڿ� �Է�ϼ� ");
            break;
         }
         
         System.out.print("å  �ڵ�: ");
         String bookCode = s.nextLine();
         regex = Pattern.matches(sPattern, bookCode);
         if(regex != true) {
            System.out.println("�ڸ� � �ڿ� �Է�ϼ� ");
            break;
         }
         
         System.out.print("å � : ");
         int bookPrice = 0;
         
         if(!s.hasNextInt()||(bookPrice= s.nextInt())<0) {
            System.out.println("� �Է�ϼ� ");
            break;
         }
         
         System.out.print("å �Ǹŷ� : ");
         int bookSale = 0;
         if(!s.hasNextInt()||(bookSale= s.nextInt())<0) {
            System.out.println("� �Է�ϼ� ");
            break;
         }
         
         
         System.out.print("å �ǿ� : ");
         int bookYear = 0;
         if(!s.hasNextInt()||(bookYear= s.nextInt())<0) {
            System.out.println("� �Է�ϼ� ");
            break;
         }
         s.nextLine();
         
         int borrow = 0;
         
         Book book = new Book(bookTitle, bookAuthor, bookPublisher, bookCode, bookPrice, bookSale, bookYear, borrow);
         
         BookVector.add(book);//adding the input book at the end of book vector
         bookList[bookCnt] = book;//x(array)
         bookCnt++;//x(array)
         

         if(bookCnt == bookList.length) //x(array)
         {
        	 System.out.println("�迭 � � �ʱ�ȭ�մϴ�. �ٽ� �Է�ϼ�");
        	 for(int i = 0; i<bookList.length;i++)
        	 {
        		 
        		 bookCnt = 0;
        		 bookList[i] = null;
        	 }
         }
    		  
    	//  }
         System.out.println("� �Է�Ͻðھ�? yes..1 no..0");
         retry = s.nextInt();
         s.nextLine();
      }while(retry!=0);
   }
   
   void outBook() {
      //for(int i = 0; i<bookList.length; i++)//x(array)
      for(int i = 0; i < BookVector.size(); i++)
      {
         //if(bookList[i]!=null)//x(array)
         if(BookVector.get(i) != null)
         {
         System.out.println("-------------");
         System.out.println("å � : " + bookList[i].getBookTitle());
         System.out.println("å � : " + bookList[i].getBookAuthor());
         System.out.println("�ǻ�: " + bookList[i].getBookPublisher());
         System.out.println("å �ڵ� : " + bookList[i].getBookCode());
         System.out.println("å � : " + bookList[i].getBookPrice());
         System.out.println("å �Ǹŷ� : " + bookList[i].getBookSale());
         System.out.println("å �ǿ� : " + bookList[i].getBookYear());
         System.out.println();
         }
      }
   }
   
   void searchBook() {
      
      System.out.print("å � �Է�ּ� : ");
      String bT = s.nextLine();
      
      //for(int i = 0; i<bookList.length;i++)//x(array)
      for(int i = 0; i < BookVector.size(); i++)
      {
         //if(bookList[i]!=null)//x(array)
         if(BookVector.get(i) != null)
         {
            //if(bT.equals(bookList[i].getBookTitle()))//x(array)
            if(bT.equals(BookVector.get(i).getBookTitle()))
            {
               //System.out.println("å� � "+bookList[i].getBookTitle()+"�Դϴ�.");//x(array) 
              System.out.println("책의 제목은 " + BookVector.get(i).getBookTitle() + "입니다.");
               break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void searchBook2() {
      
      System.out.print("å �ڸ� �Է�ּ� : ");
      String bT = s.nextLine();
      
      //for(int i = 0; i<bookList.length;i++)//x(array)
      for(int i = 0; i < BookVector.size(); i++)
      {
         //if(bookList[i]!=null)//x(Array)
         if(BookVector.get(i) != null)
         {
            //if(bT.equals(bookList[i].getBookAuthor()))//x(array)
            if(bT.equals(BookVector.get(i).getBookAuthor()))
            {
               //System.out.println("å� � "+bookList[i].getBookTitle()+"�̰�, �ڴ� "+bookList[i].getBookAuthor()+"�Դϴ�."); //x(array)
               System.out.println("책의 제목은 " + BookVector.get(i).getBookTitle() + "이고, 저자는 " + BookVector.get(i).getBookAuthor() + "입니다.");
               break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void searchBook3() {
      
      System.out.print("�ǻ縦 �Է�ּ� : ");
      String bT = s.nextLine();
      
      //for(int i = 0; i<bookList.length;i++)//x(Array)
      for(int i = 0; i < BookVector.size(); i++)
      {
         //if(bookList[i]!=null)//x(array)
         if(BookVector.get(i) != null)
         {
            //if(bT.equals(bookList[i].getBookPublisher()))//x(array)
            if(bT.equals(BookVector.get(i).getBookPublisher()))
            {
               //System.out.println("å� � "+bookList[i].getBookTitle()+"�̰�, �ǻ� "+bookList[i].getBookPublisher()+"�Դϴ�.");//x(array) 
               System.out.println("책의 제목은 " + BookVector.get(i).getBookTitle() + "이고, 출판사는 " + BookVector.get(i).getBookPublisher() + "입니다.");
               break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void searchBook4() {
      
      System.out.print("�ڵ带 �Է�ּ� : ");
      String bT = s.nextLine();
      
      //for(int i = 0; i<bookList.length;i++)//x(array)
      for(int i = 0; i < BookVector.size(); i++)
      {
         //if(bookList[i]!=null)//x(array)
         if(BookVector.get(i) != null)
         {
            //if(bT.equals(bookList[i].getBookCode()))//x(array)
            if(bT.equals(BookVector.get(i).getBookCode()))
            {
               //System.out.println("å� � "+bookList[i].getBookTitle()+"�̰�, å �ڵ� "+bookList[i].getBookCode()+"�Դϴ�.");//x(array)
               System.out.println("책의 제목은 " + BookVector.get(i).getBookTitle() + "이고, 책 코드는 " + BookVector.get(i).getBookCode() + "입니다.");
                break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void searchBook5() {
      
      System.out.print("å � �Է�ּ� : ");
      int bT = s.nextInt();
      
      //for(int i = 0; i<bookList.length;i++)//x(array)
      for(int i = 0; i < BookVector.size(); i++)
      {
         //if(bookList[i]!=null)//x(array)
         if(BookVector.get(i) != null)
         {
            if(bT == bookList[i].getBookPrice())
            {
               System.out.println("å� � "+bookList[i].getBookTitle()+"�̰�, � "+bookList[i].getBookPrice()+"�Դϴ�."); break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void searchBook6() {
      
      System.out.print("å �Ǹŷ� �Է�ּ� : ");
      int bT = s.nextInt();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT==bookList[i].getBookSale())
            {
               System.out.println("å� � "+bookList[i].getBookTitle()+"�̰�, �Ǹŷ� "+bookList[i].getBookSale()+"�Դϴ�."); break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void searchBook7() {
      
      System.out.print("å � �Է�ּ� : ");
      int bT = s.nextInt();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT==bookList[i].getBookYear())
            {
               System.out.println("å� � "+bookList[i].getBookTitle()+"�̰�, � "+bookList[i].getBookYear()+"�Դϴ�."); break;
            }else
               System.out.println("ã� å� �ϴ�.");
         }
      }
   }
   
   void sortBook() {
      System.out.println("�Ǹŷ� � � �");
      
      for(int i = 0; i<bookList.length;i++)
         {
         if(bookList[i]==null )
            {
               bookList[i] = new Book("a","a","a","a",0,0,0,0);
               bookCnt++;
               System.out.println("�ڸ� �߰�Ͽ�ϴ�.");
            } 
         }
         
      Arrays.sort(bookList, Collections.reverseOrder());
      
      System.out.println();
      
      for(int i = 0; i<bookList.length;i++)
      {
         System.out.println("å �̸� : " + bookList[i].getBookTitle() + "," +(i+1) + "� : " + bookList[i].getBookSale());
      }
   }
   
   void deleteBook1() {

      System.out.print("� å � �Է�ּ� : ");
       String bT = s.nextLine();
       //System.out.println("bC : "+bookCnt);
       for (int i=0; i<bookList.length;i++) {
          if(bookList[i] == null)  
          {
             //System.out.println("null�Դϴ�.");
          }
          else if(bT.equals(bookList[i].getBookTitle())){
             bookList[i] = null;
             System.out.println(bT + " å� �Ǿ�ϴ�.");
             bookCnt--;
            // System.out.println("bC : "+bookCnt);
            // System.out.println("i : "+i);
             if(bookCnt == -1) {
            	 ++bookCnt;
//            	 //i = 0;
//            	 System.out.println("bC : "+bookCnt);
//            	 //System.out.println("bL[bC].Code : "+bookList[bookCnt].getBookCode());
//            	 System.out.println("i : "+i);
//            	 System.out.println("bL[bC] : "+bookList[bookCnt]);
//            	 System.out.println("bL[i] : "+bookList[i]);
             }
          }//else
             //System.out.println("å�ڵ尡 �ʽ�ϴ�.");
                 
       } 
      
   }
   
   void deleteBook2() {

         System.out.print("� å �ڵ� �Է�ּ� : ");
         String bT = s.nextLine();
         
         for (int i=0; i<bookList.length;i++) {
            if(bookList[i] == null)  
            {
              //System.out.println("null�Դϴ�.");
            }
            else if(bT.equals(bookList[i].getBookCode())){
               System.out.println( bookList[i].getBookTitle() + " å� �Ǿ�ϴ�.");
               bookList[i] = null;
               bookCnt--;
               
            }//else
               //System.out.println("å�ڵ尡 �ʽ�ϴ�.");
                   
         } 
      }
   
   void deleteBook3() {

      System.out.print("� �ϰڽ�ϴ�. � �Է�ּ� : ");
       String bT = s.nextLine();
       
       for (int i=0; i<bookList.length;i++) {
          if(bookList[i] == null)  
          {
            // System.out.println("null�Դϴ�.");
          }
          else if(bT.equals(bookList[i].getBookTitle())){
             bookList[i] = null;
             System.out.println(bT + " å� �Ǿ�ϴ�.");
             System.out.println();
             bookCnt--;
             if(bookCnt == -1)
            	 bookCnt = 1;
          }//else
            // System.out.println("å�ڵ尡 �ʽ�ϴ�.");
                 
       } 
      
   }
   
   void borrowBook() {
      
       System.out.print("� å� � �ּ� : ");
       String bName = s.nextLine();
       
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null )
         {
         
 
        if( bName.equals(bookList[i].getBookTitle())) {
        	
        	if(bookList[i].borrow == 1)
        	{
        		System.out.println("�̹� �");break;
        	}
        	else {
        		System.out.println("� �");
        		bookList[i].borrow = 1;
        		break;
        	}
        }
         
         }
         
      }
   }
   
   void returnBook() {
	   System.out.print("�ݳ� å� � �ּ� : ");
	   String bName = s.nextLine();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null )
         {
         
         if( bName.equals(bookList[i].getBookTitle())) {
            if(bookList[i].borrow == 0)
            {
               System.out.println("�̹� �ݳ�");break;
            }
            else {
               System.out.println("�ݳ� �");
               bookList[i].borrow = 0;
               break;
            }
         }
         }
         
      }
   }

}
