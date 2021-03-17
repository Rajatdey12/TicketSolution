package com.upgrad.restApi.swagger.controller;


import com.upgrad.restApi.swagger.dto.AuthorDto;
import com.upgrad.restApi.swagger.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/authors")
@Api(value = "auhors api", description = "Authors detials")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @GetMapping("/getAllAuthors")
    @ApiOperation(value = "Get Authors", notes = "Get all the Authors")
    public ArrayList<AuthorDto> getAllAuthors() {
        return service.getAuthors();
    }
}
