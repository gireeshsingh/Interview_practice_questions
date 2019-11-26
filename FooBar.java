class FooBar {
    private int n;
    int status=0;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n ; i++) {
            while(status==1) Thread.sleep(1);
        	printFoo.run();
            status=1;
            
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(status==0) Thread.sleep(1);
        	printBar.run();
            status=0;
            
        }
    }
}