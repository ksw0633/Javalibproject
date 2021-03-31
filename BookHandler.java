package cproject;
import java.util.*;
import java.util.regex.Pattern;

public class BookHandler {
   Book bookList[] = new Book[5];
   
   int bookCnt = 0;
   Scanner s;
   
   public BookHandler() {
      s= new Scanner(System.in);   
   }
   
   void inputBook(){
      String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
      int retry = 0;
      boolean regex;
      
      do
      {
    	  //if(bookList[bookCnt]==null)
    	 // {
    			  
    		 
         System.out.print("Ã¥  Á¦¸ñ : ");
         String bookTitle = s.nextLine();
         regex = Pattern.matches(sPattern, bookTitle);
         if(regex != true) {
            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
            break;
         }
         
         System.out.print("Ã¥  ÀúÀÚ : ");
          String bookAuthor = s.nextLine();
          regex = Pattern.matches(sPattern, bookAuthor);
          if(regex != true) {
             System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
             break;
          }
          
         System.out.print("ÃâÆÇ»ç : ");
         String bookPublisher = s.nextLine();
         regex = Pattern.matches(sPattern, bookPublisher);
         if(regex != true) {
            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
            break;
         }
         
         System.out.print("Ã¥  ÄÚµå: ");
         String bookCode = s.nextLine();
         regex = Pattern.matches(sPattern, bookCode);
         if(regex != true) {
            System.out.println("¼ýÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
            break;
         }
         
         System.out.print("Ã¥ °¡°Ý : ");
         int bookPrice = 0;
         
         if(!s.hasNextInt()||(bookPrice= s.nextInt())<0) {
            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
            break;
         }
         
         System.out.print("Ã¥ ÆÇ¸Å·® : ");
         int bookSale = 0;
         if(!s.hasNextInt()||(bookSale= s.nextInt())<0) {
            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
            break;
         }
         
         
         System.out.print("Ã¥ ÃâÆÇ¿¬µµ : ");
         int bookYear = 0;
         if(!s.hasNextInt()||(bookYear= s.nextInt())<0) {
            System.out.println("Á¤¼ö¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
            break;
         }
         s.nextLine();
         
         int borrow = 0;
         
         Book book = new Book(bookTitle, bookAuthor, bookPublisher, bookCode, bookPrice, bookSale, bookYear, borrow);
         
         bookList[bookCnt] = book;
         bookCnt++;
         

         if(bookCnt == bookList.length)
         {
        	 System.out.println("¹è¿­ °ªÀ» ¸ðµÎ ÃÊ±âÈ­ÇÕ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
        	 for(int i = 0; i<bookList.length;i++)
        	 {
        		 
        		 bookCnt = 0;
        		 bookList[i] = null;
        	 }
         }
    		  
    	//  }
         System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
         retry = s.nextInt();
         s.nextLine();
      }while(retry!=0);
   }
   
   void outBook() {
      for(int i = 0; i<bookList.length; i++)
      {
         if(bookList[i]!=null)
         {
         System.out.println("-------------");
         System.out.println("Ã¥ Á¦¸ñ : " + bookList[i].getBookTitle());
         System.out.println("Ã¥ ÀúÀÚ : " + bookList[i].getBookAuthor());
         System.out.println("ÃâÆÇ»ç: " + bookList[i].getBookPublisher());
         System.out.println("Ã¥ ÄÚµå : " + bookList[i].getBookCode());
         System.out.println("Ã¥ °¡°Ý : " + bookList[i].getBookPrice());
         System.out.println("Ã¥ ÆÇ¸Å·® : " + bookList[i].getBookSale());
         System.out.println("Ã¥ ÃâÆÇ¿¬µµ : " + bookList[i].getBookYear());
         System.out.println();
         }
      }
   }
   
   void searchBook() {
      
      System.out.print("Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      String bT = s.nextLine();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT.equals(bookList[i].getBookTitle()))
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void searchBook2() {
      
      System.out.print("Ã¥ ÀúÀÚ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      String bT = s.nextLine();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT.equals(bookList[i].getBookAuthor()))
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÌ°í, ÀúÀÚ´Â "+bookList[i].getBookAuthor()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void searchBook3() {
      
      System.out.print("ÃâÆÇ»ç¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      String bT = s.nextLine();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT.equals(bookList[i].getBookPublisher()))
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÌ°í, ÃâÆÇ»ç´Â "+bookList[i].getBookPublisher()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void searchBook4() {
      
      System.out.print("ºÏÄÚµå¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      String bT = s.nextLine();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT.equals(bookList[i].getBookCode()))
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÌ°í, Ã¥ ÄÚµå´Â "+bookList[i].getBookCode()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void searchBook5() {
      
      System.out.print("Ã¥ °¡°ÝÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      int bT = s.nextInt();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT == bookList[i].getBookPrice())
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÌ°í, °¡°ÝÀº "+bookList[i].getBookPrice()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void searchBook6() {
      
      System.out.print("Ã¥ ÆÇ¸Å·®À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      int bT = s.nextInt();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT==bookList[i].getBookSale())
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÌ°í, ÆÇ¸Å·®Àº "+bookList[i].getBookSale()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void searchBook7() {
      
      System.out.print("Ã¥ ¿¬µµ¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
      int bT = s.nextInt();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null)
         {
            if(bT==bookList[i].getBookYear())
            {
               System.out.println("Ã¥ÀÇ Á¦¸ñÀº "+bookList[i].getBookTitle()+"ÀÌ°í, ¿¬µµ´Â "+bookList[i].getBookYear()+"ÀÔ´Ï´Ù."); break;
            }else
               System.out.println("Ã£´Â Ã¥ÀÌ ¾ø½À´Ï´Ù.");
         }
      }
   }
   
   void sortBook() {
      System.out.println("ÆÇ¸Å·®¿¡ µû¸¥ ³»¸²Â÷¼ø Á¤·Ä");
      
      for(int i = 0; i<bookList.length;i++)
         {
         if(bookList[i]==null )
            {
               bookList[i] = new Book("a","a","a","a",0,0,0,0);
               bookCnt++;
               System.out.println("»ý¼ºÀÚ¸¦ Ãß°¡ÇÏ¿´½À´Ï´Ù.");
            } 
         }
         
      Arrays.sort(bookList, Collections.reverseOrder());
      
      System.out.println();
      
      for(int i = 0; i<bookList.length;i++)
      {
         System.out.println("Ã¥ ÀÌ¸§ : " + bookList[i].getBookTitle() + "," +(i+1) + "À§ : " + bookList[i].getBookSale());
      }
   }
   
   void deleteBook1() {

      System.out.print("»èÁ¦ÇÒ Ã¥ Á¦¸ñÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
       String bT = s.nextLine();
       //System.out.println("bC : "+bookCnt);
       for (int i=0; i<bookList.length;i++) {
          if(bookList[i] == null)  
          {
             //System.out.println("null°ªÀÔ´Ï´Ù.");
          }
          else if(bT.equals(bookList[i].getBookTitle())){
             bookList[i] = null;
             System.out.println(bT + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
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
             //System.out.println("Ã¥ÄÚµå°¡ ¸ÂÁö¾Ê½À´Ï´Ù.");
                 
       } 
      
   }
   
   void deleteBook2() {

         System.out.print("»èÁ¦ÇÒ Ã¥ ÄÚµåÀ» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
         String bT = s.nextLine();
         
         for (int i=0; i<bookList.length;i++) {
            if(bookList[i] == null)  
            {
              //System.out.println("null°ªÀÔ´Ï´Ù.");
            }
            else if(bT.equals(bookList[i].getBookCode())){
               System.out.println( bookList[i].getBookTitle() + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
               bookList[i] = null;
               bookCnt--;
               
            }//else
               //System.out.println("Ã¥ÄÚµå°¡ ¸ÂÁö¾Ê½À´Ï´Ù.");
                   
         } 
      }
   
   void deleteBook3() {

      System.out.print("±¸Á¶¸¦ ¼³¸íÇÏ°Ú½À´Ï´Ù. Á¦¸ñ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
       String bT = s.nextLine();
       
       for (int i=0; i<bookList.length;i++) {
          if(bookList[i] == null)  
          {
            // System.out.println("null°ªÀÔ´Ï´Ù.");
          }
          else if(bT.equals(bookList[i].getBookTitle())){
             bookList[i] = null;
             System.out.println(bT + " Ã¥ÀÌ »èÁ¦µÇ¾ú½À´Ï´Ù.");
             System.out.println();
             bookCnt--;
             if(bookCnt == -1)
            	 bookCnt = 1;
          }//else
            // System.out.println("Ã¥ÄÚµå°¡ ¸ÂÁö¾Ê½À´Ï´Ù.");
                 
       } 
      
   }
   
   void borrowBook() {
      
       System.out.print("ºô¸± Ã¥ÀÇ Á¦¸ñ¸¦ ¸»ÇØÁÖ¼¼¿ä : ");
       String bName = s.nextLine();
       
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null )
         {
         
 
        if( bName.equals(bookList[i].getBookTitle())) {
        	
        	if(bookList[i].borrow == 1)
        	{
        		System.out.println("ÀÌ¹Ì ´ëÃâ");break;
        	}
        	else {
        		System.out.println("´ëÃâ ¼º°ø");
        		bookList[i].borrow = 1;
        		break;
        	}
        }
         
         }
         
      }
   }
   
   void returnBook() {
	   System.out.print("¹Ý³³ÇÒ Ã¥ÀÇ Á¦¸ñ¸¦ ¸»ÇØÁÖ¼¼¿ä : ");
	   String bName = s.nextLine();
      
      for(int i = 0; i<bookList.length;i++)
      {
         if(bookList[i]!=null )
         {
         
         if( bName.equals(bookList[i].getBookTitle())) {
            if(bookList[i].borrow == 0)
            {
               System.out.println("ÀÌ¹Ì ¹Ý³³");break;
            }
            else {
               System.out.println("¹Ý³³ ¼º°ø");
               bookList[i].borrow = 0;
               break;
            }
         }
         }
         
      }
   }

}
