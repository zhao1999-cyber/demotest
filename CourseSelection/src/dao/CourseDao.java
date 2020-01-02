package dao;

import java.io.*;

import java.util.*;
import entity.*;

public class CourseDao implements IDao{
	//课程信息数据库    存在inter.txt下
	   private static  String filepath="inter.txt";
       private HashMap<String,Course> courses;
       private  Course course;
       private static CourseDao instance = null;
       private CourseDao() throws Exception {
    	   
    	   courses=read(filepath);
    	   System.out.println(courses.size());
    	  
       }
       public static HashMap<String,Course>  read(String file) throws Exception{
   		FileInputStream fis=new FileInputStream(file);
   		InputStreamReader ir=new InputStreamReader(fis);
   		BufferedReader br=new BufferedReader(ir);
   		HashMap<String,Course> list=new HashMap<String,Course>();
   		String str=null;
   		while((str=br.readLine())!=null){
   			String[] strs=str.split(",");
   			Course stu=new Course();
   			stu.setCourseNo(strs[0]);
   			stu.setCourseName(strs[1]);
   			stu.setCourseGrade(Integer.parseInt(strs[2]));
   			list.put(strs[0],stu);
   		}
   		br.close();
   		return list;
   		
   	}
    	   
       public static void writer(String file,HashMap<String,Course> courses) throws Exception{
   		FileOutputStream fos=new FileOutputStream(file,true);
   		OutputStreamWriter osw=new OutputStreamWriter(fos);
   		PrintWriter pw=new PrintWriter(osw,true);
   		Set keySet=courses.keySet();
   		Iterator it=keySet.iterator();
   		while(it.hasNext()) {
   			Object key=it.next();
   			Course cou=(Course)courses.get(key);
   		    pw.println(cou.getCourseNo()+","+cou.getCourseName()+","+cou.getCourseGrade());	
   		}	
   		pw.close();
   	}
       public static CourseDao getInstance() throws Exception {
    	   if(instance == null) {
    		   synchronized(CourseDao.class) {
    			   if(instance == null) {
    				   instance = new CourseDao();
    				   return instance;
    			   }
    		   }
    	   }
    	   return instance;
       }
       public void insert(InterfaceEntity entity) throws Exception {
    	   Course st = (Course)entity;
    	   courses.put(st.getCourseNo(),st);
    	   FileOutputStream fs = new FileOutputStream(new File("inter.txt"));
			writer(filepath, courses);
       }
       public void delete() throws Exception {
    	   Scanner scanner = new Scanner(System.in);
    	   System.out.println("请输入课程号：");
    	    String courseNo = scanner.nextLine();
   		   courses.remove(courseNo);
   		   FileOutputStream fs = new FileOutputStream(new File("inter.txt"));
		   writer(filepath, courses);
       }
       //修改数据
       public void update() throws Exception {
    	   Scanner scanner = new Scanner(System.in);
    	   System.out.println("请输入修改课程号：");
    	   String courseNo = scanner.nextLine();

   			Course course=new Course();
   			System.out.println("1-修改课程号；2-修改；0-退出");
   			String option = scanner.nextLine();
   			switch (option) {
   			//修改课程号
   			case "1":{
   			System.out.println("请输入修改课程号：");
   			String courseNo1= scanner.nextLine();
   			course=courses.get(courseNo);
   			course.setCourseNo(courseNo1);
   			courses.put(courseNo1, course);
   			FileOutputStream fs = new FileOutputStream(new File("inter.txt"));
			writer(filepath, courses);
   			break;
   			}
   			//修改密码	
   			case "2":{
   				System.out.println("请输入修改课名：");
   	   			String courseName= scanner.nextLine();
   	   		    course=courses.get(courseNo);
   	   		    course.setCourseName(courseName);
   	   		    courses.put(courseNo, course);
   	   		    FileOutputStream fs = new FileOutputStream(new File("inter.txt"));
			    writer(filepath, courses);
   				break;
   			}	
   			/*//选课	
   			case "3":
   				//new Xuankejiemian().show();
   				break;
   			//登录
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
    	   return courses.get(Id);
       }
}
