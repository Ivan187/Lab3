package test;

import static com.beust.jcommander.internal.Lists.newArrayList;
import com.fluffy.universe.exceptions.HttpException;
import static com.fluffy.universe.utils.SecurityUtils.escape;
import static com.fluffy.universe.utils.ValidationUtils.isDateValid;
import static com.fluffy.universe.utils.ValidationUtils.isValidMail;
import static com.fluffy.universe.utils.ValidationUtils.validateParametersPresence;
import io.javalin.http.HttpCode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivan
 */
public class test {

    @Test
    public void escapetest() {
        String result=escape("Test");
        assertEquals("Test",result);
        assertNotEquals("Test",escape("NewTest"));
 
    }

    @Test
    public void isValidMailtest() {
        assertTrue(isValidMail("test@test.ts"));
        assertFalse(isValidMail("TEST"));
    }

    @Test
    public void validateParametersPresencetest() {
        List TestList=null;//new ArrayList();
        assertThrows(HttpException.class, () -> {
		validateParametersPresence(TestList);
	});
    }
    
    @Test
        public void isDateValidtest() {
            assertTrue(isDateValid("1983-23-07"));
            assertFalse(isDateValid("1983-23-07"));
    }
}
