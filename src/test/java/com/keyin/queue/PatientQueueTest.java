package com.keyin.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientQueueTest
{
    @Test
    public void testAddPatient_ExpectIncreaseInQueueSize()
    {
        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient(1, "John", "Flu"));
        queue.addPatient(new Patient(2, "Sarah", "Cold"));

        Assertions.assertEquals(2, queue.getSize());
    }

    @Test
    public void testServePatient_ExpectFirstPatientRemovedFromQueue()
    {
        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient(1, "John", "Flu"));
        queue.addPatient(new Patient(2, "Sarah", "Cold"));

        Patient served = queue.servePatient();

        Assertions.assertEquals("John", served.getName());
        Assertions.assertEquals(1, queue.getSize());
    }

    @Test
    public void testEmergencyInsert_ExpectPatientPlacedAtFrontOfQueue()
    {
        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient(1, "John", "Flu"));
        queue.addPatient(new Patient(2, "Sarah", "Cold"));

        queue.insertEmergencyPatient(0, new Patient(3, "Thomas", "Heart Attack"));
        Patient servedPatient = queue.servePatient();

        Assertions.assertEquals(3, servedPatient.getPatientId());
        Assertions.assertEquals("Thomas", servedPatient.getName());
        Assertions.assertEquals("Heart Attack", servedPatient.getReasonForVisit());
    }

    @Test
    public void testServeEmptyQueue_ReturnsNull()
    {
        PatientQueue queue = new PatientQueue();

        Patient result = queue.servePatient();

        Assertions.assertNull(result);
        Assertions.assertEquals(0, queue.getSize());
    }
}
