package assignment2;

//4. Define a class University having instance variable uname, ucity and tot_stud.
//Define getUni() method to initialize instance variable. Define derived class
//Department having instance variable deptno and deptname. Define getDept()
//method to initialize instance variable. Also define display() method to display all
//information. Create two objects and demonstrate.
//
//5. In above classes define parameterized constructor to initialize instance variable.
//Create two objects and demonstrate.

public class university_04_05 
{
            String uname;
            String ucity;
            int tot_stud;

            public university_04_05(String uname,String ucity, int tot_stud)
            {
                     this.uname= uname ;
                     this.ucity  =  ucity ;
                     this.tot_stud= tot_stud ;
            }

        //        public void getUni(String nm,String ct, int total)
        //        {
        //            uname = nm;
        //            ucity = ct;
        //            tot_stud = total;
        //        } 
}
class Department extends university_04_05
{
            int Deptno;
            String Deptname;

            public Department(int Deptno,String Deptname,String uname,String ucity, int tot_stud)
            {
                super(uname,ucity,tot_stud);
                this.Deptno = Deptno;
                this.Deptname = Deptname;
            }
        //    public void getDept(int no,String nm)
        //    {
        //        Deptno = no;
        //        Deptname = nm;
        //    }
            public void Display()
            {
                System.out.println("---------------------------------------------");
                System.out.println("University Name:\t"+uname);
                System.out.println("University City:\t"+ucity);
                System.out.println("Total Students:\t\t"+tot_stud);

                System.out.println("Department No:\t\t"+Deptno);
                System.out.println("Department Name:\t"+Deptname);  
                System.out.println("---------------------------------------------");
                System.out.println("");
            }
}
