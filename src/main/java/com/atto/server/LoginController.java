package com.atto.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
      response.sendRedirect("/login/login.html");
      return;
    }

    @PostMapping("/ubs/v1.0/login")
    @ResponseBody
    public void login(HttpServletRequest request,
                      HttpServletResponse response, @RequestBody User loginUser) {
        Boolean confirm = userService.checkId(loginUser);
        if(confirm == true) {
            response.setStatus(200);
        } else {
            response.setStatus(401);
        }
    }
}
