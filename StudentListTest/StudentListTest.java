import java.util.Scanner;
public class StudentListTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        String result [] = new String[num];
        StudentList studentList = new StudentList(130);
        for (int n = 0; n < num; n++){
            Student student = new Student();
            String studentNumber = new String();
            String studentName = new String();
            int markForMath;
            int markForEnglish;
            int markForScience;
            int Choice = sc.nextInt();
            switch (Choice) {
                case 1://功能1：添加学生信息
                    studentNumber = sc.next();
                    studentName = sc.next();
                    markForMath = sc.nextInt();
                    markForEnglish = sc.nextInt();
                    markForScience = sc.nextInt();
                    student.setStudentNumber(studentNumber);
                    student.setStudentName(studentName);
                    student.enterMarks(markForMath, markForEnglish, markForScience);
                    boolean test = studentList.test(studentNumber);
                    if (test == false) {
                        studentList.add(student);
                        result[n] = "Add success";
                    } else
                        result[n] = "Students already exist";
                    break;
                case 2://功能2：删除学生信息
                    studentNumber = sc.next();
                    test = studentList.test(studentNumber);
                    if (test == true) {
                        studentList.remove(studentNumber);
                        result[n] = "Delete success";
                    } else
                        result[n] = "Students do not exist";
                    break;
                case 3://功能3：更改学生成绩信息
                    studentNumber = sc.next();
                    markForMath = sc.nextInt();
                    markForEnglish = sc.nextInt();
                    markForScience = sc.nextInt();
                    test = studentList.test(studentNumber);
                    if (test == true) {
                        studentList.updateItem(studentNumber, markForMath, markForEnglish, markForScience);
                        result[n] = "Update success";
                    } else
                        result[n] = "Students do not exist";
                    break;
                case 4:
                    studentNumber = sc.next();
                    student = studentList.getItem(studentNumber);
                    if (student != null) {
                        result[n] = "Student ID:" + student.getStudentNumber() + "\n" + "Name:" + student.getStudentName() + "\n" + "Average Score:" + student.calculateAverage();
                    } else {
                        result[n] = "Students do not exist";
                    }
                    break;
                case 5:
                    test = studentList.isEmpty();
                    if(test)
                        result[n] = "List is empty";
                    else
                        result[n] = "List is not empty";
                    break;
                case 6:
                    String total;
                    total = studentList.getTotal() + "";
                    result[n] = (String) total;
                    break;
            }
        }
        for (int m = 0; m < num; m++)
            System.out.println(result[m]);
        }
    }
