package CEP_programs;
class Poly{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
}   
public class polymorpshim{
    public static void main(String[] args) {
        Poly obj = new Poly();

        int a = obj.add(12, 132);
        double b = obj.add(1.3, 23.23);
        int c = obj.add(12,23 , 13);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}