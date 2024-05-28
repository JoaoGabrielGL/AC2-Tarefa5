package com.example.ac2_tarefa5.api;

import com.example.ac2_tarefa5.model.Endereco;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CepService {
    @GET("{cep}/json/")
    Call<Endereco> getEndereco(@Path("cep") String cep);
}
