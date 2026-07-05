package com.keyin.queue;

/**
 * This entity represents a patient in the hospital queue system
 * Stores patient information such as ID, name, and reason for visit
 */
public class Patient
{
    private long patientId;
    private String name;
    private String reasonForVisit;

    /**
     * Creates a new patient with the following parameters
     *
     * @param patientId id of the patient
     * @param name the name of the patient
     * @param reasonForVisit reason the patient is at the hospital
     */
    public Patient(long patientId, String name, String reasonForVisit)
    {
        this.patientId = patientId;
        this.name = name;
        this.reasonForVisit = reasonForVisit;
    }

    public long getPatientId()
    {
        return patientId;
    }

    public void setPatientId(long patientId)
    {
        this.patientId = patientId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getReasonForVisit()
    {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit)
    {
        this.reasonForVisit = reasonForVisit;
    }

    @Override
    public String toString()
    {
        return "Patient ID: " + patientId + ", Name: " + name + ", Reason for Visit: " + reasonForVisit;
    }
}
