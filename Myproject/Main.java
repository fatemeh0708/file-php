import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Person p2=new Person();
        p2.setName("maina");
        p2.setAddress("mashad");
        Person[]p=new  Person[5];
        for (int i=0;i<5;i++){
            p[i]=new Person();
            System.out.println("نام را وارد کنید");
            String name=scanner.next();
            p[i].setName(name);
            System.out.println("سن زل وارد کنید");
            int age=scanner.nextInt();
            p[i].setAge(age+3);
            System.out.println(p[i].getName());
            System.out.println(p[i].getAge());
        }



    }
    public static void testMethod(Person f,Person t,int x){
        f.setName("reaz");
        t.setAge(x);
        x++;
        Person person1=new Person();
        t= person1;
    }
}
