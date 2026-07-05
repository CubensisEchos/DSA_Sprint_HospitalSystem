package com.keyin.queue;

public class PatientQueue
{
    private PatientNode head;
    private PatientNode tail;
    private int size;

    public PatientQueue()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void addPatient(Patient patient)
    {
        PatientNode newNode = new PatientNode(patient);

        if (isEmpty())
        {
            head = tail = newNode;
        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
        }

        size++;
    }

    public Patient servePatient()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty. No patient to serve.");
            return null;
        }

        Patient servedPatient = head.getPatient();
        head = head.getNext();

        if (head == null)
        {
            tail = null;
        }

        size--;

        return servedPatient;
    }

    public void insertEmergencyPatient(int position, Patient patient)
    {
        PatientNode newNode = new PatientNode(patient);

        if (position <= 0 || isEmpty())
        {
            newNode.setNext(head);
            head = newNode;

            if (tail == null)
            {
                tail = newNode;
            }

            size++;
            return;
        }

        if (position >= size)
        {
            tail.setNext(newNode);
            tail = newNode;
            size++;
            return;
        }

        PatientNode current = head;

        for (int i = 0; i < position - 1; i++)
        {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);

        size++;
    }

    public void printQueue()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty.");
            return;
        }

        PatientNode current = head;

        System.out.println("Current Patient Queue:");

        while (current != null)
        {
            System.out.println(current.getPatient());
            current = current.getNext();
        }
    }

    public int getSize()
    {
        return size;
    }
}

