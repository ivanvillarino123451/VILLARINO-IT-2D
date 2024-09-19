public class Product {
    int pid;
    String pname;
    double price;
    int stocks, sold;
    
    public void addProducts(int id,String name, double pr, int stcks, int sld){
        this.pid = id;
        this.pname = name;
        this.price = pr;
        this.stocks = stcks;
        this.sold = sld;
    }
    
    public void getProducts(){
        double profit = this.price*this.sold;
        double tep = this.stocks*this.price;
        
        String status = (this.stocks > 0) ? "Available" : "Out-of-Stocks";
        
        //System.out.println("   "+this.pid+"    "+this.pname+"    "+this.price+"    "+this.stocks+"     "+this.sold+"    "+profit+"     "+tep+"   "+status);
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s",pid, pname, price, stocks, sold, profit, tep, status);
    }
}
    

