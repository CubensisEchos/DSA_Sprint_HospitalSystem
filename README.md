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
This test creates a empty queue, then it calls servePatient(), and checks that the value returned is null. Then it will check that the queue size is zero.

### The patient history tests cover:
i)  testAddRecord_ExpectIncreaseInHistorySize()
This test creates a new history, then adds one record. After that it checks that the size of the history is 1.

ii) testShowOldest_ExpectFirstRecordSetToCurrent()
This test creates a new history, then adds two records. Then it runs showOldest(), and will then check that the first record that was entered appears as the current record.

iii) testShowNewest_ExpectLastRecordSetToCurrent()
This test creates a new history, then adds two records. Then it runs showNewest(), and will then check that the last record that was entered appears as the current record.

iv) testNextRecord_ExpectCurrentRecordSetToNextRecord()
This test creates a new history, then adds two records. After that it runs nextRecord(), and will then ensure that the second record it created is the current record.

v)testPreviousRecord_ExpectCurrentRecordSetToPreviousRecord()
This test creates a new history, then adds two records. After that it runs previousRecord(), and will then ensure that the first record it created is the current record.


## Questions
1. Why was a Queue appropriate for the waiting room?
A queue was appropriate for the waiting rooms since patients would be served in order of arrival, expect in extreme circumstances. It also helps in managing a large number of patients, which a hospital waiting room would regularly have.

2. Explain FIFO principle
FIFO(First In, First Out) means that the first thing added to a queue would be the first one processed. The hospital queue is a good example of this, since they generally work on a first come first serve basis.

3. Explain what could happen if a stack was used instead of a queue in Part 1.
Using a stack instead of a queue could result in at least the first patient never being served. This could happen if new patients arrived quicker than they could be served, as the number of people waiting would only go up, which would result in only the newest patients being served.

4. Suggest ways that you could improve this system (Theory)
Some ways this system could be improved include persistent storage, timestamps on the queue entries, and user authentication for the staff. Another way this system could be improved would be by linking the patient records to queue entries together so that when someone is added to the queue, the user would be able to see their history.
   
5. Why is a Doubly Linked List appropriate for patient history?
A doubly linked list is appropriate for patient history because it is a system that needs to be able to move back and forth through the entries in the list.
   
6. What would happen in the DLL if you forgot to update the next and previous pointers when manipulating the DLL?
If you forgot the pointers when manipulating the doubly linked list it would break the link that allows you to move in the desired direction properly. It might move to much or not at all, depending on how you needed to change them.

7. Explain why a Doubly Linked List Works in this case compared to an Array or ArrayList
A doubly linked list works better than an Array or ArrayList in this case because it is easier to insert things, as well as easier to move through the list in either direction.
