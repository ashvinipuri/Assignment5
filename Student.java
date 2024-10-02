package Assignment5;

public class Student {
	private String name;
	  private String address;
	  private int age;
	  public Student() {
	 this.name = "unknown";
	      this.age = 0;
	      this.address = "not available";

	}
	  public void setInfo(String name, int age) {
	 this.name=name;
	 this.age=age;
	 
	  }
	 
	  public void setinfo(String name,int age,String address) {
	 this.name=name;
	 this.age=age;
	 this.address=address;
	  }
	  public void print() {
	 System.out.println("Name: " + name + " Age: " + age + " Address: " + address);
	  }
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	           Student[] student=new Student[10];
	           for(int i=0;i<student.length;i++) {
	          student[i] = new Student();
	          if(i%2 == 0) {
	          student[i].setInfo("Student" + (i + 1), 20 + i);
	          }else {
	            student[i].setinfo("Student" + (i + 1), 21 + i, "Address" + (i + 1));
	          }
	           }
	           for (Student student1 : student) {
	               student1.print();}
	}

}
