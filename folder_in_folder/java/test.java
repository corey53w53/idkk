class test{
    public static void main(String[] args){
        System.out.println("hello");
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        int w = 2;
        int e = plusone(w);
        System.out.println(e);
    }

    public static int plusone(int a){
        return a+1;
    }
}