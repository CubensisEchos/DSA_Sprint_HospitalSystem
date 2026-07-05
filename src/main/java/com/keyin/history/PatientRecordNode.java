package com.keyin.history;

/**
 * Represents a nod ein the patient history doubly linked list
 * Stores PatientRecord and links to the next previous nodes
 */
public class PatientRecordNode
{
    private PatientRecord record;
    private PatientRecordNode next;
    private PatientRecordNode previous;

    public PatientRecordNode(PatientRecord record)
    {
        this.record = record;
    }

    public PatientRecord getRecord()
    {
        return record;
    }

    public PatientRecordNode getNext()
    {
        return next;
    }

    public PatientRecordNode getPrevious()
    {
        return previous;
    }

    public void setNext(PatientRecordNode next)
    {
        this.next = next;
    }

    public void setPrevious(PatientRecordNode previous)
    {
        this.previous = previous;
    }
}
