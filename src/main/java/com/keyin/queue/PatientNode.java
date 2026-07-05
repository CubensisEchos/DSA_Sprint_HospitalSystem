package com.keyin.queue;

/**
 * Represents a node in the patient queue list
 * Each node stores a patient and a reference to the connecting nodes
 */
public class PatientNode
{
    private Patient patient;
    private PatientNode next;

    public PatientNode(Patient patient)
    {
        this.patient = patient;
        this.next = null;
    }

    public Patient getPatient()
    {
        return patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    public PatientNode getNext()
    {
        return next;
    }

    public void setNext(PatientNode next)
    {
        this.next = next;
    }
}