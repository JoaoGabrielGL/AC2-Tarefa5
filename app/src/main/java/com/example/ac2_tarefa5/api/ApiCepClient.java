package com.example.ac2_tarefa5.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiCepClient {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    public static CepService getCepService() {
        return getClient().create(CepService.class);
    }
}
