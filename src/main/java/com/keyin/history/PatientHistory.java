package com.keyin.history;

public class PatientHistory
{
    private PatientRecordNode head;
    private PatientRecordNode tail;
    private PatientRecordNode current;
    private int size;

    public PatientHistory()
    {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    public void addRecord(PatientRecord record)
    {
        PatientRecordNode newNode = new PatientRecordNode(record);

        if (head == null)
        {
            head = tail = current = newNode;
        }
        else
        {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }

        size++;
    }

    public void nextRecord()
    {
        if (current == null)
        {
            System.out.println("No records available.");
            return;
        }

        if (current.getNext() == null)
        {
            System.out.println("Already at newest record.");
            return;
        }

        current = current.getNext();
        System.out.println(current.getRecord());
    }

    public void previousRecord()
    {
        if (current == null)
        {
            System.out.println("No records available.");
            return;
        }

        if (current.getPrevious() == null)
        {
            System.out.println("Already at oldest record.");
            return;
        }

        current = current.getPrevious();
        System.out.println(current.getRecord());
    }

    public void showOldest()
    {
        current = head;

        if (current != null)
        {
            System.out.println(current.getRecord());
        }
    }

    public void showNewest()
    {
        current = tail;

        if (current != null)
        {
            System.out.println(current.getRecord());
        }
    }

    public void displayCurrent()
    {
        if (current != null)
        {
            System.out.println(current.getRecord());
        }
    }

    public void printAllRecords()
    {
        PatientRecordNode temp = head;

        while (temp != null)
        {
            System.out.println(temp.getRecord());
            temp = temp.getNext();
        }
    }
}

