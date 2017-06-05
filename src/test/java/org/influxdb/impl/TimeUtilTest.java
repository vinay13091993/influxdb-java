package org.influxdb.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TimeUtilTest {
    @Test
    public void toInfluxDBTimeFormatTest() throws Exception {
        assertThat(TimeUtil.toInfluxDBTimeFormat(1477896740020L), is(equalTo("2016-10-31T06:52:20.020Z")));
        assertThat(TimeUtil.toInfluxDBTimeFormat(1477932740005L), is(equalTo("2016-10-31T16:52:20.005Z")));
    }
}
