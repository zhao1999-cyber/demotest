package biz;

import dao.StudentDao;
import entity.Student;
import view.Zhujiemian;

public class StudentBiz {
	//学生服务层   登录操作  注册操作   修改密码操作
         StudentDao studentDao;
         private Student student;
  //登录
         public void login(String studentNo,String  studentPassword) throws Exception {
        	 
        	 studentDao = StudentDao.getInstance();
        	 student = (Student)studentDao.getEntity(studentNo);
        	 if(student == null) {
        		 System.out.println("用户不存在");
        		 Zhujiemian.show();
        	 }else if (student.getStudentPassword().equals(studentPassword)) {
        		 System.out.println("登陆成功");
        		 Zhujiemian.show();
        	 }else {
        		 System.out.println("密码不正确");
        		 Zhujiemian.show();
        	 }
         }
  //注册
         public void register(Student student,String firstPassword,String secondPassword) throws Exception {
        	 if(firstPassword.contentEquals(secondPassword)) {
        		 this.student = new Student();
        		 this.student.setStudentNo(student.getStudentNo());
        		 this.student.setStudentName(student.getStudentName());
        		 this.student.setStudentAge(student.getStudentAge());
        		 this.student.setStudentGender(student.getStudentGender());
        		 this.student.setStudentDepartment(student.getStudentDepartment());
        		 this.student.setStudentPassword(firstPassword);
        		 studentDao = StudentDao.getInstance();
        		 studentDao.insert(this.student);
        		 System.out.println("注册成功!");
        		 Zhujiemian.show();
        	 }else {
        		 System.err.println("注册失败!");
        		 Zhujiemian.show();
        	 }
         }
      //修改密码
         public void modifyPassword() throws Exception{	 
        		 student = new Student();
        		 studentDao = StudentDao.getInstance();
        		 studentDao.update();
        		 System.out.println("修改成功!");
        		 Zhujiemian.show();
		}
}
