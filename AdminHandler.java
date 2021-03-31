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
		//System.out.print("°ü¸®ÀÚ¶ó¸é 1À» ÀÔ·ÂÇÏ°í »ç¿ëÀÚ¶ó¸é 0À» ÀÔ·ÂÇÏ¼¼¿ä :");
		AdminCheck = Integer.parseInt(s.nextLine());
		return AdminCheck;
	}
	
	
	int adminLogin() {

		while(true)
		{
			System.out.print("°ü¸®ÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
			String ID = s.nextLine();
			System.out.print("°ü¸®ÀÚ PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
			String PW = s.nextLine();
			
			if(ID.equals(adminID)&&PW.equals(adminPW)) {
				System.out.println("°ü¸®ÀÚ ·Î±×ÀÎ ¼º°ø");break;
			}else
				System.out.println("ÀÔ·ÂÇÏ½Å ID¿Í PW°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.");		
		}
		adminLoginCnt = 1;
		return adminLoginCnt;
	}
	
	void adminLogout() {
		System.out.println("·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
		adminLoginCnt = 0;
	}
	
	
	int userLogin() {
		System.out.print("»ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String ID = s.nextLine();
		System.out.print("»ç¿ëÀÚ PW¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String PW = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)&&PW.equals(userList[i].PW)) {
					System.out.println("·Î±×ÀÎ ¼º°ø");break;
				}//else
					//System.out.println("ÀÔ·ÂÇÏ½Å ID¿Í PW°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù.");				
			}else
			{
				System.out.println("µî·ÏµÇÁö ¾ÊÀº »ç¿ëÀÚÀÔ´Ï´Ù. È¸¿ø°¡ÀÔÀ» ½ÃÀÛÇÕ´Ï´Ù.");
				registerUser();break;
			}
		}
		userLoginCnt = 1;
		return userLoginCnt;
	}
	
	void userLogout() {
		System.out.println("·Î±×¾Æ¿ô µÇ¾ú½À´Ï´Ù.");
		userLoginCnt = 0;
	}
	void registerUser() {	
		
		 if(userCnt == userList.length)
         {
        	 System.out.println("À¯Àú Á¤º¸¸¦ ¸ğµÎ ÃÊ±âÈ­ÇÕ´Ï´Ù. ´Ù½Ã ÀÔ·ÂÇÏ¼¼¿ä");
        	 for(int i = 0; i<userList.length;i++)
        	 {
        		 
        		 userCnt = 0;
        		 userList[i] = null;
        	 }
         }
		
	      String sPattern = "^[a-zA-Z0-9°¡-ÆR\\s]*$";
	      int retry = 0;
	      boolean regex;
	      
	      do {
				System.out.print("ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä : ");
				String Name = s.nextLine();
				 regex = Pattern.matches(sPattern, Name);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
		         
				System.out.print("ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String Tel = s.nextLine();
				regex = Pattern.matches(sPattern, Tel);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
		         
				System.out.print("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String ID = s.nextLine();
				regex = Pattern.matches(sPattern, ID);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
		         
				System.out.print("PW¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
				String PW = s.nextLine();
				regex = Pattern.matches(sPattern, PW);
		         if(regex != true) {
		            System.out.println("¼ıÀÚ¸¦ Æ÷ÇÔÇÑ ¹®ÀÚ¿­¸¸ ÀÔ·ÂÇÏ¼¼¿ä ");
		            break;
		         }
				
				AdminCheck = 1;
				
				User user = new User(Name, Tel, ID, PW);
				userList[userCnt] = user;
				userCnt++;
				System.out.println("È¸¿ø µî·ÏÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
				
				
				
				System.out.println("¶Ç ÀÔ·ÂÇÏ½Ã°Ú¾î¿ä? yes..1 no..0");
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
				//System.out.println("ÀÔ·ÂµÈ À¯Àú°¡ ¾ø½À´Ï´Ù. »ç¿ëÀÚ¸¦ Ãß°¡ÇØÁÖ¼¼¿ä.");
		}
	}
	
	
	
	void findID() {
		System.out.print("»ç¿ëÀÚ ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String Name = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(Name.equals(userList[i].Name)) {
					System.out.println(userList[i].Name+"ÀÇ ID´Â "+userList[i].ID+"ÀÔ´Ï´Ù.");
				}
			}
		}
	}
	
	void findPW() {
		System.out.print("»ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä : ");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)) {
					System.out.println(userList[i].ID+"ÀÇ PW´Â "+userList[i].PW+"ÀÔ´Ï´Ù.");
				}
			}
		}
	}
	
	void removeUser(){
		System.out.println("Á¤¸»·Î Å»ÅğÇÏ½Ã°Ú½À´Ï±î? : Å»Åğ¸é ¾ÆÀÌµğ ÀÔ·Â");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]==null) {
				//System.out.println("null°ªÀÔ´Ï´Ù.");
			}
			else if(ID.equals(userList[i].ID)) {
				userList[i]= null;
				System.out.println(ID+"°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
				userCnt--;
				userLoginCnt = 0;
					
			}//else 
				//System.out.println("ÀÏÄ¡ ¾ÈÇÔ");
		}
	}
	
	void searchUser(){
		System.out.print("°Ë»öÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)) {
					System.out.println("Ã£À¸½Ã´Â »ç¿ëÀÚ Á¤º¸´Â ");
					userList[i].showUser();
					System.out.print(" ÀÔ´Ï´Ù. ");
				}
//				else 
//					System.out.println("¤Ç¤Ì¤Á");
			}
		}
	}
	
	void deleteUser() {
		System.out.print("»èÁ¦ÇÒ »ç¿ëÀÚ ID¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä :");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
			{
				if(userList[i]==null) {
					//System.out.println("null°ªÀÔ´Ï´Ù.");
				}
				else if(ID.equals(userList[i].ID)) {
						userList[i]= null;
						System.out.println(ID+"°¡ »èÁ¦µÇ¾ú½À´Ï´Ù.");
						userCnt--;
				}//else 
					//System.out.println("ÀÏÄ¡ ¾ÈÇÔ");
			}
		}
	
	void sortUser() {
		System.out.println("À¯Àú¸ñ·ÏÀ» Á¤·ÄÇÕ´Ï´Ù.");
		 for(int i = 0; i<userList.length;i++)
         {
         if(userList[i]==null )
            {
               userList[i] = new User("a"+i,"010"+i,"user"+(i+1),"user"+(i+1));
               System.out.println("»ı¼ºÀÚ¸¦ Ãß°¡ÇÏ¿´½À´Ï´Ù.");
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
