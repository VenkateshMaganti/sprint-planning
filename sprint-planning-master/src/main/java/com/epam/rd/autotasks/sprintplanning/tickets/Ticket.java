package com.epam.rd.autotasks.sprintplanning.tickets;

public class Ticket {
    protected int id;
    protected String name;
    protected int estimate;
    protected boolean isCompleted;


    public Ticket(int id, String name, int estimate) {
        //throw new UnsupportedOperationException("Implement this method");
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.isCompleted = false;
    }

    public int getId() {
        //throw new UnsupportedOperationException("Implement this method");
        return this.id;
    }

    public String getName() {
        //throw new UnsupportedOperationException("Implement this method");
        return this.name;
    }

    public boolean isCompleted() {
        //throw new UnsupportedOperationException("Implement this method");
        return this.isCompleted;
    }

    public void complete() {
        //throw new UnsupportedOperationException("Implement this method");
        this.isCompleted = true;
    }

    public int getEstimate() {

        //throw new UnsupportedOperationException("Implement this method");
        return this.estimate;
    }
}
