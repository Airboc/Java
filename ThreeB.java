import java.util.Scanner;
public class ThreeB {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        Fraction fraction = new Fraction(a,b,c,d);
        fraction.output();
    }
}
class  Fraction {
    private int molecule_x;
    private int denominator_x;
    private int molecule_y;
    private int denominator_y;
    public Fraction(int molecule_x, int denominator_x, int molecule_y,int denominator_y){
        this.molecule_x = molecule_x;
        this.denominator_x = denominator_x;
        this.molecule_y = molecule_y;
        this.denominator_y = denominator_y;
    }
    public int gcd(int a, int b){
        int m = Math.abs(a);
        int n = Math.abs(b);
        if (n==0)
            return m;
        else
            return gcd(n,m%n);
    }
    public void output(){
        int new_denominator = denominator_x*denominator_y;
        int new_molecule = molecule_x*molecule_y;
        int x = molecule_x*denominator_y;
        int y = molecule_y*denominator_x;
        //输出a
        int m6 = gcd(molecule_x,denominator_x);
        if (molecule_x*denominator_x > 0)
            System.out.println(Math.abs(molecule_x/m6)+"/"+Math.abs(denominator_x/m6));
        else
            System.out.println("-"+Math.abs(molecule_x/m6)+"/"+Math.abs(denominator_x/m6));
        //输出b
        int m7 = gcd(molecule_y,denominator_y);
        if (molecule_y*denominator_y > 0)
            System.out.println(Math.abs(molecule_y/m7)+"/"+Math.abs(denominator_y/m7));
        else
            System.out.println("-"+Math.abs(molecule_y/m7)+"/"+Math.abs(denominator_y/m7));
        //输出a+b
        int m1 = gcd(x+y,new_denominator);
        int sum = Math.abs((x+y)/m1);
        if ( (x+y)*new_denominator > 0)
            System.out.println(Math.abs(sum)+"/"+Math.abs(new_denominator/m1));
        else
            System.out.println("-"+Math.abs(sum)+"/"+Math.abs(new_denominator/m1));
        //输出a-b
        int m2 = gcd(x-y,new_denominator);
        int dif = Math.abs((x-y)/m2);
        if ( (x-y)*new_denominator > 0)
            System.out.println(Math.abs(dif)+"/"+Math.abs(new_denominator/m2));
        else
            System.out.println("-"+Math.abs(dif)+"/"+Math.abs(new_denominator/m2));
        //输出a*b
        int m3 = gcd(new_molecule,new_denominator);
        if (new_molecule*new_denominator > 0)
            System.out.println(Math.abs(new_molecule/m3)+"/"+Math.abs(new_denominator/m3));
        else
            System.out.println("-"+Math.abs(new_molecule/m3)+"/"+Math.abs(new_denominator/m3));
        //输出a/b
        int m4 = gcd(molecule_x*denominator_y,denominator_x*molecule_y);
        if ((molecule_x*denominator_y)*(denominator_x*molecule_y)>0)
            System.out.println(Math.abs(molecule_x*denominator_y/m4)+"/"+Math.abs(denominator_x*molecule_y/m4));
        else
            System.out.println("-"+Math.abs(molecule_x*denominator_y/m4)+"/"+Math.abs(denominator_x*molecule_y/m4));
        //输出1/a
        int m8 = gcd(molecule_x,denominator_x);
        if (molecule_x*denominator_x > 0)
            System.out.println(Math.abs(denominator_x/m8)+"/"+Math.abs(molecule_x/m8));
        else
            System.out.println("-"+Math.abs(denominator_x/m8)+"/"+Math.abs(molecule_x/m8));
        //输出a
        float k = (float) molecule_x / denominator_x;
        System.out.printf("%.1f\n",k);
    }
}