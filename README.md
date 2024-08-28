Deleting the Last Occurrence in a Singly Linked List
Overview
This project provides a solution for deleting the last occurrence of a given value in a singly linked list. A singly linked list is a data structure where each node points to the next node in the sequence. The task here is to find and remove the node containing a specific value, but only if it is the last occurrence of that value in the list.

Problem Statement
Given a singly linked list and a value, the objective is to:

Traverse the list to find the last occurrence of the specified value.
Remove the node containing this value from the list.
Adjust the pointers of the preceding node to ensure the list remains correctly linked after the deletion.
Solution Approach
The solution involves the following steps:

Traversal: Traverse the list to identify the last occurrence of the specified value. During traversal, keep track of:

The previous node to the last occurrence.
The node containing the last occurrence.
Deletion: Once the last occurrence is found:

If it is the head of the list, update the head pointer.
Otherwise, update the next pointer of the preceding node to bypass the node to be deleted.
Edge Cases: Handle cases where:

The list is empty.
The value is not found in the list.
The node to be deleted is the only node in the list.
