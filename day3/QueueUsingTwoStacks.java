package day3;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> st1=new Stack<>();
    Stack<Integer> st2=new Stack<>();

    void push(int x){
        st1.push(x);
    }

    int dequeue(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.pop();
    }
    int peek(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==1){
                int num=sc.nextInt();
                q.push(num);
            }
            else if(a==2){
                q.dequeue();
            }
            else{
                System.out.println(q.peek());
            }
        }

    }
}
