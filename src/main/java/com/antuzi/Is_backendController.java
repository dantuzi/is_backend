package com.antuzi;

import io.micronaut.http.annotation.*;

@Controller("/is_backend")
public class Is_backendController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}