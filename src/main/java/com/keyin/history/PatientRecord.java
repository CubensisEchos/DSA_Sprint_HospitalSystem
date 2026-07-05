package com.keyin.history;

public class PatientRecord
{
    private String visitDate;
    private String diagnosis;
    private String treatmentNotes;

    public PatientRecord()
    {

    }

    public PatientRecord(String visitDate, String diagnosis, String treatmentNotes)
    {
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.treatmentNotes = treatmentNotes;
    }

    public String getVisitDate()
    {
        return visitDate;
    }

    public void setVisitDate(String visitDate)
    {
        this.visitDate = visitDate;
    }

    public String getDiagnosis()
    {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis)
    {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentNotes()
    {
        return treatmentNotes;
    }

    public void setTreatmentNotes(String treatmentNotes)
    {
        this.treatmentNotes = treatmentNotes;
    }

    @Override
    public String toString()
    {
        return "Date: " + visitDate + ", Diagnosis: " + diagnosis + ", Treatment: " + treatmentNotes;
    }
}
