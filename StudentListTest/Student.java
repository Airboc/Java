import java.text.DecimalFormat;
public class Student {
    private String studentNumber;//学号
    private String studentName;//姓名
    private int markForMath = -1;//数学成绩
    private int markForEnglish = -1;//英语成绩
    private int markForScience = -1;//科学成绩
    public Student(String number, String name) {
        this.studentNumber = number;
        this.studentName = name;
    }
    public Student(){
    }
    public String getStudentNumber(){
        return studentNumber;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void enterMarks(int markForMath, int markForEnglish, int markForScience) {
        this.markForMath = markForMath;
        this.markForEnglish = markForEnglish;
        this.markForScience = markForScience;
    }
    public String calculateAverage() {
        DecimalFormat f = new DecimalFormat("#0.0");
        String d = f.format((markForMath + markForEnglish + markForScience) / 3.0);
        return d;
    }

}