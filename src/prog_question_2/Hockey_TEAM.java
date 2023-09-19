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
public class Hockey_TEAM { // Parent class / the super class
    
  protected int teamNum;
   protected String TeamNAME;
   protected int GamesPLAYED;
   protected String teamMangerName;
    protected int Medicalmembers;

    //setters
    public void setTeamNum(int teamNum) {
        this.teamNum = teamNum;
    }

    public void setTeamNAME(String TeamNAME) {
        this.TeamNAME = TeamNAME;
    }

    public void setGamesPLAYED(int GamesPLAYED) {
        this.GamesPLAYED = GamesPLAYED;
    }

    public void setTeamMangerName(String teamMangerName) {
        this.teamMangerName = teamMangerName;
    }

    public void setMedicalmembers(int Medicalmembers) {
        this.Medicalmembers = Medicalmembers;
    }

    //getters
    public int getTeamNum() {
        return teamNum;
    }

    public String getTeamNAME() {
        return TeamNAME;
    }

    public int getGamesPLAYED() {
        return GamesPLAYED;
    }

    public String getTeamMangerName() {
        return teamMangerName;
    }

    public int getMedicalmembers() {
        return Medicalmembers;
    }

   
    
        public void input ( String TeamNAME ,  String teamMangerName , int teamNum ,   int GamesPLAYED ,int Medicalmembers)
        {
           
       setTeamNAME(TeamNAME);
       
        setTeamMangerName(teamMangerName);
     
        setTeamNum(teamNum);
      
        setGamesPLAYED(GamesPLAYED);
     
        setMedicalmembers(Medicalmembers);
            
        }
    
    public void Display(String TeamNAME ,  String TeamMangerName ,  int TeamNum , int GamesPLAYED, int Medicalmembers )
    {
     
                System.out.println("Name of the team:  "+TeamNAME);
                System.out.println("Name of the teams manager:  "+TeamMangerName);
                System.out.println("The number of players on the team  " + TeamNum);
                System.out.println("The number of games played by the team:  "+GamesPLAYED);
                System.out.println("The number of medical staff on the team:  "+Medicalmembers);
               
    }
    
    public void ReportNameDisplay  ()
    {
        System.out.println("-------------------------Basic Team report for "+getTeamNAME()+"-------------------------------");
    }
    

        
}
