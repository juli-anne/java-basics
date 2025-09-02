package com.julianne.alarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime alarmTime = null;
        String filePath = "alarmSound.wav";

        while (alarmTime == null) {
            try {
                System.out.print("When would you like to wake up? (24-hour time, e.g., 8:05 or 08:05)\n> ");
                String inputTime = scanner.nextLine().trim();
                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("\nYour alarm has been set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.err.println("Invalid format. Use 24-hour hour:minute, e.g., 8:05 or 08:05 (H:mm).\n");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath);
        Thread alarmThread = new Thread(alarmClock, "AlarmThread");
        alarmThread.start();

        scanner.close();
    }
}
