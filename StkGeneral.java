public class StkGeneral<T>  {
    Object [] a =new Object[10];
    int top=-1;
    public void push(T x){
        a[++top]=x;
    }
    T pop(){
        return (T)a[top--];
    }

    public static void main(String[] args) {

    }
}
