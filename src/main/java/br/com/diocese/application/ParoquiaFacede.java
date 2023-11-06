package br.com.diocese.application;

import org.springframework.http.ResponseEntity;

public interface ParoquiaFacede {

    ResponseEntity obterParoquiasGeoLocalizacao(double latMobile, double longMobile);

    ResponseEntity obterParoquiaPorId(String paroquiaId);
    ResponseEntity obterParoquias();
}
