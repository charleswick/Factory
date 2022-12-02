public class Sport {
    int PlayersPerTeam;
    String season;
    String name;


    public Sport(String pName, int pPlayersPerTeam, String pSeason){
        name = pName;
        PlayersPerTeam = pPlayersPerTeam;
        season = pSeason;

    }
    public void size(){
        if (PlayersPerTeam > 10){
            System.out.println("Big team");

        }
        else{
            System.out.println("Small team");
        }
    }
    public void print(){
        System.out.println("the sport "+name+" is in "+season);
        System.out.println("and has "+PlayersPerTeam+" players per team");
        size();


    }
}
