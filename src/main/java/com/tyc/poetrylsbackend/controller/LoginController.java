package com.tyc.poetrylsbackend.controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    /**
     * 1.登录 c
     * @param msg
     * @param session
     * @return
     */
    @RequestMapping("/login/{msg}")
    public void do_login(@PathVariable("msg") String msg, HttpSession session) {
    }

    /**
     * 2.注销
     * @param session
     */
    @RequestMapping("/logout")
    public void do_logout(HttpSession session) {
        session.removeAttribute("phone");
    }

}
