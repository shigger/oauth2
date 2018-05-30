package com.higginss.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @PreAuthorize("#oauth2.hasScope('read') and hasRole('ROLE_USER')") // Limit to only user roles with read access.
    @GetMapping(value = "/article/{id}")
    public String fetchArticle(@PathVariable String id) {
        return "Returning " + id;
    }

}
