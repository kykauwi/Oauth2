package org.Oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Response {

    private int tall;
    final String melding;

    public Response(int tall, String melding) {
        this.tall = tall;
        this.melding = melding;
    }

    public int getTall() {
        return tall;
    }

    public String getMelding() {
        return melding;
    }



}
