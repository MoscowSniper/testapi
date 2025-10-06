package org.wndtn.testapi.controller;


import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginRequest) {
        Map<String, String> response = new HashMap<>();
        response.put("access_token", "mock_jwt_access_token");
        response.put("refresh_token", "mock_jwt_refresh_token");
        response.put("token_type", "Bearer");
        response.put("expires_in", "3600");
        return response;
    }

    @PostMapping("/refresh")
    public Map<String, String> refreshToken(@RequestBody Map<String, String> refreshRequest) {
        Map<String, String> response = new HashMap<>();
        response.put("access_token", "new_mock_jwt_access_token");
        response.put("refresh_token", "new_mock_jwt_refresh_token");
        response.put("token_type", "Bearer");
        response.put("expires_in", "3600");
        return response;
    }

    @PostMapping("/logout")
    public Map<String, String> logout() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Successfully logged out");
        return response;
    }
}