package model;

import java.util.Objects;

public class NumberOfInstancesAndPurpose {
    //so that I have no options to implement the job, as the task and video requires (create a specific user login model) I decided to replace these fields with
    //Number of instances and What are these instances for
    private String numberOfInstance;
    private String whatAreTheseInstancesFor;

    public NumberOfInstancesAndPurpose(String numberOfInstance, String whatAreTheseInstancesFor) {
        this.numberOfInstance = numberOfInstance;
        this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
    }

    public String getNumberOfInstance() {
        return numberOfInstance;
    }

    public void setNumberOfInstance(String numberOfInstance) {
        this.numberOfInstance = numberOfInstance;
    }

    public String getWhatAreTheseInstancesFor() {
        return whatAreTheseInstancesFor;
    }

    public void setWhatAreTheseInstancesFor(String whatAreTheseInstancesFor) {
        this.whatAreTheseInstancesFor = whatAreTheseInstancesFor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfInstancesAndPurpose that = (NumberOfInstancesAndPurpose) o;
        return Objects.equals(numberOfInstance, that.numberOfInstance) && Objects.equals(whatAreTheseInstancesFor, that.whatAreTheseInstancesFor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfInstance(), getWhatAreTheseInstancesFor());
    }
}
