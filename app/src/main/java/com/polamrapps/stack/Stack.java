package com.polamrapps.stack;

import android.util.Log;

/**
 * Class for Stack.
 */
public class Stack {

    public static final String TAG = Stack.class.getSimpleName();

    private int[] mArray;       // Array to store queue elements.
    private int mTop;           // top element in the queue.
    private int mCapacity;      // maximum capacity of the queue.

    /**
     * Constructor to initialize stack
     *
     * @param size size fo the stack.
     */
    public Stack(int size) {
        mArray = new int[size];
        mCapacity = size;
        mTop = -1;
    }

    /**
     * Function to add an element it the stack.
     *
     * @param item element to add into stack.
     */
    public void push(int item) {
        // check for stack overflow.
        if (isFull()) {
            Log.i(TAG, "push: Overflow");
        } else {
            Log.i(TAG, "push: push->" + item);
            mArray[++mTop] = item;
        }
    }

    /**
     * Function to pop top element from the stack.
     *
     * @return return the top element in the stack.
     */
    public int pop() {
        // check for stack underflow.
        if (isEmpty()) {
            Log.i(TAG, "pop: Underflow");
            return -1;
        } else {
            Log.i(TAG, "pop: Removing->" + peek());
            return mArray[mTop--];
        }
    }

    /**
     * Function to return top element in a stack.
     *
     * @return top of the element in a stack.
     */
    public int peek() {
        // check for nonempty stack.
        if (!isEmpty()) {
            return mArray[mTop];
        } else {
            return -1;
        }
    }

    /**
     * Function to check if the stack is empty or not.
     *
     * @return Boolean True if stack top is -1 else False.
     */
    private boolean isEmpty() {
        return mTop == -1;
    }

    /**
     * Function to check size of the stack.
     *
     * @return number of elements available in the stack.
     */
    public int size() {
        return mTop + 1;
    }

    /**
     * Function to check stack is full or not.
     *
     * @return return True f size() and capacity equal else False.
     */
    private boolean isFull() {
        return mTop == mCapacity - 1;
    }
}
