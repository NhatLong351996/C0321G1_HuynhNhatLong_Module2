package bai8_cleancode_and_refactoring.baitap;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int play1Score, int play2Score) {
        String score = "";

        if (play1Score == play2Score) {
            getScoreEqual(play1Score, score);
        } else if (play1Score >= 4 || play2Score >= 4) {
            getWiner(play1Score, play2Score, score);
        } else {
            getScoreFollowing(play1Score, play2Score, score);
        }
        return score;
    }

    public static String getScoreEqual(int play1Score, String score) {
        switch (play1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }


    public static String getWiner(int player1Score, int player2Score, String score) {
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String getScoreFollowing(int player1Score, int player2Score, String score) {
        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }


}
