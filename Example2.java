
public class Example2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
 System.out.println("1�����---------");
 add();
 System.out.println("2, ɾ��---------");
 remove();
 System.out.println("3, �޸�---------");
 alter();
	}
public static void add() {
	StringBuffer sb=new StringBuffer();
	sb.append("abcde");
	System.out.println("append��ӽ����"+sb);
	sb.insert(2, "123");
	System.out.println("insert��ӽ���� "+sb);
}
public static void  remove() {
	StringBuffer sb=new StringBuffer("abcdg");
	sb.delete(1,5);
	System.out.println("ɾ��ָ��λ�ý����"+sb);
	sb.deleteCharAt(2);
	System.out.println("ɾ��ָ��λ�ý����"+sb);
	sb.delete(0,sb.length());
	System.out.println("��ջ����������"+sb);
			}
public static void alter() {
	StringBuffer sb=new StringBuffer("abcde");
	sb.setCharAt(1,'p');
	System.out.println("�޸�ָ��λ���ַ������"+sb);
	sb.replace(1, 3,"qq");
	System.out.println("�滻ָ��λ���ַ������������"+sb);
	System.out.println("�ַ�����ת���"+sb.reverse());
	
	
	
	
	
	
	
	
	
}
}
