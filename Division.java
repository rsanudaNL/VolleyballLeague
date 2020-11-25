import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Division {
    private String divisionname;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    public Division(String divisionname){
        this.divisionname = divisionname;

    }
    public void leaguesetup(ArrayList<Team> teams){
        this.teams = new ArrayList<>();
        this.teams = teams;
    }

    private boolean checksamedivision(Team team1, Team team2){
        if (this.teams.contains(team1) && this.teams.contains(team2)){
            return true;
        } else {
            return false;
        }
    }
    public void addMatch(Team team1, Team team2, int team1points, int team2points){
        Match newmatch = new Match(team1, team2, team1points, team2points);
        if (checksamedivision(team1, team2)){
            matches.add(newmatch);
            team1.increasepoints(team1points);
            team2.increasepoints(team2points);
            calculatestanding(team1, team2);
        }else{
            System.out.println("Error teams are not in the same division");
        }
    }
    public void calculatestanding(Team team1, Team team2){
        teams.sort(Comparator.comparingInt(team -> team.getPoints()));
        for (int i = 0; i < this.teams.size();i++)
        {
            System.out.println(this.teams.get(i).getteamname());
        }
    }
}
