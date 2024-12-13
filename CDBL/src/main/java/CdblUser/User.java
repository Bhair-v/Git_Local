package CdblUser;

public class User {
    private String id, name, password, email, phone, type;

    public User(String id, String name, String password, String email, String phone, String type) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.type = type;
        this.id = generateID();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public String generateID() {
        String id = "" ;

        id += this.name.substring(0, 2) ;
        id += this.email.substring(0, 2) ;
        id += this.phone.substring(0, 1) ;

        return id;

    }
    public static boolean loginVR(String id, String password) {
        if (this.getId().equals(id) && this.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
