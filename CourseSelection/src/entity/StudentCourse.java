package entity;

public  class StudentCourse implements InterfaceEntity {
        private String studentNo;
        private String courseNo;
        private int grade;
        public String getStudentNo() {
        	return studentNo;
        }
        public void setStudentNo(String studentNo) {
        	this.studentNo = studentNo;
        }
        public String getCourseNo() {
        	return courseNo;
        }
        public void setCourseNo(String courseNo) {
        	this.courseNo = courseNo;
        }
        public int getGrade() {
        	return grade;
        }
        public void setGrade(int grade) {
        	this.grade = grade;
        }
}