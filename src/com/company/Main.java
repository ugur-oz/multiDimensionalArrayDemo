package com.company;

public class Main {

    public static void main(String[] args) {
        String[][] citys = new String[3][3];
        citys[0][0] = "München";
        citys[0][1] = "Berlin";
        citys[0][2] = "Köln";
        citys[1][0] = "Mannheim";
        citys[1][1] = "Ulm";
        citys[1][2] = "Hamburg";
        citys[2][0] = "Kiel";
        citys[2][1] = "Augsburg";
        citys[2][2] = "Bingen";

        for(int i=0;i<=2;i++){
            System.out.println("------------");
            for(int j=0;j<=2;j++){
                System.out.println(citys[i][j]);
            }
        }
    }
}
