package murach.email;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import murach.business.Jsfuser;
import murach.data.UserDB;

@ManagedBean
@RequestScoped
public class EmailList {
    private Jsfuser user;
    private String message;
    
    public EmailList() {
    }
    
    @PostConstruct
    public void init() {
        user = new Jsfuser();
    }
    
    public String addToEmailList() {
        if (UserDB.emailExists(user.getEmail())) {
            message = "This email address already exists. " +
                    "Please enter another email address";
            return "index";
        } else {
            UserDB.insert(user);
            return "thanks";
        }
    }

    public Jsfuser getUser() {
        return user;
    }

    public void setUser(Jsfuser user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }
}