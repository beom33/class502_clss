package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/uploads/3.png");
        String contentType = Files.probeContentType(file.toPath());

        //윈도우즈 에서 한글 깨짐 문제 발생은 -> 인코딩  UTF-8 -> CPC949, EUC-KR, ISO8859_1
        String fileName = new String(file.getName().getBytes(), "ISO8859_1");

         resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
         resp.setContentType(contentType);
         resp.setHeader("Cache-Control", "must-revalidate");
         resp.setIntHeader("Expires",0);
         resp.setContentLengthLong(file.length());

         try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
             OutputStream out = resp.getOutputStream();
             out.write(bis.readAllBytes());

         }
    }
}
