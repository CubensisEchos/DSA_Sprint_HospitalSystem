package com.keyin.queue;

/**
 * Implements a patient queue using a linked list
 * Supports standard queue operations and insertion at a chosen position
 */
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

    /**
     * Adds a patient to the end of the queue
     *
     * @param patient the patient to be added
     */
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

    /**
     * Removes and returns the first patient in the queue
     * Patient that was second in queue because first
     *
     * @return the served patient, or null if the queue is empty
     */
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

    /**
     * Inserts a patient at a chosen position in the queue
     * Used for patients who need urgent care
     *
     * @param position index to insert the patient at
     * @param patient the patient to be inserted
     */
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

    /**
     * Prints all patients currently in the queue
     */
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

    /**
     * Loads sample data into the queue for testing
     */
    public void loadSamplePatients()
    {
        addPatient(new Patient(1, "Jimmy", "Abdominal Pain"));
        addPatient(new Patient(2, "Sarah", "Headache"));
        addPatient(new Patient(3, "Alex", "Broken Arm"));
        addPatient(new Patient(4, "Mia", "Fever"));
        addPatient(new Patient(5, "Noah", "Chest Pain"));
    }
}

