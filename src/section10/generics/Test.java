package section10.generics;

public class Test {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team <FootballPlayer> adelaidecrows = new Team <> ("adelaide crows");
        adelaidecrows.AddPlayer(joe);
       // adelaidecrows.AddPlayer(beckham);

        System.out.println(adelaidecrows.numplayer());

        Team <BaseballPlayer> chicagocubs = new Team<>("chicago cubs");
        chicagocubs.AddPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.AddPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
        Team<FootballPlayer> fermantle = new Team<>("fermantle");

        hawthorn.matchresult(fermantle,1,0);
        hawthorn.matchresult(adelaidecrows,3,8);

        adelaidecrows.matchresult(fermantle,2,1);
        // adelaidecrows.matchresult(chicagocubs,1,1);

        System.out.println("rankings");
        System.out.println(adelaidecrows.getName() + " : "+ adelaidecrows.ranking());
        System.out.println(melbourne.getName() + " : "+ melbourne.ranking());
        System.out.println(hawthorn.getName() + " : "+ hawthorn.ranking());
        System.out.println(fermantle.getName() + " : "+ fermantle.ranking());

        System.out.println(adelaidecrows.compareTo(melbourne));
        System.out.println(adelaidecrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaidecrows));
        System.out.println(melbourne.compareTo(fermantle));
    }
}
