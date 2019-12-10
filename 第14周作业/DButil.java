package cn.itcast.application;
import java.utilHashMap;
import java.util.HashMap;
/*
 * 模拟银行系统中的账户信息，相当于数据库的功能
 * 
 */
public class DButil {
private static DButil instance=null;
private HashMap<String,User>users=new HashMap<String,User>();
private  DBUtil(){
	//------------刘备-----------------
	User u1=new User();
	u1.setCardId("1001");
	u1.setCardPwd("123456");
	u1.setUserName("刘备");
	u1.setCall("13281525712");
	u1.setAccount(1000);
	users.put(u1.getCardId(),u1);
	//----------关羽------------
	User u2=new User();
	u1.setCardId("1002");
	u1.setCardPwd("234567");
	u1.setUserName("关羽");
	u1.setCall("13281525712");
	u1.setAccount(1000);
	users.put(u2.getCardId(),u2);
}
User u3=new User();
u3.setCardId("1003");
u3.setCardPwd("345678");
u3.setUserName("张飞")；
u3.setCall("13041018869");
u3.setAccount(1000);
users.put(u3.getCardId(),u3);
    //懒汉式单例模式
public static DBUtil getInsatnce() {
	if(instance==null) {
		synchronized (DBUtil.class) {
			if(instance=null) {
				instance=new DBUtil();
			}
		}
	}
return instance;
}
//获取银行卡号获取对应单个账户的信息
public User getUser(String cardId) {
User user=(User) users.get(cardId);
return user;
}
//获取所有帐户信息
public HashMap<String,User>getUsers(){
	
}












	
	
}
