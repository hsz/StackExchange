package mobi.hsz.stackexchange;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

import java.text.DateFormat;

public class StackExchange {

    public static final double VERSION = 2.2;
    public static final String ENDPOINT = "https://api.stackexchange.com/" + VERSION;

    private final String clientId;
    private final String clientSecret;

    protected RestAdapter restAdapter;

    /**
     * Constructs a new StackExchange instance.
     *
     * @param clientId      the application client id
     * @param clientSecret  the application client secret
     */
    public StackExchange(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        this.restAdapter = new RestAdapter.Builder()
            .setEndpoint(ENDPOINT)
//            .setErrorHandler(new StackExchangeErrorHandler())
            .setLogLevel(RestAdapter.LogLevel.FULL)
            .setConverter(new GsonConverter(gson))
            .build();

    }

    public void authorize() {
        System.out.println(clientId);
        System.out.println(clientSecret);
    }

    public StackExchangeService getService() {
        return restAdapter.create(StackExchangeService.class);
    }

}
