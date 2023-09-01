public class OOps {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.Setcolor("Black");
        p1.Settip(5) ;
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());

        Student s1 = new Student();
        s1.marks(92, 95, 98);
        System.out.println(s1.percentage);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "devansh verma";
        myAcc.setPassword("abcdefg");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

class Pen{
    private String color;
    private float tip;
    
    void Setcolor(String newColor){
        color = newColor;
    }

    String getcolor(){
        return this.color;
    }

    void Settip(float newTip){
        tip = newTip;
    }

    float gettip(){
        return this.tip;
    }
}

class Student{
    int percentage;
    void marks(int phy,int chem,int bio){
        percentage = (phy+chem+bio)/3;
    }
}
