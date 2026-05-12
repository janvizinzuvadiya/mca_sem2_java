package com.mycompany.jdbc_demo;


public class Person {
   

    public static void main(String [] args)
    {
        Partime p = new Partime(5, 1, "CS & IT", "Amily");
        p.Display();
        
    }
    
}
 class p
    {
        String name;

        public p(String name) {
            this.name = name;
        }
    }
    class Employee extends p
    {
        int empid;
        String dept;

        public Employee(int empid, String dept, String name) {
            super(name);
            this.empid = empid;
            this.dept = dept;
        }
        public void Display()
        {
            System.out.println(name+" \n"+empid+" || "+dept);
        }

    }
    class Partime extends Employee
    {   
        int work_hr;
        int sal;

        public Partime(int work_hr, int empid, String dept, String name) {
            super(empid, dept, name);
            this.work_hr = work_hr;
        }
         public void Display()
        {
            super.Display();
             countsal();
             System.out.print(sal);
        }

        private void countsal() {
           sal = work_hr*300;
        }
            
    } 
    class Fulltime extends Employee
    {
        int mon_sal;
        int sal;

        public Fulltime(int mon_sal, int empid, String dept, String name) {
            super(empid, dept, name);
            this.mon_sal = mon_sal;
        }
         public void Display()
        {
            netsalary();
             System.out.print(sal);
        }

        private void netsalary() {
           sal = mon_sal*12;
        } 
        
    }
