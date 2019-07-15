package pattern;

import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public final class DesignApplication {
    private static Logger log = Logger.getLogger(DesignApplication.class);


    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        log.info("App正在运行");
        log.debug("log4j正在运行");
        System.out.println("Hello World!");
    }
}
