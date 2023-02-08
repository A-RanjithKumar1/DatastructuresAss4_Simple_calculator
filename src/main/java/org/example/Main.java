package org.example;
import java.util.*;
import java.util.logging.Logger;
abstract  class Simplecalci{
    private int num1;
    private int num2;
    abstract void add(int a, int b);
    abstract void sub(int a, int b);
    abstract void div(int a, int b);
    abstract void mul(int a, int b);
    public void setvalue(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
    }
    public int getval1(){
        return num1;
    }
    public int getval2(){
        return num2;
    }
}
public class Main extends Simplecalci {
    private  final Logger lOGGER =  Logger.getLogger("InfoLogging");
    double s=0;
    String dumy;
     void add(int a,int b){
        setvalue(a,b);
        dumy="The addition value is:- "+(getval1()+getval2());
        lOGGER.info(dumy);
}
    void sub(int a,int b){
        setvalue(a,b);
        dumy="The subtraction value is:- "+(getval1()-getval2());
        lOGGER.info(dumy);
    }
    void div(int a,int b){
        setvalue(a,b);
        dumy="The divison value is:- "+(getval1()/getval2());
        lOGGER.info(dumy);
    }
    void mul(int a,int b){
        setvalue(a,b);
        dumy="The multiplication value is:- "+(getval1()*getval2());
        lOGGER.info(dumy);
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         final Logger loGGER =  Logger.getLogger("InfoLogging");
        loGGER.info("Enter the operand value1 to perform the mathematical operation");
        int first=sc.nextInt();
        loGGER.info("Enter the operand value2 to perform the mathematical operation");
        int second=sc.nextInt();
        boolean choose=true;
        Simplecalci cal=new Main();
        while(choose){
        loGGER.info("Select the below operation to be formed 1.Add 2.subract 3.divide 4.multiply 5.exit");
        int op=sc.nextInt();
        if(op==1){
            cal.add(first,second);
        }
        else if(op==2){
            cal.sub(first,second);
        }
        else if(op==3){
            cal.div(first,second);
        }
       else if(op==4){
            cal.mul(first,second);
        }
       else {
           choose=false;
        }
        }
    }
}