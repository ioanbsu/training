package com.artigile.springprofiles;

import java.util.logging.Logger;

/**
 * @author ivanbahdanau
 */
public class IPhoneContext extends AbstractContext {
    private static final Logger logger = Logger.getLogger(IPhoneContext.class.getName());


    public IPhoneContext() {
        logger.info("=================Iphone Context Initialized===================");
    }


}
