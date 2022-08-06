package com.epam.rd.autotasks.sprintplanning.tickets;

public class Bug extends Ticket {
    private final UserStory userStory;
    public static Bug createBug(int id, String name, int estimate, UserStory userStory) {
       // throw new UnsupportedOperationException("Implement this method");
        if (userStory == null || !userStory.isCompleted()) return null;
        return new Bug(id, name, estimate, userStory);
    }

    private Bug(int id, String name, int estimate, UserStory userStory) {
        super(id, name, estimate);
        //throw new UnsupportedOperationException("Implement this method");
        this.userStory = userStory;
    }

    @Override
    public String toString() {

        //throw new UnsupportedOperationException("Implement this method");
        return "[Bug " + id + "] " + this.userStory.getName()+ ": " +  name;
    }
}
