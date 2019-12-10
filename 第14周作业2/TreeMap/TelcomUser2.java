
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.*;
class TelcomUser2 {
	private String phoneNumber;//����
	private String callTo;     //����
	
TreeMap communicationRecords;
	public TelcomUser2(String phoneNumber) {
		this.phoneNumber = phoneNumber;
this.communicationRecords=(TreeMap) new TreeMap();
	}
	
	//ģ��ͨ����¼������
	void generateCommunicateRecord() {
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i = 0; i <= recordNum; i++) {
			//������ɵ�i��ͨ����¼
			//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
			
			
			
			//��Calendar��ȡ��ǰʱ��
			Calendar cal = Calendar.getInstance();
			//�����ȥ����Сʱ��10Сʱ���ڣ�
			cal.add(Calendar.HOUR, - new Random().nextInt(10));
			//��ö�Ӧ����
			long timeStart = cal.getTimeInMillis();
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			
			//���к���
			this.callTo = getCallToPhoneNumber();
			//����ͨ����¼
			this.communicationRecords.put(this.callTo,
					 timeStart + 
					";" + timeEnd + 
					";" + this.phoneNumber+
					";");
		}
	}
	
	//������ɱ��к��루����λ�����������
	private String getCallToPhoneNumber() {
		return "1380372" + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10))
			 + String.valueOf(new Random().nextInt(10));
	}
	
	//ģ��ƷѰ취�����ַ�������ʽ���ر���4λС���ļƷѽ��
	private String accountFee(long timeStart, long timeEnd) {
		//ÿ�����շ�*Ԫ
		double feePerMinute = 0.2;
		//ͨ���������������������
		int minutes = Math.round((timeEnd - timeStart)/60000);
		double feeTotal = feePerMinute * minutes;
		return String.format("%.4f", feeTotal);
	}
	
	//��ӡͨ����¼
	void printDetails() {
		//��ȡȫ��ͨ����¼
		Set keySet=communicationRecords.keySet();
		Iterator it=keySet.iterator();
		//ѭ���ָ��¼�ڵ�ÿһ����
		while(it.hasNext()){
			System.out.println("---------ͨ����¼�ָ���---------");
			//Map.Entry entry=(Map.Entry) (it.next());
			Object key=it.next();
			Object value=communicationRecords.get(key);
			//System.out.println(value);
			//System.out.println();
			String [] recordField = ((String) value).split(";");
			System.out.println("���У�" + key);
			System.out.println("���У�" + recordField[2]);
			Date timeStart = new Date(Long.parseLong(recordField[0]));
			Date timeEnd = new Date(Long.parseLong(recordField[1]));
	
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
					
			System.out.println("ͨ����ʼʱ�䣺" + simpleDateFormat.format(timeStart));
			System.out.println("ͨ������ʱ�䣺" + simpleDateFormat.format(timeEnd));
			
			System.out.println("�Ʒѣ�" 
					+ accountFee(Long.parseLong(recordField[0]), Long.parseLong(recordField[1]))
					+ " Ԫ��");
		}
	}
}
