/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P14_03;

/**
 *
 * @author billy
 */
public class StopWatch {
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;
    
    public StopWatch(){
        reset();
    }
    
    public void start(){
        if(isRunning){
            return;
        }
        isRunning = true;
        startTime = System.currentTimeMillis();
    }
    
    public void stop(){
        if(!isRunning){
            return;
        }
        isRunning = false;
        long endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }
    
    public long getElapsedTime(){
        if(isRunning){
            long endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        } else {
            return elapsedTime;
        }
    }
    
    public void reset(){
        elapsedTime = 0;
        isRunning = false;
    }
    
    public String toString(){
        double seconds = getElapsedTime() * 0.001;
        return "Time taken to sort array: " + seconds + " seconds";
    }
}
