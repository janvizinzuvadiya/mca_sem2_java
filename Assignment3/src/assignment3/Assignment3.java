package assignment3;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) throws Exception 
    {
//            student_02 s= new student_02(1, " Janvi " , 17 , "MCA");
//            try
//            {
//                s.checkAge();
//                s.checkName();
//             }
//              catch(Exception e)
//            {
//                System.out.println("\n Message: "+ e);
//            }
//            
//            number_null_exception_01 n = new number_null_exception_01();
//            try
//            {
//                n.checkNumberNullErr();
//            }
//            catch(NullPointerException e)
//            {
//                System.err.print(e);
//            }
//            catch(NumberFormatException e)
//            {
//                System.err.print(e);
//            }
        
            Scanner sc = new Scanner(System.in);

            System.out.print("How Many Staff Members You Want to Add:");
            int members = sc.nextInt();
            
            ArrayList<staff_04> staffmembers= new ArrayList<>();
            
            for (int i=1; i<=members ;i++)
            {
                        System.out.println("Enter Job Type:");
                        System.out.print("1) Full Time\t");
                        System.out.print("2) Part Time");

                        System.out.println("\n Enter Choice->");
                        int num = sc.nextInt();

                        System.out.print("Enter Name:");
                        String name = sc.next();
                        sc.nextLine();
                        
                        System.out.print("Enter Address:");
                        String add = sc.nextLine();
                        
                        if(num == 1)
                        {
                                System.out.print("Enter Department: "); 
                                String dept = sc.nextLine();
                                
                                System.out.print("Enter Salary: "); 
                                double sal = sc.nextDouble();
                                
                                staffmembers.add(new FullTimeStaff(name, add, dept, sal));
                        }
                        else if(num == 2)
                        {
                              System.out.print("Enter Hours: "); 
                              int hrs = sc.nextInt();
                               
                              System.out.print("Enter Rate per Hour: "); 
                              double rate = sc.nextDouble();
                                
                               staffmembers.add(new PartTimeStaff(name, add, hrs, rate));
                        }
                        else
                        {
                            System.out.println("Invalid Option");
                        }
            }
            
            System.out.println("All Staff Details-------------------------------------------------------");
            System.out.println("\nFull Time Staff Members-->");
            
            for(staff_04 totalmembers : staffmembers)
            {
                if(totalmembers instanceof FullTimeStaff ft)
                {
                    ft.Display();
                }
            }
            System.out.println("\nPart Time Staff Members-->");
            
            for(staff_04 totalmembers : staffmembers)
            {
                if(totalmembers instanceof PartTimeStaff pt)
                {
                    pt.Display();
                }
            }
        
    }
}
