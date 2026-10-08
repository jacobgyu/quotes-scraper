package com.scraper;

import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class App{
    public static void main(String[] arg){
        try {


            String url = "https://quotes.toscrape.com/" ;
            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0").get();
            Elements quotes = doc.select("div.quote");
            System.out.println("Total phrases: " + quotes.size());
            FileWriter csv = new FileWriter("quotes.csv");
            csv.append("Phrase ----> Author ----> Tags\n");

            int counter = 0;
            for(Element quote : quotes){
                if(counter >= 5) break;
                String phrase = quote.select("span.text").first().text();
                String author = quote.select("small.author").first().text();
                String tags = quote.select("div.tags").text();

                System.out.println("Saved: " + (counter+1));
                System.out.println("Phrase: " + phrase);
                System.out.println("Author: " + author);
                System.out.println(tags);
                System.out.println("-----");

                counter++;
                csv.append(counter + ". " + phrase + " --->  " + author + " ---> " + tags + "\n");
            }
            System.out.println("The total number of prhases has been limited to: " + counter);
            csv.flush();
            csv.close();
            System.out.println("CSV Saved");


        } catch (Exception e) {
            System.err.println("Error: "+ e.getMessage());
        }
    }
}