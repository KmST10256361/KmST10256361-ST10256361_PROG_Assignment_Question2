 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_question_2;

import java.util.Scanner;

/**
 *
 * @author karan
 */

  /*
           Senario explination : 
          
          A user that supports a hockey team may want to know certain statistics and generate reports
          with those statistics. This program will allow users to enter certain information about thier team and 
          the information that they enter will be used to generate reports about the hockey team they support.
          This can include finances , goals , points or even fouls that the players on the team had collected
          
          
    */

//--year one - bacd-group 2
//Student number : ST10256361
//Full name : Karan Moodley 


//The referances used for project    
        
 // https://www.youtube.com/watch?v=cCgOESMQe44
//https://www.youtube.com/watch?v=L1htVG3xP5Y
//https://www.youtube.com/watch?v=j0lBrYSlYaU
//https://www.youtube.com/watch?v=d08oJlwVgyo&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg&index=17
//https://www.youtube.com/watch?v=6wVmqY-CrGM
//https://www.youtube.com/watch?v=Mm06BuD3PlY

public class PROG_QUESTION_2 {

    /**
     * @param args the command line arguments
     */
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        //HOCKEY TEAM REPORT COMPILER
        
        Hockey_TEAM HC = new Hockey_TEAM();
        Points_and_Fouls PAF = new Points_and_Fouls();
        Finance FN = new Finance();
        PROG_QUESTION_2 PG = new PROG_QUESTION_2();
        
        
          String  [] [] report = new String [5] [3]; //five rows and  two colums
    
    
        
   int teamNum;
   String TeamNAME;
   int GamesPLAYED;
   String teamMangerName;
   int Medicalmembers;
   
   String dummie1;
   String dummie2;
   String dummie3;
   
   boolean dum1=false;
   boolean dum2=false;
   boolean  dum3=false;
   boolean valid=false;
   
   String choice;
   String ch;
   
Scanner kb = new Scanner(System.in);
     
  
        System.out.println("----------------------------Welcome to Hockey team report generator---------------------------");
        System.out.println(" "); // used to space out the output statements
   
        
                
       System.out.print("Enter the name of the team here >>>");
        TeamNAME=kb.next();
        System.out.println("");
        
        System.out.print("Enter the managers name of the team>>>>");
        teamMangerName=kb.next();
        System.out.println("");
        
        //vaildation done below
        
       System.out.print("Enter the number of players (in digits) that are on the team >>>");
       dummie1=kb.next();
       
        System.out.println("");
       
        System.out.print("Enter the amount of games played (in digits ) by the team >>>> ");
        dummie2=kb.next();
        System.out.println(""); 
       
        System.out.print("Enter the number of medical team members on the team( in digits) >>>>");
        dummie3=kb.next();
        
        
            while (valid!=true)  // while loop will validate that digits are entered
            {
             
                dum1=PG.digitcheck(dummie1);
                dum2=PG.digitcheck(dummie2);
                dum3=PG.digitcheck(dummie3);
                
                if (dum1==true && dum2==true && dum3 ==true) 
                {
                    
                    valid=true;  // this will teminate the while loop and the program will continue to the next phase
                    teamNum=Integer.parseInt(dummie1);
                    GamesPLAYED=Integer.parseInt(dummie2);
                    Medicalmembers=Integer.parseInt(dummie3);
                    
                   // all varibles will be saved to the parent class 
                  HC.input(TeamNAME, teamMangerName, teamNum, GamesPLAYED, Medicalmembers);
                    
                }else{
                    System.out.println(" ");
                    System.out.println("Incorrect Please ensure that number are used not words");
                    System.out.println("");
                    
                       System.out.print("Enter the number of players (in digits) that are on the team >>>");
                         dummie1=kb.next();
       
                         System.out.println("");
       
                        System.out.print("Enter the amount of games played (in digits ) by the team >>>> ");
                        dummie2=kb.next();
                        System.out.println(""); 
       
                        System.out.print("Enter the number of medical team members on the team( in digits) >>>>");
                        dummie3=kb.next();
                    
                   
                }
                
                
            }// end of while loop
        
   
        
     
        
       
        
        
       HC.ReportNameDisplay();
       //Method call used to get varibles and display them
       
       HC.Display(HC.getTeamNAME() , HC.getTeamMangerName() ,HC.getTeamNum() , HC.getGamesPLAYED() ,HC.getMedicalmembers());
       
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");  
         System.out.println(" ");
         
         System.out.println("------------------------------------------MAIN MENU----------------------------------------------------------");
        System.out.println("Enter 1 to start Points and fouls report\nEnter 2 to start Finance report\nEnter 3 to EXIT program ");
       choice=kb.next();
       
       boolean chCHeck=false;
       
        
    while(chCHeck!=true)
    {    
     
            switch (choice) 
        { 


            case "1" : 

               PAF.setTeamNAME(HC.getTeamNAME());
               PAF.setGamesPLAYED(HC.getGamesPLAYED());
               // HAD TO do the above code beaucse i used super.get in the method that is in the child class and the parent vaible is still null
               //when i did this the parent vairbles that i used in the child class were not null but the correct values 



                  System.out.println("");


             PAF.input();
             PAF.ReportNameDisplay();
             PAF.Display();
              
                System.out.println("");



           break;

            case "2": 

                 FN.setTeamNAME(HC.getTeamNAME() ); // HAD TO intsilaise the value agian so that the parent class varible
                 // not be null when the varible is used in the child class methods 

                System.out.println("");

                  double [] Salary = new double[5];

                  String [] players = new String[5];

                  int counter =1;
                  String name;

                  int sal=0;

                  System.out.println("-----------------------Welcome to finance report generartor-----------------------------");

                  System.out.println("");
                  System.out.println("For "+HC.getTeamNAME()+ " you will enter the the top five players on your team\nand you will also enter thier salries ");

                  for (int i = 0; i < players.length; i++)//for loop used to populate the arrays
                  {  

                      System.out.println(" ");
                         System.out.println("Enter player  "+counter+" name and surname");
                      name=kb.next();
                  
                      players[i]=name;


                       System.out.println("Enter  "+players[i]+" salary per month ");
                      sal=kb.nextInt();
                      Salary[i]=sal;


                      counter=counter+1;
                }


                  boolean FNcheck=false;
               String ARRch;   
                System.out.println("");
            System.out.println("Enter 1 to view players and thier salaries in descending order\nEnter 2 to view player and thier salaries in ascending order");
                System.out.println("Enter 3 to EXIT finance reports");
                
                ARRch=kb.next();

                
              while (FNcheck!=true)  // while used to validate and check ARRCH varible
              {
                
                       switch(ARRch) 
                       {
                           
                           case "1":
                            FN.ReportNameDisplay();
                               System.out.println("");
                            System.out.println("Players name and thier salaries in descending order");
                               System.out.println("");
                            FN.BubbleSortDESC(Salary, players);
                            System.out.println("-------------------------------------------------------------------------------");
                            
                            break;
                            
                           case "2":

                            FN.ReportNameDisplay();
                               System.out.println("");
                            System.out.println("Players name and thier salaries in Aescending order");
                               System.out.println("");
                            FN.InsertionsortASC(Salary, players);
                             System.out.println("-------------------------------------------------------------------------------");

                             break;
                             
                           case "3":
                               
                                FNcheck=true;
                               
                           break;
                               
                             
                             default: 
                                 System.out.println("");
                                 System.out.println("Please enter the correct choices from Finance report");
                                 System.out.println("");
                                 
                        }
                       
                  if (FNcheck!=true) {
                    
                 System.out.println("Enter 1 to view players and thier salaries in descending order\nEnter 2 to view player and thier salaries in ascending order");
                System.out.println("Enter 3 to EXIT finance reports");
                
                ARRch=kb.next();
                          
                  }       
                       
              }// end of inner while loop 
              
              
         break;
         
         
            case "3":
                
                    chCHeck=true;
                
                break;
         
         
         default:
             System.out.println("");
             System.out.println("Enter the correct choice please !!!!!!!!!!!!");
             System.out.println("");
             
        
      
        }// end of the main switch
  
    
        if (chCHeck!=true)
        {
            System.out.println(" ");
             System.out.println("------------------------------------------MAIN MENU----------------------------------------------------------");
            System.out.println("Enter 1 to start Points and fouls report\nEnter 2 to start Finance report\nEnter 3 to EXIT program ");
            choice=kb.next();
        }
   
            
    }// end of main while
    
    
        System.out.println("");
        System.out.println("Thank you for using this program ");
    
    
    
  
    }// main 
    
    
    public boolean digitcheck (String num)
    {
        
       //useing try catch method
       
       try                                              //try -tries to convert the string to an integer 
       {
           Integer.parseInt(num);
           return true;
          
       }
       catch (Exception E)
       {
           return false;      //if the string cannot be converted then false is returned
       }
       
    }// end of method
    
}
