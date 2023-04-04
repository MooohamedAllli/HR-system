/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import common.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC-Scope
 */
public class insert1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String ccid =request.getSession().getAttribute("cid").toString();
            
            
            
            String a1 =request.getSession().getAttribute("a1").toString();
            String a2 =request.getSession().getAttribute("a2").toString();
            String a3 =request.getSession().getAttribute("a3").toString();
            String a4 =request.getSession().getAttribute("a4").toString();
            String a5 =request.getSession().getAttribute("a5").toString();

            int countscore =0;
            
            DB conn2 = new DB();
            Connection conn = conn2.connector(); 
            Statement stmt = conn.createStatement();

                ResultSet rs3 = null;
            
            
            String q2 =  "SELECT * from ans where ansid = '"+a1+"' " ;
            ResultSet rs = stmt.executeQuery(q2);
            if(rs.next()){
                out.print(rs.getString("correct"));
               if(Integer.parseInt(rs.getString("correct")) == 1){
                   countscore += 10;
               }
            }

            q2 =  "SELECT * from ans where ansid = '"+a2+"' " ;
            rs = stmt.executeQuery(q2);
            if(rs.next()){
                out.print(rs.getString("correct"));
               if(Integer.parseInt(rs.getString("correct")) == 1){
                   countscore += 10;
               }
            }
            
            q2 =  "SELECT * from ans where ansid = '"+a3+"' " ;
            rs = stmt.executeQuery(q2);
            if(rs.next()){
                out.print(rs.getString("correct"));
               if(Integer.parseInt(rs.getString("correct")) == 1){
                   countscore += 10;
               }
            }
            
            q2 =  "SELECT * from ans where ansid = '"+a4+"' " ;
            rs = stmt.executeQuery(q2);
            if(rs.next()){
                out.print(rs.getString("correct"));
               if(Integer.parseInt(rs.getString("correct")) == 1){
                   countscore += 10;
               }
            }
            
            q2 =  "SELECT * from ans where ansid = '"+a5+"' " ;
            rs = stmt.executeQuery(q2);
            if(rs.next()){
                out.print(rs.getString("correct"));
                if(Integer.parseInt(rs.getString("correct")) == 1){
                   countscore += 10;
               }
            }
            
            Statement stmt2 = conn.createStatement();

            rs3 = stmt.executeQuery("SELECT * FROM `candidate` WHERE cid = "+ccid+"");
            if(rs3.next()){
                String fname = rs3.getString("fname");
                String sname = rs3.getString("sname");
                String mail = rs3.getString("email");
                String pword = rs3.getString("pword");

            stmt2.executeUpdate("UPDATE `candidate` SET `cid`="+ccid+" ,`fname`='"+fname+"',`sname`='"+sname+"' "
            +",`email`='"+mail+"',`pword`='test',`status`='examed',`score`='"+countscore+"',`score2`='0' WHERE `cid`= "+ccid+" ");
            response.sendRedirect("approved.jsp");
            }

            out.print(countscore);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(insert1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(insert1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(insert1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(insert1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
