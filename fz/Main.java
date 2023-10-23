import java.util.Scanner;

public class Maim {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        person p2=new person();
        p2.setName("maina");
        p2.setAddress("mashad");
        person[]p=new  person[5];
        for ((int i=0;i<5;i++){
            p[i]=new person();
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
    public static void testMethod(person f,person t,int x){
        f.setName("reaz");
        t.setAge(x);
        x++;
        person person1=new person();
        t= person1;
    }
}
