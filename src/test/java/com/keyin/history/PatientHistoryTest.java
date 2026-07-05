package com.keyin.history;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientHistoryTest
{
    @Test
    public void testAddRecordIncreasesSize()
    {
        PatientHistory history = new PatientHistory();

        history.addRecord(new PatientRecord("2025-01-01", "Flu", "Rest"));

        Assertions.assertEquals(1, history.getSize());
    }

    @Test
    public void testShowOldestSetsCurrentRecord()
    {
        PatientHistory history = new PatientHistory();

        history.loadSampleRecords();
        history.showOldest();

        Assertions.assertEquals("Flu", history.getCurrentRecord().getDiagnosis());
    }

    @Test
    public void testShowNewestSetsCurrentRecord()
    {
        PatientHistory history = new PatientHistory();

        history.loadSampleRecords();
        history.showNewest();

        Assertions.assertEquals("Follow-up", history.getCurrentRecord().getDiagnosis());
    }

    @Test
    public void testNextRecordMovesForward()
    {
        PatientHistory history = new PatientHistory();

        history.loadSampleRecords();
        history.showOldest();
        history.nextRecord();

        Assertions.assertEquals("Sprain", history.getCurrentRecord().getDiagnosis());
    }

    @Test
    public void testPreviousRecordMovesBackward()
    {
        PatientHistory history = new PatientHistory();

        history.loadSampleRecords();
        history.showNewest();
        history.previousRecord();

        Assertions.assertEquals("Cold", history.getCurrentRecord().getDiagnosis());
    }
}