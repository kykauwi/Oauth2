package org.Oauth;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.concurrent.atomic.AtomicLong;


@RestController
public class Controller {

    private static int tall = 2000;
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Response response(@RequestParam(value = "melding", defaultValue = "hallo") String melding) {
        System.out.println("Inni");
        int i = (int)counter.incrementAndGet();

        return new Response(i,melding);
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "/";
    }
}
