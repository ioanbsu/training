package com.artigile.springprofiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ivanbahdanau
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@ActiveProfiles("android")
public class TestAndroid {

    @Autowired
    private Context context;

    @Test
    public void sayHelloAndroid() {
        context.sayHi();
    }
}
