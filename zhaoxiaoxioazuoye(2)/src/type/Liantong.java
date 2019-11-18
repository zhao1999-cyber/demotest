package type;

import java.text.DateFormat;
import java.util.*;
public class LianTong extends sorts{
    private String phoneNumber;
    private String callTo;
    private StringBuffer communicationRecords;
    public LianTong(String phoneNumber) {
    	this.phoneNumber=phoneNumber;
    	this.communicationRecords=new StringBuffer();
    	//ģ��ͨ����¼������
    	public void generateCommunicateRecord() {
    	//�������ͨ����¼��Ŀ
    		int recordNum = new Random().nextInt(15);
    		for(int i=0;i<=recordNum;i++) {
    			//������ɵ�i��ͨ����¼
    			//��ʼʱ�䣬��ǰʱ��֮���ĳ�����ʱ��
    			long timeStart=Syetem.currentTimeMillis()-new Random().nextInt(10*24*60*60*1000);
    			//����ʱ�䣬��ʼ���ʮ�����������һ��ʱ�䣬����һ����
    			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
    			Calendar cal = Calender.getInstance();
    			cal.add(Calendar.HOUR, new Random().nextInt(24*15));
    			//���к���
    			this.callTo = this.getCallToPhoneNumber();
    			//����ͨ����¼
    			this.communicationRecords.append(this.phoneNumber+","+timeStart+","+timeEnd+","+this.callTo+";");
    		}
    	}
    	//������ɱ����еĺ���
    	 private String getCallToPhoneNumber() {
    	    	return "1522492" + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10)) + String.valueOf(new Random().nextInt(10));
    	    }
    	 //�Ʒ�
    	 private String accountFee(long timeStart,long timeEnd) {
    	    	//ÿ�����շ�*Ԫ
    	    	int feePerMinute=1;
    	    	int minutes=(int)Math.ceil((timeEnd-timeStart)/60000);
    	    	double feeTotal=feePerMinute*minutes;
    	    	//String.format()���ڴ�����ʽ�����ַ����Լ����Ӷ���ַ�������
    	    	return String.format("%.4f",feeTotal);
    	    }
    	 void printDetails() {
    	    	//��ȡȫ��ͨ����¼
    	    	String allRecords=this.communicationRecords.toString();
    	    	//�ָ�ͨ����¼
    	    	String [] recordArray=allRecords.split(";");
    	    	//ѭ���ָ��¼�ڵ�ÿһ����
    	    	for(int i=0;i<recordArray.length;i++) {
    	    		String [] recordField = recordArray[i].split(",");
    	    		System.out.println("���У�" + recordField[0]);
    	    		System.out.println("���У�" + recordField[3]);
    	    		System.out.println("ͨ����ʼʱ�䣺" + new Date(Long.parseLong(recordField[1])));
    	    		System.out.println("ͨ������ʱ�䣺" + new Date(Long.parseLong(recordField[2])));
    	    		System.out.println("�Ʒѣ�" + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]) + "Ԫ");
    	    	}
    	    }
    }
}
