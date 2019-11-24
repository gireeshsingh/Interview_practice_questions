class FizzBuzzThreads {
    private int n;
    Semaphore buzzLock=new Semaphore(0);
    Semaphore fizzLock=new Semaphore(0);
    Semaphore fizzBuzzLock=new Semaphore(0);
    Semaphore numLock=new Semaphore(1);

    public FizzBuzzThreads(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){
                fizzLock.acquire();
                printFizz.run();
                numLock.release();
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3!=0){
                buzzLock.acquire();
                printBuzz.run();
                numLock.release();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%5==0 && i%3==0){
                fizzBuzzLock.acquire();
                printFizzBuzz.run();
                numLock.release();
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                numLock.acquire();
                fizzBuzzLock.release();
            }
            else if(i%3==0){
                numLock.acquire();
                fizzLock.release();
            }
            else if(i%5==0){
                numLock.acquire();
                buzzLock.release();
            }
            else{
                numLock.acquire();
                printNumber.accept(i);
                numLock.release();
            }
        }
    }
}