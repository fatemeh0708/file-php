import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Person[] people=new  Person[5];


        for(int i=0;i<5;i++){
            System.out.print("id:");
            int id=scanner.nextInt();

            System.out.print("name:");
            String name=scanner.next();


            System.out.print("expert:");
            String expert=scanner.next();

            Person p=new Person(id,name,expert);
            people[i]=p;
            float avg=avrage();
            people[i].setAvg(avg);
            System.out.println(people[i].getId());
            System.out.println(people[i].getName());
            System.out.println(people[i].getExpert());
            System.out.println(people[i].getAvg());
            System.out.println(".................");

        }


    }
    public static float avrage(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("نمره را وارد کنید");

        int [] array=new int[4];
        int sum=0;یی ز
        float avg=0;
        for(int i=0;i<4;i++){
            array [i]=scanner.nextInt();
            sum+=array[i];
        }
        avg=sum/4;
        return avg;
    }


}


