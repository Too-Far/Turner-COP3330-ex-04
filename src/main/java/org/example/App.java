/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class App 
{
    public static void handleOutput(Map<String, String> map)
    {
        System.out.println("Do you " + map.get("verb")
                + " your " + map.get("adjective")+ " "
                + map.get("noun") + " "
                + map.get("adverb") + "? That's Hilarious!");
    }
    public static void main( String[] args )
            throws IOException
    {
        // Create Map to hold values. To be used to later hold variables.
        Map<String, String> map;
        map = new HashMap<>();
        map.put("noun", "Enter a noun: ");
        map.put("verb", "Enter a verb: ");
        map.put("adjective", "Enter an adjective: ");
        map.put("adverb", "Enter an adverb: ");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            if (Objects.equals(entry.getKey(), "adjective") || Objects.equals(entry.getKey(), "adverb")) {
                System.out.println("Please enter an " + entry.getKey());
            } else {
                System.out.println("Please enter a " + entry.getKey());
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String value = reader.readLine();
            map.replace(entry.getKey(), value );
        }
        handleOutput(map);
    }
}
