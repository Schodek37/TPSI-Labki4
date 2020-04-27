package lab2;

import java.util.ArrayList;
import java.util.List;


public class Faculty implements EmailRecipient {
        
        
        private List<Teacher> Teachers = new ArrayList<>();
        private String emailAddress;
        private final String name;
        
        public Faculty(String name) {
            this.name = name;
        }
        
        public List<Teacher> getTeachers(){
            System.out.println(Teachers);
            return Teachers;
        }
       
        public void addTeacher(Teacher teacher){
            Teachers.add(teacher);
        }
    
        @Override
        public String getEmailAddress() {
            return emailAddress;
        }
        
        
}
