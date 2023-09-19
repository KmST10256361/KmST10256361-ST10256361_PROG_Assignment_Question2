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
public class Points_and_Fouls extends Hockey_TEAM {
    
    String  [] [] report = new String [5] [3]; //five rows and  two colums
    
    enum PlayerType {Attack_players ,Defence_players  }; //enumeratio used to choose player types 
    
    String playerNAME;
    String pointsPerPlayer;
      String fouls_perplayer ;
     
      String playercondition;
      String typeplayer;
     
     PlayerType type; // enum varible
     
     
     
    
   
    public void input()
    {
       //we not added we overwirting the parent input method and therefore this line is not needed >> super.input(); 
        Scanner kb = new Scanner(System.in);
        int counter=1;
        
        System.out.println("Please read and answer the questions below you will be required to enter 5 players on your team");
        System.out.println("You will choose iether attack type players or deffense type players ");       
        System.out.println("You will then be required to enter the number of points and fouls they have committed");
        System.out.println("");
        System.out.println("What players will you choose to be entered in:\nEnter (1) for attack players \nEnter (2) for deffense players ");
        
       playercondition =kb.next();
        
        if (playercondition.equals("1"))  //enum varible used to store the string from the enum array
        {
           
                    type=PlayerType.Attack_players;
                    typeplayer=type.toString();
                    
        }else{
                    type=PlayerType.Defence_players;
                    typeplayer=type.toString();
                    
        }// end of if else
        
        // loops below to insert values into the 2d array 
        
           for (int i = 0; i < 5; i++)
        {
            
              for (int j = 0; j < 1; j++) 
                {
                    System.out.print("Enter the name for player "+counter+": >>>>");
                    playerNAME = kb.next();
                    report[i][j]=playerNAME;
                    System.out.println("");
                    
                    System.out.print("Enter the amount of points the player has scored>>>>");
                    pointsPerPlayer=kb.next();
                    report[i][j+1]=pointsPerPlayer;
                    System.out.println("");
                    
                    System.out.print("Enter the amount fouls the player has conceded >>>>");
                   fouls_perplayer=kb.next();
                   report[i][j+2]=fouls_perplayer;
                    System.out.println("");
                    
                    
                    
                }//coluom loop
              
              counter=counter + 1;
        }// row loop 
           
             
    }// end of input class

   
    public  void Display() {
        
        System.out.println("The Team name is  "+ super.getTeamNAME());//parent class method  
        
        System.out.println("The amount of games that were played : "+super.getGamesPLAYED());//parent class method  
        
        System.out.println("The type of players you enterd were :  "+type);
        System.out.println("");
        System.out.println("Name of player\t Points scored\t Fouls conceded");     
        
        for (int i = 0; i < report.length; i++)
        {
            System.out.println("");
            
              for (int j = 0; j < report[i].length; j++) // this take the length of the  row you are cureeently on  as long as it less than j 
                {
                    
                        System.out.print(report[i][j]+"               "+"  ");
                  
                }//coluom loop
              
        }// row loop 
        
      
    }//end of display class

    @Override
    public void ReportNameDisplay() {
        System.out.println("-------------------------------The players points and fouls report of team "+super.getTeamNAME()+"-----------------------------------");
    }
    
       
}
