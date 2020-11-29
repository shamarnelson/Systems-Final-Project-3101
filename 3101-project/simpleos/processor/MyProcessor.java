package simpleos.processor;

import simpleos.memory.*;


public  class MyProcessor extends Processor {

    private MyMemory PC;    
    private MyMemory IR;    
    private MyMemory ACC;  
    private Memory size; 
    private Memory memloc[];
    private int memcalc[];
    private int last;

    int speed = 10;
    


    public int fetch(){
        System.out.println("Processor is now fetching..");
        System.out.println(PC);
        System.out.println(IR);
        System.out.println(ACC);
        return 1;
    } 
    public int execute(){
        System.out.println("Processor is now execting..");
        /*int PC = PC.load();
        int IR= IR.load();
        int ACC= ACC.load();*/
        return 1;
    } 
    //Loading AC to memory
    public int [] load(){
        int ACC[] = new int[last];
        for(int i=0;i<last;i++)
        ACC=memloc[i];
        return ACC;
    }
    //Storing AC to memory
    public store(int ACC){
        accumulator=ACC;
        last=0;
        memloc=new int[ACC];
    }
    //Adding AC to memory
    /*public boolean add(int Acc){
        if(last>=size)
        return false;
        memloc[last++] = Acc;
        return true;

    }
    //Subtracting AC from memory
    public boolean subtract(int Acc){
        if(last>=size)
        return false;
        memloc[last--] = Acc;
        return true;

    }*/

    //Data memory for calculations
    public int setcalcVal(int index, int calcval){
        try{
            memcalc[index]= calcval;
            int decimal=Integer.parseInt(binaryString,2);
            System.out.println(decimal);
            return 1;
        }catch(Exception e){
            System.out.println(e.toString());
            return -1;
        }
    }


    //Simulating the printing of fibonacci numbers
    static void fib(){
        int a=0, b=1, n=5,PC=300;

        while(counter<n){
            System.out.println(a);
            a=a+b;
            b=a-b;
            PC=PC+1;
            
        }
    }

} //end abstract class Processor
