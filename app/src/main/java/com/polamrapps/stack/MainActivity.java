package com.polamrapps.stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(3);
        stack.push(2);

        Log.i(Stack.TAG, "onCreate:peek "+stack.peek());
        Log.i(Stack.TAG, "onCreate: pop "+stack.pop());
        Log.i(Stack.TAG, "onCreate: "+stack.size());

        stack.push(5);

        Queue queue = new Queue(5);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(43);

        queue.dequeue();

        queue.enqueue(90);

        Log.i(Queue.TAG, "onCreate:peek "+queue.peek());
        Log.i(Queue.TAG, "onCreate:size "+queue.size());
    }
}
