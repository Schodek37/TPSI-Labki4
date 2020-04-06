package tpsi.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {
    
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
        
        List<Person> listaosob = new ArrayList<>();
        
        
        Person person1= new Person("jan","nazw1","wp1@wp.pl");
        Person person2= new Person("jarek","nazw2","wp2@wp.pl");
        Person person3= new Person("jacek","nazw3","wp3@wp.pl");
        
        listaosob.add(person1);
        listaosob.add(person2);
        listaosob.add(person3);
        
        request.setAttribute("listaosob", listaosob);       
        
       
        
        request.getRequestDispatcher("personList.jsp").forward(request, response);
    }  
    
}