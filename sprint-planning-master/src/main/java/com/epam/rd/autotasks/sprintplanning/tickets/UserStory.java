package com.epam.rd.autotasks.sprintplanning.tickets;

public class UserStory extends Ticket {
    private final UserStory[] dependsOn;
    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn = dependsOn.clone();
        //throw new UnsupportedOperationException("Implement this method");
    }

    @Override
    public void complete() {
        //throw new UnsupportedOperationException("Implement this method");
        boolean allCompleted = true;
        for (UserStory us: dependsOn) {
            if (!us.isCompleted()) {
                allCompleted = false;
                break;
            }
        }
        if (allCompleted) {
            this.isCompleted = true;
        }
    }

    public UserStory[] getDependencies() {
        //throw new UnsupportedOperationException("Implement this method");
        return this.dependsOn.clone();
    }

    @Override
    public String toString() {
        //throw new UnsupportedOperationException("Implement this method");
        return "[US " + id + "] " + name;
    }
}
