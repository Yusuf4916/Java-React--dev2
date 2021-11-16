public class Instructor extends InstructorManager{


    private int InsId;
    private String insName;
    private String mail;

    public String getMail() {
        return this.mail;
    }

    public int getInsId() {
        return this.InsId;
    }

    public void allSet(int InsId,String insName,String mail) {
        this.InsId = InsId;
        this.insName=insName;
        this.mail=mail;
    }

    public String getInsName() {
        return this.insName;
    }

    
}
