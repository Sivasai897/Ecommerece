package com.in.cafe.rest;

import com.in.cafe.dto.UserDTO;
import com.in.cafe.wrapper.UserWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/user")
public interface UserRest {

    @PostMapping(path = "/signup")
    ResponseEntity<String> signUp(@RequestBody(required = true) Map<String, String> requestMap);

//    @PostMapping(path="/register")
//    ResponseEntity<String> register(@RequestBody(required = true)UserDTO userDTO);

    @PostMapping(path = "/login")
    ResponseEntity<String> login(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/get")
    ResponseEntity<List<UserWrapper>> getAllUser();

    @PostMapping(path = "/update")
    ResponseEntity<String> update(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping(path = "/checkToken")
    ResponseEntity<String> checkToken();

    @PostMapping(path = "/changePassword")
    ResponseEntity<String> changePassword(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping(path = "/forgotPassword")
    ResponseEntity<String> forgotPassword(@RequestBody(required = true) Map<String, String> requestMap);
}
