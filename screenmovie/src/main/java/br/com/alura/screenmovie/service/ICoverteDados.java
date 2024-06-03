package br.com.alura.screenmovie.service;

public interface ICoverteDados {
     <T> T  obterDados(String json, Class<T> classe);
}
