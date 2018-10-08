package com.epam.homework;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    private String state = "";
    private int counter = 0;

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws java.io.IOException {
        String newState="1";
        state += newState;
        res.setContentType("text/html");
        res.getWriter().write("<div id=\"post\"><button style=\"background-color: #1E90FF;border-radius: 5px\" type=\"button\" onclick=\"makeRequest2()\">Post</button></div>\n");
        res.getWriter().write("State:"+" "+state+"<br/>");
        printCookies(req,res);

    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws java.io.IOException {
        String newState="2";
        state += newState;
        res.getWriter().write("<div id=\"get\"><button style=\"background-color: #1E90FF;border-radius: 5px\" type=\"button\" onclick=\"makeRequest1()\">Get</button></div>\n");
        res.getWriter().write("State:"+" "+state+"<br/>");
        printCookies(req,res);

    }

    public void doPut(HttpServletRequest req, HttpServletResponse res)
            throws java.io.IOException {
        String newState="3";
        state += newState;
        res.getWriter().write("<div id=\"put\"><button style=\"background-color: #1E90FF;border-radius: 5px\" type=\"button\" onclick=\"makeRequest3()\">Put</button></div>\n");
        res.getWriter().write("State:"+" "+state+"<br/>");
        printCookies(req,res);

    }

    public void doDelete(HttpServletRequest req, HttpServletResponse res)
            throws java.io.IOException {
        String newState = "4";
        state += newState;
        res.getWriter().write("<div id=\"delete\"><button style=\"background-color: #1E90FF;border-radius: 5px\" type=\"button\" onclick=\"makeRequest4()\">Delete</button></div>\n");
        res.getWriter().write("State:"+" "+state+"<br/>");
        printCookies(req,res);
    }

    private void printCookies(HttpServletRequest req, HttpServletResponse res) throws IOException {
        Cookie cookies[]=req.getCookies();
        if ((cookies == null)||(cookies.length==0))
            res.getWriter().write("No cookies");
        else {
            counter++;
            res.getWriter().write("Cookies:"+" "+counter);
        }

    }
}