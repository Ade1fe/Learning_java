import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        int hra;
        int specialallowance;
        int pf;
        int netpayablesalary;
        int basicsalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        basicsalary = scanner.nextInt();

        hra = (50*basicsalary)/100;
        specialallowance =(50*basicsalary)/100;
        pf = (50*basicsalary)/100;
        netpayablesalary = hra+specialallowance+basicsalary-pf;

        System.out.println("Basic Salary        = "+basicsalary);
        System.out.println("Hra                 = "+ hra);
        System.out.println("Special allowance   = "+specialallowance);
        System.out.println("PF                  = "+pf);
        System.out.println("net pay salary      = "+ netpayablesalary);
    }
}
