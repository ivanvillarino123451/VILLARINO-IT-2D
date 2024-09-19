public class Grades {
    
   
    int id;
    String name;
    double p, m, pf, f,average;
    
    
    public void addGrade(int sid, String sname, double sm, double spf, double sf, double sp){
        this.id = sid;
        this.name = sname;
        this.p = sp;
        this.m = sm;
        this.pf = spf;
        this.f = sf;
    }


    
    public void viewGrade() {
        average = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        
        System.out.printf("%-10d %-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);
    }


}

