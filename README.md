# DSA Sprint 

This is my midterm sprint for Data Structures & Algorithms. It contains two systems, a patient queue for a hospital waiting room, and a patient history system that can be looked though.

## Tests information
The tests in this project cover the logic within the PatientQueue and PatientHistory files.

### The patient queue tests cover:
i) testAddPatient_ExpectIncreaseInQueueSize()
This test creates a new queue, then it adds two patients, and then checks that the queue size is two as verifcation.

ii) testServePatient_ExpectFirstPatientRemovedFromQueue()
This test creates a new queue, then it adds two patients, john then sarah. After that it servers the first patient, and checks to see that it is john at the same time. Then it will finally check that the queue size has gone down to 1.

iii) testEmergencyInsert_ExpectPatientPlacedAtFrontOfQueue()
This test creates a new queue, then it adds two patients, inserts an emerency patient to the postion of choice(The front in this case). The it will serve the next patient and checks that it is the patient that was added to the front of the queue.

iv) testServeEmptyQueue_ReturnsNull()
This test creates a empty queue, then it calls servePatient() (serves the next patient in the queue), and checks that the value returned is null. Then it will check that the queue size is zero.

### The patient history tests cover:
i)  testAddRecord_ExpectIncreaseInHistorySize()

ii) testAddRecord_ExpectIncreaseInHistorySize()

iii) testShowNewest_ExpectFirstRecordSetToCurrent()

iv) testNextRecord_ExpectCurrentRecordSetToNextRecord()


## Questions
1. Why was a Queue appropriate for the waiting room?

2. Explain FIFO principle

3. Explain what could happen if a stack was used instead of a queue in Part 1.

4. Suggest ways that you could improve this system (Theory)

5. Why is a Doubly Linked List appropriate for patient history?

6. What would happen in the DLL if you forgot to update the next and previous pointers when manipulating the DLL?

7. Explain why a Doubly Linked List Works in this case compared to an Array or Array List
