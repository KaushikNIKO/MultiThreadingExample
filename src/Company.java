public class Company {

    int n;
    boolean flag=false;
    public synchronized void produce_item(int n){
        if(flag){
            try{wait();}catch(Exception e){}
        }
        this.n = n;
        System.out.println("Produce item:"+this.n);
        flag=true;
        notify();
    }

    public synchronized void consume_item(){
        if (!flag){
            try{wait();}catch(Exception e){}
        }
        System.out.println("Consume item:"+this.n);
        flag=false;
        notify();
    }

}
