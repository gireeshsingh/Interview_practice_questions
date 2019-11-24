class ZeroEvenOdd {
    private int n;
    Semaphore m0=new Semaphore(1);
    Semaphore m1=new Semaphore(0);
    Semaphore m2=new Semaphore(0);
    
    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            m0.acquire();
            printNumber.accept(0);
            if(i%2==1) m1.release();
            else m2.release();
        }
    }
    
    public void odd(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%2==0) continue;
            m1.acquire();
            printNumber.accept(i);
            m0.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        for(int i=2;i<=n;i++){
            if(i%2==1) continue;
            m2.acquire();
            printNumber.accept(i);
            m0.release();
        }
    }

    
}