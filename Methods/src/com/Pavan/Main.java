package com.Pavan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int  pos = calculateHighScorePosition(10000);
        displayHighScorePosition("Pavan",pos);
    }

    public static void displayHighScorePosition(String name , int position) {
        System.out.println(name +" managed to get into position "+position+" on the highscore table" );
    }
    public static int calculateHighScorePosition(int score) {
        int pos;
        if(score>1000) {
            pos =1;
            return pos;
        }
        else if(score>500 && score<1000) {
            pos =2;
            return pos;
        }
        else if(score>100 && score <500) {
            pos = 3;
            return pos;
        }
        else {
            pos = 4;
            return pos;
        }
    }
}
