class H2O {

    Semaphore o = new Semaphore(1);
    Semaphore h2 = new Semaphore(2);
    CyclicBarrier h2o = new CyclicBarrier(3);

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        h2.acquire();
        
        try {
            h2o.await();
        } catch (BrokenBarrierException bbe) {
            throw new InterruptedException();
        }
        
        releaseHydrogen.run();
        h2.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        o.acquire();
        
        try {
            h2o.await();
        } catch (BrokenBarrierException bbe) {
            throw new InterruptedException();
        }
		
        releaseOxygen.run();
        o.release();
    }
}