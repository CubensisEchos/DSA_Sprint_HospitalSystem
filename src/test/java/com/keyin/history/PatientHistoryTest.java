package com.keyin.history;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientHistoryTest
{
    @Test
    public void testAddRecord_ExpectIncreaseInHistorySize()
    {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord("2025-01-01", "Flu", "Rest"));

        Assertions.assertEquals(1, history.getSize());
    }

    @Test
    public void testShowOldest_ExpectFirstRecordSetToCurrent()
    {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord("2025-01-01", "Flu", "Rest"));
        history.addRecord(new PatientRecord("2025-01-05", "Sprain", "Ice"));

        history.showOldest();

        Assertions.assertEquals("Flu", history.getCurrentRecord().getDiagnosis());
    }

    @Test
    public void testShowNewest_ExpectFirstRecordSetToCurrent()
    {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord("2025-01-01", "Flu", "Rest"));
        history.addRecord(new PatientRecord("2025-01-05", "Sprain", "Ice"));

        history.showNewest();

        Assertions.assertEquals("Sprain", history.getCurrentRecord().getDiagnosis());
    }

    @Test
    public void testNextRecord_ExpectCurrentRecordSetToNextRecord()
    {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord("2025-01-01", "Flu", "Rest"));
        history.addRecord(new PatientRecord("2025-01-05", "Sprain", "Ice"));

        history.showOldest();
        history.nextRecord();

        Assertions.assertEquals("Sprain", history.getCurrentRecord().getDiagnosis());
    }

    @Test
    public void testPreviousRecord_ExpectCurrentRecordSetToPreviousRecord()
    {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord("2025-01-01", "Flu", "Rest"));
        history.addRecord(new PatientRecord("2025-01-05", "Sprain", "Ice"));

        history.showNewest();
        history.previousRecord();

        Assertions.assertEquals("Flu", history.getCurrentRecord().getDiagnosis());
    }
}