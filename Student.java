//prgm to show student class
class Student
{
int studentId,marks;
String stuName,address;
//Declaration of variables
public void displayDetails()
{
studentId=10;
stuName="suman";
marks=50;
address="Hyd";
System.out.println(studentId);
System.out.println(stuName);
System.out.println(address);
System.out.println(marks);
}
public static void main(String a[])
{
Student s1=new Student();
s1.displayDetails();
}
}