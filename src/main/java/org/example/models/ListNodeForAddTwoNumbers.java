package org.example.models;

public class ListNodeForAddTwoNumbers {
    public int val;
    public ListNodeForAddTwoNumbers next;
    public ListNodeForAddTwoNumbers() {}
    public ListNodeForAddTwoNumbers(int val) { this.val = val; }
    public ListNodeForAddTwoNumbers(int val, ListNodeForAddTwoNumbers next) { this.val = val; this.next = next; }
}
