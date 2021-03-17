package com.upgrad.restApi.swagger.service;

import com.upgrad.restApi.swagger.dto.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {

    public static ArrayList<AuthorDto> AUTHORS = new ArrayList<>();

    static {
        AuthorDto author1 = new AuthorDto();
        author1.setAuthId(1L);
        author1.setAuthName("Guddu");

        AuthorDto author2 = new AuthorDto();
        author2.setAuthName("Kalin");
        author2.setAuthId(2L);

        AuthorDto author3 = new AuthorDto();
        author3.setAuthName("RamPrasad");
        author3.setAuthId(3L);

        AUTHORS.add(author1);
        AUTHORS.add(author2);
        AUTHORS.add(author3);
    }

    public ArrayList<AuthorDto> getAuthors() {
        return AUTHORS;
    }
}
