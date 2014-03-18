package mobi.hsz.stackexchange;

import mobi.hsz.stackexchange.types.User;
import org.junit.Before;
import org.junit.Test;

public class StackExchangeApiTest {

    private StackExchangeApi api;

    @Before
    public void setup() {
        api = new StackExchangeApi("qyP2xpE3aNSLcEeayIzouQ((");
        api.authorize("*Ee0TzE5bhHVWjkNRJnPxA))");
    }

    @Test
    public void test() {

        StackExchangeSite siteService = api.getSiteService(StackExchangeSite.STACK_OVERFLOW);
        Response<User> users = siteService.getUser();

        System.out.println("xxx");
    }

}
