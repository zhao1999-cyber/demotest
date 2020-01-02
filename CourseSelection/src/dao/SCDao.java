package dao;

import java.io.*;
import java.util.*;
import entity.*;

public class SCDao {
	//ѧ���γ���Ϣ���ݿ�  ����sc.txt
	private static  String filepath="sc.txt";
    private HashMap<String, StudentCourse> scs;
    private StudentCourse sc;
    private static SCDao instance = null;
    private SCDao() throws Exception {
 	   
 	   scs=read(filepath);
 	   System.out.println(scs.size());
 	  
    }
    public static HashMap<String, StudentCourse>  read(String file) throws Exception{
		FileInputStream fis=new FileInputStream(file);
		InputStreamReader ir=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(ir);
		HashMap<String, StudentCourse> list=new HashMap<String, StudentCourse>();
		String str=null;
		while((str=br.readLine())!=null){
			String[] strs=str.split(",");
			StudentCourse stu=new StudentCourse();
			stu.setStudentNo(strs[0]);
			stu.setCourseNo(strs[1]);
			stu.setGrade(Integer.parseInt(strs[2]));
			list.put(strs[0],stu);
		}
		br.close();
		return list;
		
	}
 	   
    public static void writer(String file,HashMap<String, StudentCourse> scs) throws Exception{
		FileOutputStream fos=new FileOutputStream(file,true);
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		PrintWriter pw=new PrintWriter(osw,true);
		Set keySet=scs.keySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			StudentCourse sc=(StudentCourse)scs.get(key);
		    pw.println(sc.getStudentNo()+","+sc.getCourseNo()+","+sc.getGrade());	
		}	
		pw.close();
	}
    public static SCDao getInstance() throws Exception {
 	   if(instance == null) {
 		   synchronized(SCDao.class) {
 			   if(instance == null) {
 				   instance = new SCDao();
 				   return instance;
 			   }
 		   }
 	   }
 	   return instance;
    }
    public void insert(InterfaceEntity entity) throws Exception {
 	   StudentCourse st = (StudentCourse)entity;
 	   scs.put(st.getStudentNo(),st);
 	   FileOutputStream fs = new FileOutputStream(new File("sc.txt"));
		writer(filepath, scs);
    }
    public void delete() throws Exception {
 	   Scanner scanner = new Scanner(System.in);
 	   System.out.println("������ɾ��ѧ�ţ�");
 	    String studentNo = scanner.nextLine();
		   scs.remove(studentNo);
		   FileOutputStream fs = new FileOutputStream(new File("sc.txt"));
		   writer(filepath, scs);
    }
    //�޸�����
    public void update() throws Exception {
 	   Scanner scanner = new Scanner(System.in);
 	   System.out.println("�������޸�ѧ��ѧ�ţ�");
 	   String studentNo = scanner.nextLine();

			StudentCourse sc=new StudentCourse();
			System.out.println("1-�޸Ŀγ̺ţ�2-�޸Ŀγ̷�����0-�˳�");
			String option = scanner.nextLine();
			switch (option) {
			//�޸Ŀγ̺�
			case "1":{
			System.out.println("�������޸Ŀγ̺ţ�");
			String courseNo= scanner.nextLine();
			sc=scs.get(studentNo);
			sc.setCourseNo(courseNo);
			scs.put(courseNo, sc);
			FileOutputStream fs = new FileOutputStream(new File("sc.txt"));
			writer(filepath, scs);
			break;
			}
			//�޸�����	
			case "2":{
				System.out.println("�������޸Ŀγ̷�����");
	   			int Grade= scanner.nextInt();
	   		    sc=scs.get(studentNo);
	   		    sc.setGrade(Grade);
	   		    scs.put(studentNo, sc);
	   		    FileOutputStream fs = new FileOutputStream(new File("sc.txt"));
			    writer(filepath, scs);
				break;
			}	
			/*//ѡ��	
			case "3":
				//new Xuankejiemian().show();
				break;
			//��¼
			case "4":
				Loadjiemian.show();*/
			}
			
		   } 
    public HashMap<String, InterfaceEntity> getAllEntities() throws Exception{
 	   HashMap map = new HashMap<String, InterfaceEntity>();
 	   map=read(filepath);
 	   return map;
    }
    public InterfaceEntity getEntity(String Id) {
 	   return scs.get(Id);
    }
}
