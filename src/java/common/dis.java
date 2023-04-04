package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "dis", urlPatterns = {"/dis"})
public class dis extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try{
                int id = Integer.parseInt(request.getParameter("id"));
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrsystem" , "root" , "");
                Statement stmt = conn.createStatement();
                Statement stmt2 = conn.createStatement();

                ResultSet rs = null;
                rs = stmt.executeQuery("SELECT * FROM `candidate` WHERE cid = "+id+"");
                if(rs.next()){
                    String fname = rs.getString("fname");
                    String sname = rs.getString("sname");
                    String mail = rs.getString("email");
                    String pword = rs.getString("pword");

                    stmt2.executeUpdate("UPDATE `candidate` SET `cid`="+id+" ,`fname`='"+fname+"',`sname`='"+sname+"' "
                        +",`email`='"+mail+"',`pword`='"+pword+"',`status`='not',`score`='2' WHERE `cid`= "+id+" ");

                }
                    response.sendRedirect("list.jsp");
                
            }catch(Exception e){}
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
