package mobi.hsz.stackexchange;

import org.junit.Before;

public class StackExchangeTest {

    private static final String CLIENT_ID       = "clientId";
    private static final String CLIENT_SECRET   = "clientSecret";

    private StackExchange api;
    private StackExchangeService service;

    @Before
    public void setup() {
        api = new StackExchange(CLIENT_ID, CLIENT_SECRET);
        service = api.getService();
    }

}
