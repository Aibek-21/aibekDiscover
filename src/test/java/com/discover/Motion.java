package com.discover;
import java.time.LocalTime;
import java.util.Scanner;
public class Motion {

    static LocalTime lc;

    public static void motionOpen() {
        lc = LocalTime.of(1, 0, 0);
    }

    public static void motionClosed() {
        if (lc.isBefore(lc.plusMinutes(10))) {
            System.out.println("Voting is closed");
        } else {
            System.out.println("Voting can not be closed");
        }
    }

    public static String votingProcess() {
        Scanner scanner = new Scanner(System.in);
        int countYes = 0;
        int countNo = 0;
        String result = "";
        boolean isChairmanAvailable = true;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please Board member " + i + " vote, YES or NO!");
            String vote = scanner.nextLine();
            if (vote.equalsIgnoreCase("yes")) {
                countYes++;
            } else if (vote.equalsIgnoreCase("no")) {
                countNo++;
            }
        }
        if (countYes == countNo) {
            if (isChairmanAvailable) {
                System.out.println("The voting is tied");
                System.out.println("Chairman please vote!");
                String chairmanVote = scanner.nextLine();
                if (chairmanVote.equalsIgnoreCase("yes")) {
                    countYes++;
                } else if (chairmanVote.equalsIgnoreCase("no")) {
                    countNo++;
                }
            } else {
                System.out.println("Voting is failed!");
            }
        }
        if (countYes > countNo) {
            result = "Voting passed!";
            System.out.println(result);
        } else {
            result = "Voting failed!";
            System.out.println(result);
        }
        return result;
    }

}
