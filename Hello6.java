//ArrayList
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class TelcomUserBasedOnCollection{
	private String phoneNumber;
	private String callTo;
	private ArrayList communicationRecords;
	public TelcomUserBasedOnCollection(String phonenumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords=new ArrayList();
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
	int arrayListSize=this.communicationRecords.size();
	
	
	for(int i=0;i<arrayListSize-1;i++) {
		System.out.println("-------ͨ����¼�ָ���------");
		String [] recordField=((String)this.communicationRecords.get(i)).split(";");//����ȫ
		System.out.println("���У�"+recordField[0]);		
		System.out.println("���У�"+recordField[3]);	
	Date timeStart=new Date(Long.parseLong(recordField[1]));
	Date timeEnd=new Date(Long.parseLong(recordField[2]));
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy��MM��");//��ȷ��
	
	
	System.out.println("ͨ����ʼʱ�䣺"+simpleDateFormat.format(timeStart));
	System.out.println("ͨ������ʱ�䣺"+simpleDateFormat.format(timeEnd));
	
	System.out.println("�Ʒѣ�"
	+accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))//����ȫ
			+"Ԫ.");
	}
}

public class Hello6 {

 public void main(String[] args) {
		// TODO �Զ����ɵķ������
TelcomUser telcomUser=new TelcomUser("13800138000");
telcomUser.generateCommunicateRecord();
telcomUser.printDetails();
	}

}
}
