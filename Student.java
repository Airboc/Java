public class Student {
    private String studentNumber;//学号
    private String studentName;//姓名
    private int markForMaths = -1;//数学成绩
    private int markForEnglish = -1;//英语成绩
    private int markForScience = -1;//科学成绩
    public Student(String number, String name) {
        this.studentNumber = number;
        this.studentName = name;
    }
    public void enterMarks(int markForMaths, int markForEnglish, int markForScience) {
        this.markForMaths = markForMaths;
        this.markForEnglish = markForEnglish;
        this.markForScience = markForScience;
    }
    public double calculateAverage() {
        return (markForMaths + markForEnglish + markForScience) / 3.0;
    }

    public String toString() {
            System.out.println("Student ID:"+studentNumber);
            System.out.println("Name:"+studentName);
            System.out.println("Math:"+markForMaths);
            System.out.println("English:"+markForEnglish);
            System.out.println("Science:"+markForScience);
            System.out.printf("Average Score:"+"%.1f\n", calculateAverage());
            return null;
    }
}