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
		//System.out.print("관리자라면 1을 입력하고 사용자라면 0을 입력하세요 :");
		AdminCheck = Integer.parseInt(s.nextLine());
		return AdminCheck;
	}
	
	
	int adminLogin() {

		while(true)
		{
			System.out.print("관리자 ID를 입력해주세요 : ");
			String ID = s.nextLine();
			System.out.print("관리자 PW를 입력해주세요 : ");
			String PW = s.nextLine();
			
			if(ID.equals(adminID)&&PW.equals(adminPW)) {
				System.out.println("관리자 로그인 성공");break;
			}else
				System.out.println("입력하신 ID와 PW가 일치하지 않습니다.");		
		}
		adminLoginCnt = 1;
		return adminLoginCnt;
	}
	
	void adminLogout() {
		System.out.println("로그아웃 되었습니다.");
		adminLoginCnt = 0;
	}
	
	
	int userLogin() {
		System.out.print("사용자 ID를 입력해주세요 : ");
		String ID = s.nextLine();
		System.out.print("사용자 PW를 입력해주세요 : ");
		String PW = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)&&PW.equals(userList[i].PW)) {
					System.out.println("로그인 성공");break;
				}//else
					//System.out.println("입력하신 ID와 PW가 일치하지 않습니다.");				
			}else
			{
				System.out.println("등록되지 않은 사용자입니다. 회원가입을 시작합니다.");
				registerUser();break;
			}
		}
		userLoginCnt = 1;
		return userLoginCnt;
	}
	
	void userLogout() {
		System.out.println("로그아웃 되었습니다.");
		userLoginCnt = 0;
	}
	void registerUser() {	
		
		 if(userCnt == userList.length)
         {
        	 System.out.println("유저 정보를 모두 초기화합니다. 다시 입력하세요");
        	 for(int i = 0; i<userList.length;i++)
        	 {
        		 
        		 userCnt = 0;
        		 userList[i] = null;
        	 }
         }
		
	      String sPattern = "^[a-zA-Z0-9가-힣\\s]*$";
	      int retry = 0;
	      boolean regex;
	      
	      do {
				System.out.print("이름을 입력하세요 : ");
				String Name = s.nextLine();
				 regex = Pattern.matches(sPattern, Name);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
		         
				System.out.print("전화번호를 입력하세요 : ");
				String Tel = s.nextLine();
				regex = Pattern.matches(sPattern, Tel);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
		         
				System.out.print("ID를 입력하세요 : ");
				String ID = s.nextLine();
				regex = Pattern.matches(sPattern, ID);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
		         
				System.out.print("PW를 입력하세요 : ");
				String PW = s.nextLine();
				regex = Pattern.matches(sPattern, PW);
		         if(regex != true) {
		            System.out.println("숫자를 포함한 문자열만 입력하세요 ");
		            break;
		         }
				
				AdminCheck = 1;
				
				User user = new User(Name, Tel, ID, PW);
				userList[userCnt] = user;
				userCnt++;
				System.out.println("회원 등록이 완료되었습니다.");
				
				
				
				System.out.println("또 입력하시겠어요? yes..1 no..0");
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
				//System.out.println("입력된 유저가 없습니다. 사용자를 추가해주세요.");
		}
	}
	
	
	
	void findID() {
		System.out.print("사용자 이름을 입력해주세요 : ");
		String Name = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(Name.equals(userList[i].Name)) {
					System.out.println(userList[i].Name+"의 ID는 "+userList[i].ID+"입니다.");
				}
			}
		}
	}
	
	void findPW() {
		System.out.print("사용자 ID를 입력해주세요 : ");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)) {
					System.out.println(userList[i].ID+"의 PW는 "+userList[i].PW+"입니다.");
				}
			}
		}
	}
	
	void removeUser(){
		System.out.println("정말로 탈퇴하시겠습니까? : 탈퇴면 아이디 입력");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]==null) {
				//System.out.println("null값입니다.");
			}
			else if(ID.equals(userList[i].ID)) {
				userList[i]= null;
				System.out.println(ID+"가 삭제되었습니다.");
				userCnt--;
				userLoginCnt = 0;
					
			}//else 
				//System.out.println("일치 안함");
		}
	}
	
	void searchUser(){
		System.out.print("검색할 사용자 ID를 입력해주세요");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
		{
			if(userList[i]!=null) {
				if(ID.equals(userList[i].ID)) {
					System.out.println("찾으시는 사용자 정보는 ");
					userList[i].showUser();
					System.out.print(" 입니다. ");
				}
//				else 
//					System.out.println("ㅗㅜㅑ");
			}
		}
	}
	
	void deleteUser() {
		System.out.print("삭제할 사용자 ID를 입력해주세요 :");
		String ID = s.nextLine();
		
		for(int i = 0; i<userList.length;i++)
			{
				if(userList[i]==null) {
					//System.out.println("null값입니다.");
				}
				else if(ID.equals(userList[i].ID)) {
						userList[i]= null;
						System.out.println(ID+"가 삭제되었습니다.");
						userCnt--;
				}//else 
					//System.out.println("일치 안함");
			}
		}
	
	void sortUser() {
		System.out.println("유저목록을 정렬합니다.");
		 for(int i = 0; i<userList.length;i++)
         {
         if(userList[i]==null )
            {
               userList[i] = new User("a"+i,"010"+i,"user"+(i+1),"user"+(i+1));
               System.out.println("생성자를 추가하였습니다.");
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
