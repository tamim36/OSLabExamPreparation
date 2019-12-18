package thread.synchronization.example;

public class StopWatch
{

    //Starting value of timer
    private long timerTime = 0;
    //Number of ms to add and sleep
    private static final int DELAY    = 100;

    private Thread thisThread;

    //Create and start our timer
    public synchronized void startClock( final int id )
    {
        //Creating new thread.
        thisThread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    while( true )
                    {
                        System.out.printf( "Thread [%d] = %d\n", id, timerTime );
                        timerTime  += DELAY;                                        //Count 100 ms
                        Thread.sleep( DELAY );
                    }
                }
                catch( InterruptedException ex )
                {
                    ex.printStackTrace();
                }
            }
        };

        thisThread.start();
    }

}
