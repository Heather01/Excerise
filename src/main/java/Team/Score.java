package Team;

public class Score {
    private String name1;
    private String name2;
    private int goal2;
    private int goal1;


    public Score(String n1, int g1, String n2, int g2) {
        name1 = n1;
        name2 =n2;
        goal1 = g1;
        goal2 = g2;
    }

    public String DisplayScore() {
        String score;
        if (goal1> goal2){
            score= name1;
        }
        else if (goal2 >goal1) {
            score = name2;
        }
        else {
            score= "draw";
        }

        return score;
    }
}
