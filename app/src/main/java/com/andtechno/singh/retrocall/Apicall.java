package com.andtechno.singh.retrocall;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apicall {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Employee>> getEmploye();
}
