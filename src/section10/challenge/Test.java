package section10.challenge;

import section10.generics.BaseballPlayer;
import section10.generics.FootballPlayer;
import section10.generics.Team;

public class Test {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballleague = new League<>("AFL");

        Team <FootballPlayer> adelaidecrows = new Team <> ("adelaide crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
        Team<FootballPlayer> fermantle = new Team<>("fermantle");

        footballleague.addteam(adelaidecrows);
        footballleague.addteam(melbourne);
        footballleague.addteam(hawthorn);
        footballleague.addteam(fermantle);

        hawthorn.matchresult(fermantle,1,0);
        hawthorn.matchresult(adelaidecrows,3,8);
        adelaidecrows.matchresult(fermantle,2,1);
        footballleague.showleaguetables();

    }
}
