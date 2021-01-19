package org.example.models;

public class RandomNode {
    public int val;
    public RandomNode next;
    public RandomNode random;

    public RandomNode(int val, RandomNode next, RandomNode random) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
