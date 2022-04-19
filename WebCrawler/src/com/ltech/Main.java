package com.ltech;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);
    }

    public static void crawler(String url){
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        ArrayList<String> listOfTraversedUrls = new ArrayList<>();

        listOfPendingUrls.add(url);
        while(!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 100){
            String stringUrl = listOfPendingUrls.remove(0);
            if(!listOfTraversedUrls.contains(stringUrl)){
                listOfTraversedUrls.add(stringUrl);
                System.out.println("Crawl " + stringUrl);

                for(String s : getSubUrls(stringUrl)){
                    if(!listOfTraversedUrls.contains(s)) listOfPendingUrls.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubUrls(String stringUrl){
        ArrayList<String> list = new ArrayList<>();
        try{
            URL url = new URL(stringUrl);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                System.out.println(line);
                current = line.indexOf("https:", current);
                while(current > 0){
                    int endIndex = line.indexOf("\"", current);
                    if(endIndex > 0){
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("https:", endIndex);
                    }else current = -1;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return list;
    }
}
