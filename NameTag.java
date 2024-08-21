public class NameTag {
    private String name = null;
    private String title = null;
    
    public NameTag() {}

    public NameTag(String name)
    {
        this.name = name;
    }

    public NameTag(String name, String title)
    {
        this.name = name;
        this.title = title;
    }

    public NameTag(NameTag nameTag)
    {
        this.name = nameTag.name;
        this.title = nameTag.title;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetTitle(String name)
    
    {
        this.name = name;
    }

    public String GetName()
    {
        return this.name;
    }

    public String GetTitle()
    {
        return this.title;
    }

    public String toString()
    {
        return this.name + "\n" + this.title;
    }

    public boolean equals(NameTag otherNameTag)
    {
        return this.name == otherNameTag.name && this.title == otherNameTag.title;
    }
}
