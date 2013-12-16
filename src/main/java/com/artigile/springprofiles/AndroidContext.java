package com.artigile.springprofiles;

import java.util.logging.Logger;

/**
 * @author ivanbahdanau
 */
public class AndroidContext extends  AbstractContext{

    private static final Logger logger = Logger.getLogger(AndroidContext.class.getName());


    public AndroidContext() {
        logger.info("========================Android context initialized===================");
    }


}
