package com.fluffy.universe.services;

import com.fluffy.universe.exceptions.HttpException;
import static com.fluffy.universe.utils.SecurityUtils.escape;
import static com.fluffy.universe.utils.ValidationUtils.isValidMail;
import static com.fluffy.universe.utils.ValidationUtils.validateParametersPresence;
import java.util.List;
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
       /* public static void validateParametersPresence(Object... parameters) {
        for (Object parameter : parameters) {
            if (parameter == null) {
                throw new HttpException(HttpCode.BAD_REQUEST);
            }*/
    @Test
    public void validateParametersPresencetest() {
        List TestList=null;//new ArrayList();
        assertThrows(HttpException.class, () -> {
		validateParametersPresence(TestList);
	});
    }
}
