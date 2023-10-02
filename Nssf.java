  
public class nssf {
    public static void main(String[] args) {
        double salary = 1400000; 
        
        double payeRate = 0.0;

        if (salary <= 235000) {
            payeRate = 0.0;
        } else if (salary > 235000 && salary <= 335000) {
            payeRate = 0.10;
        } else if (salary > 335000 && salary <= 410000) {
            payeRate = 0.20;
        } else if (salary > 410000 && salary <= 10000000) {
            payeRate = 0.30;
        } else if (salary > 10000000) {
            payeRate = 0.40;
        }

        double payeAmount = salary * payeRate;
        
        System.out.println("Salary: " + salary);
        System.out.println("PAYE Rate: " + (payeRate * 100) + "%");
        System.out.println("PAYE Amount: " + payeAmount);
    }
}

    

