package mobi.hsz.stackexchange;

import mobi.hsz.stackexchange.entity.Error;
import mobi.hsz.stackexchange.entity.Site;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface StackExchangeService {

    /**
     * NETWORK METHODS
     */


    /**
     * Errors
     */

    @GET("/errors")
    Response<Error> getErrors();

    /**
     * @TODO Causes `retrofit.RetrofitError`
     */
    @GET("/errors/{id}")
    Error getError(@Path("id") int id);


    /**
     * Sites
     */

    @GET("/sites")
    Response<Site> getSites();

    @GET("/sites")
    Response<Site> getSites(@Query("page") int page, @Query("pagesize") int pagesize);

}
