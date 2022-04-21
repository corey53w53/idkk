class test{
    public static void main(String[] args){
        System.out.println("hello");
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        int w = 2;
        int e = plusone(w);
        System.out.println(e);
        Point(3,4);
    }

    public static int plusone(int a){
        return a+1;
    }
    public static void Point(int a, int b){
        int x = a;
        int y = b;
        System.out.println("("+x+","+y+")");
    }
}