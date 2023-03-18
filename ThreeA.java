import java.util.Scanner;
public class ThreeA{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        int second,minute,hour;
        for (int i = 0; i < n; i++){
        second = arr[i]%60;
        hour = arr[i]/3600;
        minute = (arr[i]-hour*3600-second)/60;
        Clock clock = new Clock(hour,minute,second);
        clock.output();
        }
    }
}
class  Clock {
    private int hour;
    private int minute;
    private int second;

    // 方法成员
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void output(){
        System.out.println(hour+":"+minute+":"+second);
    }
}