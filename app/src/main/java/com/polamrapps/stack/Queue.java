package com.polamrapps.stack;

import android.util.Log;

/**
 * Class for Queue.
 */
public class Queue {

    public static final String TAG = Queue.class.getSimpleName();

    private int[] mArray;       // Array to store queue elements.
    private int mFront;         // front points to front elements in the queue.
    private int mRear;          // rear points to last elements in the queue.
    private int mCapacity;      // maximum capacity of the queue.
    private int mCount;         // current size of the queue.

    /**
     * Constructor to initialize queue.
     *
     * @param size size of the queue.
     */
    public Queue(int size) {
        mArray = new int[size];
        mCapacity = size;
        mFront = 0;
        mRear = -1;
        mCount = 0;
    }

    /**
     * Function to add an item to the queue.
     *
     * @param item
     */
    public void enqueue(int item) {
        // check for queue overflow
        if (isFull()) {
            Log.i(TAG, "enqueue: OverFlow");
        } else {
            Log.i(TAG, "enqueue: " + item);
            mRear = (mRear + 1) % mCapacity;
            mArray[mRear] = item;
            mCount++;
        }
    }

    /**
     * Function to remove front element from the queue.
     */
    public void dequeue() {
        // check for queue underflow
        if (isEmpty()) {
            Log.i(TAG, "dequeue: UnderFlow");
        } else {
            Log.i(TAG, "dequeue: " + peek());
            mFront = (mFront + 1) % mCapacity;
            mCount--;
        }
    }

    /**
     * Function to return front element in the queue.
     *
     * @return front element in the queue.
     */
    public int peek() {
        if (isEmpty()) {
            Log.i(TAG, "peek: UnderFlow");
        }
        return mArray[mFront];
    }

    // Function to check if the queue is full or not.
    private boolean isFull() {
        return (size() == mCapacity);
    }

    // Function to check if the queue is empty or not.
    private boolean isEmpty() {
        return (size() == 0);
    }

    // Function to return size of the queue.
    public int size() {
        return mCount;
    }

}
