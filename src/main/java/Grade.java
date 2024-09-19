import java.util.Scanner;

public class Grade {
    public void getGrades(){
        Scanner sc = new Scanner(System.in);
        Grades[] grs = new Grades[100];
        
        System.out.print("Enter no. of students: ");
        int st = sc.nextInt();
        
        for(int i = 0; i < st; i++){
            System.out.println("Enter details of student "+(i+1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Prelim: ");
            double pre = sc.nextDouble();
            System.out.print("Midterm: ");
            double mid = sc.nextDouble();
            System.out.print("Prefi: ");
            double pref = sc.nextDouble();
            System.out.print("Final: ");
            double fin = sc.nextDouble();
            
            grs[i] = new Grades();
            grs[i].addGrade(id, name, pre, mid, pref, fin);
        }
        
        double tca = 0;
        int passed = 0;
        int failed = 0;
        
        for(int i = 0; i < st; i++){
            grs[i].average = (grs[i].p+grs[i].m+grs[i].pf+grs[i].f)/4;
            tca = tca + grs[i].average;
            grs[i].viewGrade();
            
            if(grs[i].average > 3.0){
                passed++;
            } else{
                failed ++;
            }
        }
        
        System.out.println("--------------------------------------");
        System.out.println("No. of students: "+st);
        System.out.println("Total Class Average: "+tca/st);
        System.out.println("No. of Passed: "+passed);
        System.out.println("No. of Failed: "+failed);
        
    }
}