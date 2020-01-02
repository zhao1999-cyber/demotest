package biz;

import dao.*;
import entity.*;
import view.Zhujiemian;

public class CourseBiz {
         CourseDao courseDao;
         private Course course;
		public void register(String CourseNo,
				String CourseName,
				int CourseGrade) throws Exception {
			
				course = new Course();
				course.setCourseNo(CourseNo);
				course.setCourseName(CourseName);
				course.setCourseGrade(CourseGrade);
				courseDao = CourseDao.getInstance();
				courseDao.insert(course);
				System.out.println("注册成功!");
				Zhujiemian.show();
		}
		public void modifyPassword() throws Exception{	 
   		 course = new Course();
   		 courseDao = CourseDao.getInstance();
   		 courseDao.update();
   		 System.out.println("修改成功!");
   		 Zhujiemian.show();
}
}
