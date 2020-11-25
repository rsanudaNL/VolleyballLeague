public class Team {
    private String teamname;
    private String[] player_list;
    private String[] coach_list;
    private int points;
    public Team(String teamname){
        this.teamname = teamname;
        this.points = 0;
    }
    public String getteamname(){
        return this.teamname;
    }
    public int getPoints(){
        return this.points;
    }
    public void increasepoints(int newpoints){
        this.points = this.points + newpoints;
    }
}