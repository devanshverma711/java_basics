public class Ooops {
    public static void main(String[] args) {
       // Student s1 = new Student("Devansh");
        Student s2 = new Student();
        //Student s3 = new Student(123);
        s2.roll=21;
        s2.name="Ram";
        s2.password=000;
        s2.marks[0]=80;
        s2.marks[1]=90;
        s2.marks[2]=75;
       // System.out.println(s1.name);
        //System.out.println(s3.roll);

        Student s4 = new Student(s2);
        s4.password=123;
       // s2.marks[2]=100;
       // for(int i=0;i<3;i++){
        //   System.out.println(s4.marks[i]);
       // }
    }
}

class Student{
    String name ;
    int roll;
    int password;
    int marks[];

 /*    Student(Student s2){
        this.name =s2.name;
        this.roll = s2.roll;
        this.marks=s2.marks;
    }
*/
     Student(Student s2){
        this.name =s2.name;
        this.roll = s2.roll;
       // for(int i=0;i<3;i++){
       //     this.marks[i]=s2.marks[i];
      //  }
    }

    
    Student(){
        marks=new int[3];
        System.out.println("Student is called");
    }
    Student(String name){
        marks = new int[3];
        this.name =name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll =roll;
    }
}
