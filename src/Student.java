import java.util.Arrays;
import java.util.List;

public class Student {
    private String fName;
    private String lName;
    private Number studentNum;
    private String activeList;

    /**
     * This is the constructor, it will create a new Student
     * object in memory. It will validate the fName, lName, studentNum, and activeList
     * @param fName Single string
     * @param lName Single String
     * @param studentNum 7 digit int
     * @param activeList strings
     */
    public Student(String fName, String lName, Number studentNum, String activeList) {
        setFName(fName);
        setLName(lName);
        setStudentNum(studentNum);
        setActiveList(activeList);
    }

    public String getFName() {
        return fName;
    }

    /**
     * Validates the argument and sets the instance variable
     * @param fName "Michael"
     */
    public void setFName(String fName) {
        List<String> validFName = Arrays.asList("Michael");

        //test if the argument is valid
        if (validFName.contains(fName))
            this.fName = fName;
        else
            throw new IllegalArgumentException(fName + "was not on the approved list");
    }

    public String getLName() {
        return lName;
    }

    /**
     * Validates the argument and sets the instance variable
     * @param lName "Wilks"
     */
    public void setLName(String lName) {
        List<String> validLName = Arrays.asList("Wilks");

        //test if the argument is valid
        if (validLName.contains(lName))
            this.lName = lName;
        else
            throw new IllegalArgumentException(lName + "was not on the approved list");
    }

    public Number getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Number studentNum) {
        if (String.valueOf(studentNum).length() == 7)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student Number must be Seven digits");
    }

    public String getActiveList() {
        return activeList;
    }

    public void setActiveList(String activeList) {
        this.activeList = activeList;
    }
}
