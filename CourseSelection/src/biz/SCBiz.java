package biz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import dao.*;
import entity.*;
import view.Zhujiemian;

public class SCBiz {
	//ѧ���γ���Ϣ�����   ѡ�β���
	SCDao scDao;
	CourseDao courseDao;
	StudentDao studentDao;
	HashMap<String, InterfaceEntity> map = new HashMap<String, InterfaceEntity>();
    private StudentCourse sc;
	  public void xuanke(String studentNo) throws Exception {
		    
		 studentDao = StudentDao.getInstance();
       	 Student student = (Student)studentDao.getEntity(studentNo);
		  if(student.getStudentNo().equals(studentNo)) {
	   		System.out.println("�γ�");
		    courseDao = CourseDao.getInstance();
		    map=courseDao.getAllEntities();
		    Set keySet=map.keySet();
	   	    Iterator in=keySet.iterator();
	   		while(in.hasNext()) {
	   			Object key=in.next();
	   			Course cou=(Course)map.get(key);
	   		    System.out.println(cou.getCourseNo()+","+cou.getCourseName()+","+cou.getCourseGrade());	
	   		}	
	   		Scanner scanner = new Scanner(System.in);
	   		System.out.println("������γ̺ţ�");
			String courseNo = scanner.nextLine();
			System.out.println("�����������");
			int grade = scanner.nextInt();
			   sc = new StudentCourse();
			   sc.setStudentNo(studentNo);
			   sc.setCourseNo(courseNo);
			   sc.setGrade(grade);
			   scDao =SCDao.getInstance();
			   scDao.insert(sc);
			   System.out.println("ѡ�γɹ�!");
			   Zhujiemian.show();
		   }else{
			   System.err.println("ѡ��ʧ��!");
			   Zhujiemian.show();
		   }
	   }
	}
