public class User extends userManager{

    private String userName;
    private int password,id;

    public String getUserName() {
        return this.userName;
    }

    public int getPassword() {
        return this.password;
    }

    public int getId() {
        return this.id;
    }

    public void allSet(int id,String userName,int password) {
        this.id = id;
        this.userName=userName;
        this.password=password;
    }
    
}
