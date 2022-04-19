package com.ltech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String enteredValue = ((input.nextLine()).trim()).toLowerCase();
        if(enteredValue.length() > 2){
            System.out.println("Invalid Input");
            System.exit(1);
        }

        char firstChar = enteredValue.charAt(0);
        char secondChar = enteredValue.charAt(1);
        String major = "";
        if(firstChar == 'm'){
            major = "Mathematics";
        }else if(firstChar == 'c'){
            major = "Computer Science";
        }else if(firstChar == 'i'){
            major = "Information Technology";
        }else{
            major = "Invalid";
        }

        String status = "";
        if(secondChar == '1'){
            status = " Freshman";
        }else if(secondChar == '2'){
            status = " Sophomore";
        }else if(secondChar == '3'){
            status = " Junior";
        }else if(secondChar == '4'){
            status = " Senior";
        }else{
            status = "Invalid";
        }
        String finalMessage = major + status;
        if(finalMessage.contains("Invalid")){
            finalMessage = "Invalid Input";
        }
        System.out.println(finalMessage);
    }
}
