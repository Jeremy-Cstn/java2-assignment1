package edu.hm.hafner.java2.assignment1;

/**
 * An exam contains several assignments.
 */
public class Exam {
    private Assignment[] assignments = new Assignment[]{};

    public int getSize() {
        return assignments.length;
    }

    public void addAssignment(final Assignment assignment) {
        int currentLenght = assignments.length;
        Assignment[] newArray = new Assignment[currentLenght + 1];
        for (int i = 0; i < currentLenght; i++) {
            newArray[i] = assignments[i];
        }
        newArray[currentLenght] = assignment;
        assignments = newArray;
    }

    public Assignment getAssignment(final int index) {
        return assignments[index];
    }

    public int getScore() {
        if (assignments.length < 1) {
            return 100;
        }
        int percentageSum = 0;
        for (Assignment assignment: assignments) {
            percentageSum += assignment.getPercentage();
        }
        return percentageSum / assignments.length;
    }

    public boolean isSufficient() {
        return getScore() >= 50;
    }

    public int getGrade() {
        if (getScore() >= 95) {
            return 1;
        } else if (getScore() >= 80) {
            return 2;
        } else if (getScore() >= 65) {
            return 3;
        } else if (getScore() >= 50) {
            return 4;
        } else if (getScore() > 0) {
            return 5;
        } else {
            return 6;
        }
    }

}
