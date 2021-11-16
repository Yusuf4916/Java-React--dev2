public class Student extends StudentManager{

    private int id,note;
    private String name;

    public int getId() {
        return this.id;
    }

    public void allSet(int id,String name,int note) {
        this.id = id;
        this.name=name;
        this.note=note;
    }

    public int getNote() {
        return this.note;
    }

    public String getName() {
        return this.name;
    }

    
}
