package com.mycompany.csc311_3;

import java.util.HashSet;
import java.util.Iterator;
import javafx.fxml.FXML;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Daniel Nemov
 */


public class PrimaryController {

    @FXML
    private TextField Data, Queue, PriortiyQueue, Set;

    @FXML
    private ListView q, pq, s;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private Button nextPriortiyQueue, nextQueue, nextSet, resetPriortiyQueue, resetQueue, resetSet;

    int QueueIndex = 0;
    int PriortiyQueueIndex = 0;
    int SetIndex = 0;

    String comboboxselection = "All"; // defualt 


/**
 *
 *  initialize method 
 */
    public void initialize() {
        ObservableList<String> list = FXCollections.observableArrayList("All", "Priority Queue", "Queue", "SET");

        combobox.setItems(list);

    }
/**
 *
 *  allows for combobox selection 
 */
    @FXML
    public void HandlesCombo(ActionEvent event) {
        comboboxselection = combobox.getValue();
    }
/**
 *
 *  add method
 */
    @FXML
    private void add(ActionEvent event) {
        Queue<String> myQueue = new LinkedList<>();
        Set<String> mySet = new HashSet<>();
        Queue<String> mypriorityQueue = new PriorityQueue<>();

        ObservableList<String> SetList = s.getItems();
        ObservableList<String> QueueList = q.getItems();
        ObservableList<String> PriortiyQueueList = pq.getItems();
        String datatype = Data.getText();

        if (comboboxselection.equals("Queue")) { 
            QueueIndex = 0;
            myQueue.add(datatype);

       
            Iterator<String> iter;
            iter = myQueue.iterator();
            String current = iter.next();

            QueueList.add(current);

            Queue.setText(QueueList.get(QueueIndex).toString());

        } else if (comboboxselection.equals("Priortiy Queue")) { 
            PriortiyQueueIndex = 0;
            mypriorityQueue.add(datatype);

         
            Iterator<String> iter;
            iter = mypriorityQueue.iterator();
            String current = iter.next();

            PriortiyQueueList.add(current);

            PriortiyQueue.setText(PriortiyQueueList.get(0).toString());

        } else if (comboboxselection.equals("SET")) {
            SetIndex = 0;
            mySet.add(datatype);

          
            Iterator<String> iter;
            iter = mySet.iterator();
            String current = iter.next();

            SetList.add(current);

            Set.setText(SetList.get(0).toString());

        } else { //all 
            QueueIndex = 0;
            SetIndex = 0;
            PriortiyQueueIndex = 0;
            myQueue.add(datatype);
            mypriorityQueue.add(datatype);
            mySet.add(datatype);
            Iterator<String> iter;
            iter = mySet.iterator();
            String current = iter.next();
            SetList.add(current);
            iter = mypriorityQueue.iterator();
            current = iter.next();
            PriortiyQueueList.add(current);
            iter = myQueue.iterator();
            current = iter.next();
            QueueList.add(current);

            Queue.setText(QueueList.get(0).toString());
            PriortiyQueue.setText(PriortiyQueueList.get(0).toString());
            Set.setText(SetList.get(0).toString());

        }
    }

    @FXML
    private void addfiverandom(ActionEvent event) {
        Random r = new Random();

        Queue<String> myQueue = new LinkedList<>();
        Set<String> mySet = new HashSet<>();
        Queue<String> mypriorityQueue = new PriorityQueue<>();

        ObservableList<String> SetList = s.getItems();
        ObservableList<String> QueueList = q.getItems();
        ObservableList<String> PriortiyQueueList = pq.getItems();
        String datatype = "";

        if (comboboxselection.equals("Queue")) { 
            QueueIndex = 0;
            for (int i = 0; i < 5; i++) {
                int variable = 97 + (int) (r.nextFloat() * (122 - 97 + 1));
                datatype = ((char) variable) + "";
                myQueue.add(datatype);

            }
            Iterator<String> iter;
            iter = myQueue.iterator();
            for (int i = 0; i < 5; i++) {

                String current = iter.next();

                QueueList.add(current);
            }

            Queue.setText(QueueList.get(QueueIndex).toString());

        } else if (comboboxselection.equals("Priortiy Queue")) {  
            PriortiyQueueIndex = 0;
            for (int i = 0; i < 5; i++) {
                int variable = 97 + (int) (r.nextFloat() * (122 - 97 + 1));
                datatype = ((char) variable) + "";
                mypriorityQueue.add(datatype);

            }
            Iterator<String> iter;
            iter = mypriorityQueue.iterator();
            for (int i = 0; i < 5; i++) {

                String current = iter.next();

                PriortiyQueueList.add(current);
            }

            PriortiyQueue.setText(PriortiyQueueList.get(0).toString());

        } else if (comboboxselection.equals("SET")) {
            SetIndex = 0;

            for (int i = 0; i < 5; i++) {
                int variable = 97 + (int) (r.nextFloat() * (122 - 97 + 1));
                datatype = ((char) variable) + "";
                mySet.add(datatype);
            }
            Iterator<String> iter;
            iter = mySet.iterator();
            for (int i = 0; i < mySet.size(); i++) {

                String current = iter.next();

                SetList.add(current);
            }
            Set.setText(SetList.get(0).toString());

        } else { //all 
            QueueIndex = 0;
            SetIndex = 0;
            PriortiyQueueIndex = 0;
            for (int i = 0; i < 5; i++) {
                int variable = 97 + (int) (r.nextFloat() * (122 - 97 + 1));
                datatype = ((char) variable) + "";
                mySet.add(datatype);
                mypriorityQueue.add(datatype);
                myQueue.add(datatype);
            }
            Iterator<String> iter1;
            iter1 = mypriorityQueue.iterator();
            Iterator<String> iter2;
            iter2 = myQueue.iterator();
            Iterator<String> iter3;
            iter3 = mySet.iterator();
            for (int i = 0; i < mySet.size(); i++) {
                String current3 = iter3.next();
                SetList.add(current3);
            }

            for (int i = 0; i < 5; i++) {
                String current1 = iter1.next();
                String current2 = iter2.next();
                PriortiyQueueList.add(current1);
                QueueList.add(current2);
            }
            Queue.setText(QueueList.get(0).toString());
            PriortiyQueue.setText(PriortiyQueueList.get(0).toString());
            Set.setText(SetList.get(0).toString());

        }
    }

    @FXML
    private void clear(ActionEvent event) {
        if ("SET".equals(combobox.getValue())) {
            Set.clear();
            s.getItems().clear();
        } else if ("Queue".equals(combobox.getValue())) {
            Queue.clear();

            q.getItems().clear();
        } else if ("Priority Queue".equals(combobox.getValue())) {
            PriortiyQueue.clear();
            pq.getItems().clear();
        } else {
            Data.clear(); // copy for later 
            Set.clear();
            Queue.clear();
            PriortiyQueue.clear();
            pq.getItems().clear();
            q.getItems().clear();
            s.getItems().clear();
        }
    }

    @FXML
    private void nextPriortiyQueue(ActionEvent event) { // next button example

        ObservableList<String> PriortiyQueueList = pq.getItems();
        if (PriortiyQueueIndex + 1 < PriortiyQueueList.size()) {
            PriortiyQueueIndex++;
        }
        PriortiyQueue.setText(PriortiyQueueList.get(PriortiyQueueIndex).toString());
    }

    @FXML
    private void nextQueue(ActionEvent event) { // next button example

        ObservableList<String> QueueList = q.getItems();
        if (QueueIndex + 1 < QueueList.size()) {

            QueueIndex++;
        }

        Queue.setText(QueueList.get(QueueIndex).toString());
    }

    @FXML
    private void nextSet(ActionEvent event) { // next button example

        ObservableList<String> SetList = s.getItems();
        if (SetIndex + 1 < SetList.size()) {

            SetIndex++;
        }

        Set.setText(SetList.get(SetIndex).toString());
    }

    @FXML
    private void resetPriortiyQueue(ActionEvent event) {
        PriortiyQueueIndex = 0;
        ObservableList<String> PriortiyQueueList = pq.getItems();

        PriortiyQueue.setText(PriortiyQueueList.get(PriortiyQueueIndex).toString());

    }
    @FXML
    private void resetQueue (ActionEvent event) {
        ObservableList<String> QueueList = q.getItems();
        QueueIndex = 0;

        Queue.setText(QueueList.get(QueueIndex).toString());
    }

    
    @FXML
    private void resetSet(ActionEvent event) {
        SetIndex = 0;

        ObservableList<String> SetList = s.getItems();
        Set.setText(SetList.get(SetIndex).toString());

    }
}
