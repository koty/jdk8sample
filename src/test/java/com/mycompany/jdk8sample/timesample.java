package com.mycompany.jdk8sample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDateTime;
import java.time.LocalTime;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class timesample {
    
    @Test
    public void timesampleTest() {
        LocalDateTime localDateTime = LocalDateTime.now();
        assertThat(localDateTime.toString(), is(""));
    }
    @Test
    public void timesampleTestナノ秒() {
        LocalDateTime localDateTime = LocalDateTime.of(2014, 3, 20, 20, 28, 3, 123456789);
        assertThat(localDateTime.toString(), is(""));
    }
}
