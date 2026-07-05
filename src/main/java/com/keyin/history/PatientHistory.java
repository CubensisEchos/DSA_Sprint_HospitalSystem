package com.keyin.history;

/**
 * Maintains a doubly linked list of patients medical history
 * Allows navigation forwards and backwards thought patient history list
 */
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

    /**
     * Adds a new patient record to the end of the history
     *
     * @param record the patient's record to add
     */
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

    /**
     * Moves forward to the next record in the history
     * Prints the new current record
     */
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

    /**
     * Moves backwards to the previous record in the history
     * Prints the new current record
     */
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

    /**
     * Sets the current record to the oldest in the history
     * Prints the new current record
     */
    public void showOldest()
    {
        current = head;

        if (current != null)
        {
            System.out.println(current.getRecord());
        }
    }

    /**
     * Sets the current record to the newest in the history
     * Prints the new current record
     */
    public void showNewest()
    {
        current = tail;

        if (current != null)
        {
            System.out.println(current.getRecord());
        }
    }

    /**
     * displays the current record
     */
    public void displayCurrent()
    {
        if (current != null)
        {
            System.out.println(current.getRecord());
        }
    }

    /**
     * Loads sample patient records for tests
     */
    public void loadSampleRecords()
    {
        addRecord(new PatientRecord("2025-01-01", "Flu", "Rest and fluids"));
        addRecord(new PatientRecord("2025-01-05", "Sprain", "Ice and elevation"));
        addRecord(new PatientRecord("2025-01-10", "Fracture", "Cast applied"));
        addRecord(new PatientRecord("2025-01-15", "Headache", "Pain medication"));
        addRecord(new PatientRecord("2025-01-20", "Allergy", "Antihistamines"));
        addRecord(new PatientRecord("2025-01-25", "Infection", "Antibiotics"));
        addRecord(new PatientRecord("2025-02-01", "Checkup", "Routine examination"));
        addRecord(new PatientRecord("2025-02-05", "Back Pain", "Physiotherapy"));
        addRecord(new PatientRecord("2025-02-10", "Cold", "Rest and fluids"));
        addRecord(new PatientRecord("2025-02-15", "Follow-up", "Patient improving"));
    }

    /**
     * Returns the current patient record
     *
     * @return the current record or null if there isn't a current record
     */
    public PatientRecord getCurrentRecord()
    {
        if (current == null)
        {
            return null;
        }

        return current.getRecord();
    }

    public int getSize()
    {
        return size;
    }
}

