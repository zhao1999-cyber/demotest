
//TreeSet
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class TelcomUserBasedOnCollection{
	private String phoneNumber;
	private String callTo;
	private HashSet communicationRecords;
	public TelcomUserBasedOnCollection(String phonenumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new HashSet();
	}

void generateCommunicateRecord() {
	int recordNum=new Random().nextInt(10);
	for(int i=0;i<=recordNum;i++) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.HOUR,-new Random( ).nextInt(10));
		long timeStart=cal.getTimeInMillis();
	    long timeEnd=timeStart+60000+new Random().nextInt(600000);
	    this.callTo=getCallToPhoneNumber();
	    this.communicationRecords.add(this.phoneNumber+
	    		","+timeStart+
	    		","+timeEnd+
	    		","+this.callTo);
	}
}
	
private String accountFee(long timeStart,long timeEnd) {
	double feePerMinute=0.2;
	int minutes=Math.round((timeEnd-timeStart)/60000);
	double feeTotal=feePerMinute*minutes;
	return String.format("%.4f",feeTotal);
}

void printDetails() {
	int LinkedListSize=this.communicationRecords.size();
	
	
	for(int i=0;i<LinkedListSize-1;i++) {
		System.out.println("-------通话记录分割线------");
		String [] recordField=((String)this.communicationRecords.get(i)).split(";");//待补全
		System.out.println("主叫："+recordField[0]);		
		System.out.println("被叫："+recordField[3]);	
	Date timeStart=new Date(Long.parseLong(recordField[1]));
	Date timeEnd=new Date(Long.parseLong(recordField[2]));
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月");//待确定
	
	
	System.out.println("通话开始时间："+simpleDateFormat.format(timeStart));
	System.out.println("通话结束时间："+simpleDateFormat.format(timeEnd));
	
	System.out.println("计费："
	+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))//待补全
			+"元");
	}
}


public class Hello9 {

	public void main(String[] args) {
		// TODO 自动生成的方法存根
		TelcomUser telcomUser=new TelcomUser("13800138000");
		telcomUser.generateCommunicateRecord();
		telcomUser.printDetails();
	}
}
}
