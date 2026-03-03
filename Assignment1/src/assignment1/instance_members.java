package assignment1;

public class instance_members 
{ 
     String house1 = "Gryffindor ";
     String house2 = "Hufflepuff ";
     String house3 = "Ravenclaw ";
     String house4 = "Slytherin ";
     
     String result = "";
     String team1 = "";
     String team2 = "";
     
        public void Quidditch_match(String team1, String team2)
        {
            this.team1 = team1;
            this.team2 = team2;
            
            if(team1.startsWith("Gry",0) )
            {
                this.result = " Congratulations Gryffindor Team You Won the Match ";
                this.result += "\nBetter Luck Next time! "+ team2;
            }
            else if( team2.startsWith("Gry",0))
            {
                this.result = " Congratulations Gryffindor Team Won the Match ";
                this.result += "\nBetter Luck Next time! "+ team1;
            }

            System.out.println("Quidditch Match Results:\n\t"+result);
        } 
}
