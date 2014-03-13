package mobi.hsz.stackexchange;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;

public class StackExchangeErrorHandler implements ErrorHandler {

    @Override
    public Throwable handleError(RetrofitError error) {
        return error;
    }

}
