package biz;

import dao.StudentDao;
import entity.Student;
import view.Zhujiemian;

public class StudentBiz {
	//ѧ�������   ��¼����  ע�����   �޸��������
         StudentDao studentDao;
         private Student student;
  //��¼
         public void login(String studentNo,String  studentPassword) throws Exception {
        	 
        	 studentDao = StudentDao.getInstance();
        	 student = (Student)studentDao.getEntity(studentNo);
        	 if(student == null) {
        		 System.out.println("�û�������");
        		 Zhujiemian.show();
        	 }else if (student.getStudentPassword().equals(studentPassword)) {
        		 System.out.println("��½�ɹ�");
        		 Zhujiemian.show();
        	 }else {
        		 System.out.println("���벻��ȷ");
        		 Zhujiemian.show();
        	 }
         }
  //ע��
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
        		 System.out.println("ע��ɹ�!");
        		 Zhujiemian.show();
        	 }else {
        		 System.err.println("ע��ʧ��!");
        		 Zhujiemian.show();
        	 }
         }
      //�޸�����
         public void modifyPassword() throws Exception{	 
        		 student = new Student();
        		 studentDao = StudentDao.getInstance();
        		 studentDao.update();
        		 System.out.println("�޸ĳɹ�!");
        		 Zhujiemian.show();
		}
}
