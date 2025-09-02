package com.julianne.alarmClock;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;

    public AlarmClock(LocalTime alarmTime, String filePath) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime next = LocalDate.now().atTime(alarmTime);
        if (!now.toLocalTime().isBefore(alarmTime)) {
            next = next.plusDays(1);
        }

        while (LocalDateTime.now().isBefore(next)) {
            try {
                LocalTime current = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", current.getHour(), current.getMinute(), current.getSecond());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("\nThread was interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }

        System.out.println("\nAlarm! Playing sound...");
        playSound(filePath);
    }

    private void playSound(String filePath) {
        if (filePath == null) {
            System.out.println("Sound file path is null.");
            return;
        }

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Sound file not found: " + file.getAbsolutePath());
            return;
        }

        Clip clip = null;
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            Thread.sleep(30_000);
        } catch (UnsupportedAudioFileException e) {
            System.err.println("Audio file not supported: " + e.getMessage());
        } catch (LineUnavailableException e) {
            System.err.println("Audio line unavailable: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error opening file: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("Alarm interrupted");
            Thread.currentThread().interrupt();
        } finally {
            if (clip != null) {
                try {
                    clip.stop();
                    clip.close();
                } catch (Exception e) {
                    System.err.println("Failed to stop/close clip: " + e.getMessage());
                }
            }
        }
    }
}
