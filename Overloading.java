class Add1{
    static int add(int a, int b){return a+b;}
    static double add(double a, double b, double c){return a+b+c;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(Add1.add(11,11));
        System.out.println(Add1.add(12.3,12.6, 13.6));
    }}

