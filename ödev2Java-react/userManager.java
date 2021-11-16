public class userManager {

    public void addUser(User user)
    {
        System.out.println("Kullanıcı id'si :"+user.getId());
        System.out.println("Kullanıcı adı :"+user.getUserName());
        System.out.println("Kullanıcı şifresi :"+user.getPassword());

    }
    
}
