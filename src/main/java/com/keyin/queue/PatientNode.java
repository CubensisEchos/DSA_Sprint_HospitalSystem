package com.keyin.queue;

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