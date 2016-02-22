package com.sganapa.sampleMvn.SampleProject;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final Logger log = Logger.getLogger(App.class.getName());
        System.out.println( "Hello World!" );
        for(int i=0;i<100000;i++) {
        	log.debug("No of time method Entered: " + i);
        	
        	try {
				Thread.sleep(1);
				if(i%2 == 0) {
					log.warn("Hey .. Im ");
					throw new InterruptedException();
				}
				else
				{
					log.error("Hey! ... Im Correct :" + i);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				log.error("Thread Exception :" + e.getMessage());
				//e.printStackTrace();
			}
        	log.info("I'm logging --- " + i);
        }
    }
}
