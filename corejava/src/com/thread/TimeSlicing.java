Time slicing scheduling
Time slicing is the process in which the Java thread scheduler assigns a fixed time 
slot to all threads for execution. The threads execute for a specific time and then 
re-enters the active pool again. This process continues until the processor executes 
all the threads. The specific time slot allocated is called a time slice. The scheduler 
assigns the CPU for each thread based on the time slice. Once the thread execution is 
complete, it terminates and proceeds with other thread execution.

package com.thread;

public class TimeSlicing {

}
