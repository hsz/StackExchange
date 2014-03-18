package mobi.hsz.stackexchange.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParameterUtilTest {

    @Test
    public void semicolonList() {
        assertEquals("test", "foo;bar", ParameterUtil.semicolonList(new String[]{"foo", "bar"}));
        assertEquals("test", "foo;", ParameterUtil.semicolonList(new String[]{"foo", ""}));
        assertEquals("test", "", ParameterUtil.semicolonList(new String[]{""}));
    }

}
