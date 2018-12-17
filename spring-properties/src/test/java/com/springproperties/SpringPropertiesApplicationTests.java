package com.springproperties;

import com.springproperties.properties.MySelfProperty;
import com.springproperties.properties.UserProperty;
import com.springproperties.properties.ValueProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringPropertiesApplicationTests {

    /*@Test
    public void contextLoads() {
    }*/
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringPropertiesApplicationTests.class);

    @Autowired
    private MySelfProperty mySelfProperty;

    @Autowired
    private UserProperty userProperty;

    @Autowired
    private ValueProperty valueProperty;

    @Test
    public void MySelfProprtyTest() {
        LOGGER.info("\n" + mySelfProperty.toString() + "\n");
    }

    @Test
    public void UserPropertyTest() {
        LOGGER.info("\n" + userProperty.toString() + "\n");
    }

    @Test
    public void ValuePropertyTest() {
        LOGGER.info("\n" + valueProperty.toString() + "\n");
    }

}
