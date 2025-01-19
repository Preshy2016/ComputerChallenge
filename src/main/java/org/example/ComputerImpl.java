package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerImpl implements ComputerService {
    ArrayList <Computer> computer = new ArrayList<>();
    Scanner sc = new Scanner(System.in);



    @Override
    public void startChallenge() {

        System.out.println("Welcome to the Quiz!\nYou only have 3 attempts for each question. GoodLuck...");
        addQuestions();
        getUserInput();

    }

    @Override
    public void addQuestions() {
        computer.add(new Computer("Dell", "8TB", "32GB", "Windows"));
        computer.add(new Computer("Lenovo", "16TB", "64GB", "Linux"));


    }



    @Override
    public void getAnswers() {
        System.out.println("\nHere is the correct answer");
        for (Computer comp: computer){
            System.out.println("Question: " + comp.getName());
            System.out.println("Answer - Name of the computer: " + comp.getName() + "HDD: " + comp.getHDD() + ", RAM: " + comp.getRAM() + ", OS: " + comp.getOS());
            System.out.println("------------------------------------------------------------------");

        }

    }


    @Override
    public void getUserInput() {
        for (Computer comp : computer) {
            int attempts = 3;
            boolean correct = false;

            while (attempts > 0 && !correct) {
                System.out.print("What is the best computer software for Software Developers?  ");
                String userName = sc.nextLine();

                System.out.print("Guess the HDD: ");
                String userHDD = sc.nextLine();

                System.out.print("Guess the RAM: ");
                String userRAM = sc.nextLine();

                System.out.print("Guess the Operating System: ");
                String userOS = sc.nextLine();


                boolean nameCorrect = userName.equalsIgnoreCase(comp.getName());
                boolean hddCorrect = userHDD.equalsIgnoreCase(comp.getHDD());
                boolean ramCorrect = userRAM.equalsIgnoreCase(comp.getRAM());
                boolean osCorrect = userOS.equalsIgnoreCase(comp.getOS());

                if (nameCorrect && hddCorrect && ramCorrect && osCorrect) {
                    System.out.println("Congratulations! You got it right!");
                    correct = true;
                } else {
                    attempts--;
                    System.out.println("Incorrect! Attempts left: " + attempts);

                    if (attempts > 0) {
                        System.out.println("Try again!");
                    }
                }
            }

            if (!correct) {
                System.out.println("Sorry, you've used all your attempts. The correct answer was:");
                System.out.println("Name: " + comp.getName() + ", HDD: " + comp.getHDD() + ", RAM: " + comp.getRAM() + ", OS: " + comp.getOS());
            }

        }
    }




}
