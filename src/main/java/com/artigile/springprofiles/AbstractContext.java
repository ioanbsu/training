package com.artigile.springprofiles;

import java.util.logging.Logger;

/**
 * @author ivanbahdanau
 */
public abstract class AbstractContext implements Context {

    private static final Logger logger = Logger.getLogger(AbstractContext.class.getName());

    private String login;

    private String password;


    @Override
    public void sayHi() {
        logger.info("Login and password is: " + login + " " + password);
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
