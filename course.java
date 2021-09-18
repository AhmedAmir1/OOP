import java.util.Scanner;

class Course1 {
    String name;
    int no_ofstudents = 0;
    String[] students_list = new String[10];

    Course1(String n) {
        name = n;
    }

    String getname() {
        return name;
    }

    void addstudent(String nameofstu) {
        students_list[no_ofstudents] = nameofstu;
        no_ofstudents = no_ofstudents + 1;
    }

    void getstudents() {
        for (int i=0;i<no_ofstudents;i++){
            System.out.println(students_list[i]);
        }
    }
    int getno_ofstudents() {
        return no_ofstudents;
    }
}

public class course {
    public static void main(String[] args) {
        String b;
        int a;
        Course1 obj = new Course1("Physics");
        Scanner scc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----Enter 1 for course name, 2 for add student, 3 for students name, 4 for no of students and other for exit ");
            a = scc.nextInt();
            if (a == 1) {
                System.out.println("The name of course is " + obj.getname());
            } else if (a == 2) {
                System.out.println("Enter the name of student: ");
                b = sc.nextLine();
                obj.addstudent(b);
            } else if (a == 3) {
                System.out.println("The Students are:");
                obj.getstudents();
            } else if (a == 4) {
                System.out.println("The number of students are " + obj.getno_ofstudents());
            } else {
                break;
            }
        }
        scc.close();
        sc.close();

    }
}
