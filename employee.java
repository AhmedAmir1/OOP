import java.util.*;
import java.lang.*;

class Employee1{
    String name;
    int id;
    int earn;
    int totalpayment = 0;
    public Employee1(String name,int id){
        this.name = name;
        this.id = id;
    }
    public int earnings(){
        return earn;
    }
    // public String toString(){

    // }

}
class HE extends Employee1 {
    int hours;
    int perhrate;
    
    public HE(String name, int id, int hours,int perhrate){
        super(name,id);
        this.hours = hours;
        this.perhrate = perhrate;
        earn  = hours*perhrate;
        totalpayment+=earn;
        
        // totalpayment = 0;
        }
    // public int earnings(){
        // earn  = hours*perhrate;
        // System.out.println("The hourly employee "+name+" and id "+id+" earn $"+earn);
        // totalpayment+=earn;
        // return earn;
    // }
    public String toString(){

        return ("The Hourly employee [name = "+name+" and id = "+id+"] earn $"+earn); 
    }
    }

class CE extends Employee1{
    int percent;
    int  sales;
    public CE(String name, int id, int sales, int percent){
        super(name, id);
        this.percent = percent;
        this.sales = sales;
        earn  = (sales*percent)/100;
        totalpayment+=earn;
    }
    // public int earnings(){
        // earn  = sales*(percent/100);
        // System.out.println("The Cashier employee "+name+" and id "+id+" earn $"+earn);
        // totalpayment+=earn;
        // return earn;
    // }
    public String toString(){
        return ("The Cashier employee [name = "+name+" and id = "+id+"] earn $"+earn); 
    }
    }
class SE extends Employee1{
    int salary;
    public SE(String name,int id, int salary){
        super(name, id);
        this.salary = salary;
        earn  = salary;
        totalpayment+=earn;
    }
    // public int earnings(){
        // int earn  = salary;
        // System.out.println("The hourly employee "+name+" and id "+id+" earn $"+earn);
        // totalpayment+=earn;
        // return earn;
    // }
    public String toString(){
        return ("The Salary employee [name = "+name+" and id "+id+"] earn $"+earn); 
    }
    }


public class employee {
    public static void main(String[] args) throws NullPointerException{
        Employee1[] arr = new Employee1[10];
        int a,b,c,d;
        String e;
        int i=0;
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        while (i<10){
            System.out.println("--Enter 1 for HOURlY employee, 2 for CASHIER employee, 3 for SALARY employee, 4 for employee's earnings and 5 for total payment : ");
            a = sc.nextInt();
            if (a==1){
                System.out.println("Enter the name of hourly employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the number hours: ");
                c = sc.nextInt();
                System.out.println("Enter the rate of per hour: ");
                d = sc.nextInt();
                arr[i] = new HE(e,b,c,d);
                i+=1;
            }
            else if (a==2){
                System.out.println("Enter the name of cashier employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the sale: ");
                c = sc.nextInt();
                System.out.println("Enter the percent: ");
                d = sc.nextInt();
                arr[i] = new CE(e,b,c,d);
                i+=1;
            }
            else if (a==3){
                System.out.println("Enter the name of Salary employee :");
                e = scc.nextLine();
                System.out.println("Enter the id: ");
                b = sc.nextInt();
                System.out.println("Enter the Salary: ");
                c = sc.nextInt();
                arr[i] = new SE(e,b,c);
                i+=1;
            }
            else if (a==4){
                for (int j=0;j<i;j++){
                    // System.out.print("Employee "+arr[j].name+" and id "+arr[j].id+" earn $");
                    System.out.println(arr[j]);
                }
                // i+=1;
            }
            else if (a==5){
                // arr[i] = new Employee1();
                // i is 1 when object in 0 (i is increasing above so it is not run)
                System.out.println("The total payment to all the three employees is "+arr[i].totalpayment);
                // i+=1;
            }
            else{
                break;
            }
        }
        sc.close();
        scc.close();
    }
    
}
