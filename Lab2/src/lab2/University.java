
package lab2;

import java.util.ArrayList;
import java.util.List;

public class University implements EmailRecipient {

    private List<Faculty> Faculties = new ArrayList<>();
    private String emailAddress;
    private String name;


    public University(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
    
    public List<Faculty> getFaculties(){
           System.out.println(Faculties);
           return Faculties;        
    }
    
    public void addFaculty(Faculty Faculty){        
           this.Faculties.add(Faculty);
    }
   
    
}