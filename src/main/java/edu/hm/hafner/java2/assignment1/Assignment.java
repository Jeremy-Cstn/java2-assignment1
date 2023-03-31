package edu.hm.hafner.java2.assignment1;

/**
 * Representation of an assignment.
 */
public class Assignment {

    private final int number;
    private final int numberTestCases;
    private boolean[] testCases;

    public Assignment(final int number, final int numberTestCases) {
        this.number = number;
        this.numberTestCases = numberTestCases;
        this.testCases = new boolean[numberTestCases];
    }

    public int getNumber() {
        return number;
    }

    public int getTests() {
        return numberTestCases;
    }

    public int getGreen() {
        int count = 0;
        for (boolean test : testCases) {
            if (test) {
                count++;
            }
        }
        return count;
    }

    public int getRed() {
        int count = 0;
        for (boolean test : testCases) {
            if (!test) {
                count++;
            }
        }
        return count;
    }

    public int getPercentage() {
        if (getRed() == 0) {
            return 100;
        }
        float percentage = (float) getGreen() / getTests() * 100;
        return (int) percentage;
    }

    public void solve(final int index) {
        if (index >= 0 && index < testCases.length) {
            testCases[index] = true;
        }
    }

    public boolean isSufficient() {
        return getPercentage() >= 50;
    }
}
