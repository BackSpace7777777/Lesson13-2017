package src;
public class Task {
    private String name,desc;
    public Task(String name, String desc)
    {
        this.name=name;
        this.desc=desc;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return desc;
    }
    public void setName(String in)
    {
        if(!in.equals(""))name=in;
    }
    public void setDescription(String in)
    {
        if(!in.equals(""))desc=in;
    }
    public boolean validate()
    {
        if(name==null || desc==null|| name.equals("") || desc.equals(""))return false;
        else return true;
    }
}
