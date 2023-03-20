public class StudentList {
    public Student[] list;//list储存学生对象
    public int total = 0;//学生总人数
    StudentList(int length){
        list=new Student[length];
    } //length是数组长度
    public boolean add(Student stu){//增加stu到数组中，成功，返回true，否则false
        try{
            list[total]=stu;
            total++;
        }
        catch (Exception e){
            return false;
        }
        return true;
    }
    boolean test(String studentNumber){//输入学号判断已经有为true，没有为false
        boolean flag = false;
        int i;
        for (i = 0; i < total; i++)
            if (list[i].getStudentNumber().equals(studentNumber)) {
                flag = true;
            }
        return flag;
    }
    boolean remove(String number){
        int no = 0;
        for (int i = 0; i < total; i++){
            if (list[i].getStudentNumber().equals(number))
                no = i+1;
        }
        for (int i = no-1; i < total; i++){
            if ((i+1)==total)
                list[i] = null;
            else
                list[i] = list[i+1];
        }
        total--;
        return true;
    }//删除学号为number的学生，删除成功，返回true，否则false
    boolean updateItem(String number , int math , int english , int science){
        boolean flag = false;
        int no = 0;
        for (int i = 0; i < total; i++){
            if (list[i].getStudentNumber().equals(number))
                no = i+1;
        }
        int mo = no-1;
        list[mo].enterMarks(math,english,science);
        return true;
    }//更新学生成绩，成功，返回true，否则false
    boolean isEmpty(){
        if (total>0)
            return false;
        else
            return true;
    } //判断数组是否为空，若是，返回true，否则false
    int getTotal(){
        return total;
    } //返回学生总人数
    public Student getItem(String number){
        boolean flag=false;
        int no=-1;
        for(int i=0;i<total;i++)
            if(list[i].getStudentNumber().equals(number)){
                flag=true;
                no=i+1;
            }
        if(flag)
            return list[no-1];
        else
            return null;
    } //返回学号为number的学生，若该生不存在，返回null
}