public class stackimpl {

    int size;
    int stack[];
    int top;


    stackimpl(int size){
    this.size;
    stack= new int[size];
    this.top=-1;
    }

    void push(int item){
        top++;
        stack[top]= item;
    }

    int pop(){
        return stack[top--];
    }

    void show()
{
   for (int i=0;i<=top;i++){
    System.out.print(stack[i]);
   } 
}
    public static void main(String[] args) {
        stackimpl   

    }
    
}
