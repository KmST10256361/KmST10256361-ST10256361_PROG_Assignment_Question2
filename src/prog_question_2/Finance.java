/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_question_2;

/**
 *
 * @author karan
 */
public class Finance extends Hockey_TEAM{
    
    //bubble and intertsetion sort methods

    @Override
    public void ReportNameDisplay() {
        
        System.out.println("-----------------------Finance report of team: "+super.TeamNAME +"-------------------------------------");
        
    }
    
    
   
    public void BubbleSortDESC ( double []  Salary , String [] players )
    {
        
        String semp;
        double temp;
        
        for (int i = 0; i < Salary.length-1; ++i)  //bubble sort used to sort values in descending order 
        {
        
            for (int j = 0; j < Salary.length-1; ++j)
            {
            
                if (Salary[j] < Salary[j+1] ) {
                    
                    temp=Salary[j];
                    Salary[j]=Salary[j+1];
                    Salary[j+1]=temp;
                    
                    semp = players[j];
                   players [j] = players[j+1];
                   players [j+1] = semp;
                    
                } 
                
            }//innner loop
            
        }// outer loop 
        
        
         /*
        the bubble sort can be inproved by using a comparisonToMake varible
        which will be decreased after each pass through the inner loop
        
        this will control the repetitions of the inner for loop 
        */
        
        //Display loop
        System.out.println("");
            System.out.println("Player name"+"\t"+"Salary of player");
        
        for (int i = 0; i < Salary.length; i++) {
            
         
            System.out.println("");
            System.out.println(players[i]+"\t"+"\t"+"R"+Salary[i]);
            
        }
        
        
        
    }  // end of method
        
    
    public void InsertionsortASC (double []  Salary , String [] players )
    {
        
        
        String semp;
        double temp;
        
        //insertion sort used to sort values in ascending order 
        
        int i=1;
        int j;
        
        while (i < Salary.length)   
        {
            
            temp=Salary[i];
            semp=players[i];
            j=i-1;
            
                while ( j >= 0 && Salary[j]  > temp)
                {
                    
                    Salary[j+1]=Salary[j];
                    
                    players[j+1] = players[j];
                    
                    --j;
                
                    
                }// end of innner while loop 
                
                Salary[j+1]=temp;
                players[j+1]=semp;
                ++i;
                
        }// end of outer while loop 
        
        /*
        the insertion sort looks at each list element one at a time 
        if an element is out of order you would move the item down the list 
        by one position and then you would insert the temp varible in its place
        */
        
          //Display loop
          System.out.println("");
            System.out.println("Player name"+"\t"+"Salary of player");
        
        for (int l = 0; l < Salary.length; l++) {
            
         
            System.out.println("");
            System.out.println(players[l]+"\t"+"\t"+"R"+Salary[l]);
            
        }
        
        
    }
   

    
  
    
    
}
