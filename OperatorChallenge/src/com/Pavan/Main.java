package com.Pavan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double dub = 20d;
        double dub2 = 80d;
        double res = (dub+dub2) *25;
        System.out.println(res);

        double rem = res%40;

        if(rem<=20)
            System.out.println("This was over the limit " + rem);
    }
}
