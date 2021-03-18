package com.upgrad.restApi.swagger.controller;


import com.upgrad.restApi.swagger.dto.AuthorDto;
import com.upgrad.restApi.swagger.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/authors")
@Api(value = "auhors api", description = "Author Details")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @RequestMapping(value = "/getAuthors", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "Get Authors", notes = "Get all the Authors")
    public ArrayList<AuthorDto> getAllAuthors() {
        return service.getAuthors();
    }

    @RequestMapping(value = "/addAuthors", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "Add Author", notes = "Add a new author")
    public AuthorDto addAuthor(@RequestBody AuthorDto authorDto) {
         return service.addAuthor(authorDto);
    }

    //IMPLEMENT PUT METHOD FOR UPDATE

    //DELETE AUTHOR BY AUTHOR ID

    //GET AUTHOR BY AUTHOR ID

}
