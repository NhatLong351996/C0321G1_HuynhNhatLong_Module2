package bai8_cleancode_and_refactoring.baitap;

public class Demo {
    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score==player2Score)
        {
            getTieScore(player1Score, score);
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            getWinner(player1Score,player2Score,score);
        }
        else
        {
            scoring(player1Score,player2Score,score);
        }
        return score;
    }
    public static String scoring(int player1Score, int player2Score,String score){
        int tempScore=0;
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = player1Score;
            else { score+="-"; tempScore = player2Score;}
            switch(tempScore)
            {
                case Love:
                    score+="Love";
                    break;
                case Fifteen:
                    score+="Fifteen";
                    break;
                case Thirty:
                    score+="Thirty";
                    break;
                case Forty:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }
    public static String getTieScore(int player1Score, String score){
        switch (player1Score)
        {
            case LoveAll:
                score = "Love-All";
                break;
            case FifteenAll:
                score = "Fifteen-All";
                break;
            case ThirtyAll:
                score = "Thirty-All";
                break;
            case FortyAll:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
    public static String getWinner(int player1Score, int player2Score, String score){
        int minusResult = player1Score-player2Score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
    public static final int LoveAll =0;
    public static final int FifteenAll =1;
    public static final int ThirtyAll =2;
    public static final int FortyAll =3;
    public static final int Love =0;
    public static final int Fifteen =1;
    public static final int Thirty =2;
    public static final int Forty =3;
}
