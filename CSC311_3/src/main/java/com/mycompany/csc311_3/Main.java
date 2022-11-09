package com.mycompany.csc311_3;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author soblab
 */
public class Main {

    public static void remove(Collection<String> coll) throws FileNotFoundException, IOException {

        Iterator<String> iter;
        iter = coll.iterator();
         FileReader fr = new FileReader("text.txt");
        Scanner infile = new Scanner(fr);

        String data = infile.nextLine();
        while (iter.hasNext()) {
       
         data = infile.nextLine();

            coll.remove(data);
         
        }
         fr.close();
    }

    public static void printAll(Collection<String> coll) {

        Iterator<String> iter;
        iter = coll.iterator();
        while (iter.hasNext()) {
            String current = iter.next();
            System.out.println(current);

        }
    }
    
        public static void printset(Collection<String> coll) {

     for (String i : coll) {
System.out.println(i);
}

        }
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Queue<String> myQueue = new LinkedList<>();
        FileReader fr = new FileReader("text.txt");
        Scanner infile = new Scanner(fr);

        String data = infile.nextLine();
        while (infile.hasNext()) {

            data = infile.nextLine();

            myQueue.add(data);
        }
        System.out.println("\n now with queue \n ");
        printAll(myQueue);
        remove(myQueue);
         printAll(myQueue);
        fr.close();

        Queue<String> mypriorityQueue = new PriorityQueue<>();

        FileReader fr2 = new FileReader("text.txt");
        Scanner infile2 = new Scanner(fr2);

        String data2 = infile2.nextLine();
        while (infile2.hasNext()) {

            data2 = infile2.nextLine();

            mypriorityQueue.add(data2);
        }
        System.out.println("\n now with priority queue \n ");
        printAll(mypriorityQueue);
        fr.close();

        // issue with set 
        Set<String> mySet = new HashSet<>();
        FileReader fr3 = new FileReader("text.txt");
        Scanner infile3 = new Scanner(fr3);

        String data3 = infile3.nextLine();
        while (infile2.hasNext()) {

            data3 = infile3.nextLine();

            mySet.add(data3);
        }
        System.out.println("\n now with Hash Set \n ");
       // printset(mySet);
            for (String i : mySet) {
System.out.println(mySet);
} 
       
       fr.close();
        
        
        
        
    }

}
