package models;

public class FacultySE {

    private final int NUMBER_SUBJECTS = 10;

    private String maxSubjectAverage;
    private String minSubjectAverage;
    private double bestGrade;
    private double worstGrade;
    private Subject[] subjects;
    private int positionSubject;

    public FacultySE() {
        subjects = new Subject[NUMBER_SUBJECTS];
    }

    public FacultySE(String maxSubjectAverage, String minSubjectAverage, double bestGrade, double worstGrade) {
        this.maxSubjectAverage = maxSubjectAverage;
        this.minSubjectAverage = minSubjectAverage;
        this.bestGrade = bestGrade;
        this.worstGrade = worstGrade;
    }

    public void addSubject(Subject subject) {
        subject.setSubjectId(positionSubject);
        subject.setStudentMaxGrade("");
        subject.setStudentMinGrade("");
        subjects[positionSubject++] = subject;
    }

    public void calculateStatistics(){
        calculateMinSubjectAverage();
        calculateMaxSubjectAverage();
    }

    public String getMaxSubjectAverage() {
        return maxSubjectAverage;
    }

    public String getMinSubjectAverage() {
        return minSubjectAverage;
    }

    public void setMaxSubjectAverage(String maxSubjectAverage) {
        this.maxSubjectAverage = maxSubjectAverage;
    }

    public void setMinSubjectAverage(String minSubjectAverage) {
        this.minSubjectAverage = minSubjectAverage;
    }

    public double getBestGrade() {
        return bestGrade;
    }

    public void setBestGrade(double bestGrade) {
        this.bestGrade = bestGrade;
    }

    public double getWorstGrade() {
        return worstGrade;
    }

    public void setWorstGrade(double worstGrade) {
        this.worstGrade = worstGrade;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public void printStudents() {
        System.out.print("[ ");
        for (Subject subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.print("]\n");
    }

    public void calculateMaxSubjectAverage() {
        try {
            double[] maxAverage = new double[2];
            maxAverage[0] = subjects[0].getAverage();
            maxAverage[1] = 0;

            for (int i = 0; i < positionSubject; i++) {
                if (maxAverage[0] < subjects[i].getAverage()) {
                    maxAverage[0] = subjects[i].getAverage();
                    maxAverage[1] = i;
                }
            }
            this.bestGrade = maxAverage[0];
            maxSubjectAverage = getStudentById((int) maxAverage[1]).getNameSubject();
        } catch (NullPointerException ignored) {
        }
    }

    public void calculateMinSubjectAverage() {
        try {
            double[] minAverage = new double[2];
            minAverage[0] = subjects[0].getAverage();
            minAverage[1] = 0;

            for (int i = 0; i < positionSubject; i++) {
                if (minAverage[0] > subjects[i].getAverage()) {
                    minAverage[0] = subjects[i].getAverage();
                    minAverage[1] = i;
                }
            }
            this.worstGrade = minAverage[0];
            minSubjectAverage = getStudentById((int) minAverage[1]).getNameSubject();
        } catch (NullPointerException ignored) {
        }
    }

    public Subject getStudentById(int id) {
        for (Subject subject : subjects) {
            if (subject.getSubjectId() == id) {
                return subject;
            }
        }
        return null;
    }

    public void printSubjects() {
        try {
            System.out.println(" ");
            for (Subject subject : subjects) {
                System.out.print(" ["+subject.getSubjectId()+"] "+subject.getNameSubject() + "\n");
            }
        } catch (NullPointerException ignored) {
        }
    }

    @Override
    public String toString() {
        return  "{\n  Asignatura con mejor promedio: " + maxSubjectAverage +
                "\n  Asignatura con peor promedio: " + minSubjectAverage +
                "\n  Mejor promedio: " + bestGrade +
                "\n  Peor promedio: " + worstGrade +
                "\n}";
    }
}
