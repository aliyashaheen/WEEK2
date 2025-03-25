class studentdetails{
String name;
int rn;
double marks;

studentdetails(String name, int rn, double marks){
    this.name = name;
    this.rn = rn;
    this.marks = marks;
}

void display(){
    System.out.println("name : " + name + " roll number: " + rn + "marks : " + marks);}
}

public class student{
public static void main(String[] args){
    studentdetails stu = new studentdetails("ALIYA", 101, 90);
    stu.display();
}}