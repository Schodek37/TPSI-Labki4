
package lab2;
public class  Main {
 
    public static void main(String[] args) {
        Person p1 = new Person("Bill", "Gates", "@gmail.com");
        Person p2 = new Person("Gal", "Anonim", "@zut.edu.pl");

        University zut = new University("Zachodniopomorski Uniwersystet Technologiczny w Szczecinie", "zut@zut.edu.pl");
        University wsks = new University("Wyższa Szkoła Kosmetologii Stosowanej w Koluszkach", "wsks@wsks.edu.pl");

        Person s1 = new Student("Jan", "Kowalski", "jkowalski@wi.zut.edu.pl", "32A");
        Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl", "32A");
        System.out.println(s1);
        Person t1 = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");
        Student Kubus = new Student("Kuba", "Schodowski", "kschodowski@wi.zut.edu.pl", "32A");
        Teacher Ja = new Teacher("Bjarne", "Stroustrup", "bjarne@fake.org", "Introduction to C++");
        Teacher Ja2 = new Teacher("anrajB", "Stroustrup", "bjarne@fake.org", "Introduction to C++");

        System.out.println("\n");
        EmailRecipient[] spamList = new EmailRecipient[5];
        spamList[0] = zut;
        spamList[1] = wsks;
        spamList[2] = s1;
        spamList[3] = s2;
        spamList[4] = t1;
        
        for(EmailRecipient recipient : spamList) {
            String email = recipient.getEmailAddress();
            System.out.println(email);
        }
           
        Kubus.addGrade(3.0);
        Kubus.addGrade(3.0);
        Kubus.addGrade(6.0);
        Kubus.getGradesAverage();
        
        Faculty WI = new Faculty("WI");        
        Faculty WI2 = new Faculty("WI2");
        
        WI.addTeacher(Ja);
        WI.addTeacher(Ja2);
        WI.getTeachers();
        
        zut.addFaculty(WI);
        zut.addFaculty(WI2);
        zut.getFaculties();
        
        System.out.println("\n");
        System.out.println(p1);
        System.out.println(p2);
    }


}
