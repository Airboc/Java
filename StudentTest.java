import java.util.Scanner;
public class StudentTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String number=sc.next();//从控制台获取学号输入
        String name=sc.next();//从控制台获取姓名输入
        int math=sc.nextInt();//从控制台获取数学成绩输入
        int english=sc.nextInt();//从控制台获取英语成绩输入
        int science=sc.nextInt();//从控制台获取科学成绩输入
        Student student=new Student(number,name);
        student.enterMarks(math, english, science);//输入成绩
        student.toString();
    }
}