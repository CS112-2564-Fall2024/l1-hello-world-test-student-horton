public class NameTag {
    // Name Tag saves a person's name
    String name = null;

    // Constructor, Default
    public NameTag() 
    {
        name = "Unknown";
    }

    // Constructor, full
    public NameTag(String newName)
    {
        name = newName;
    }

    public NameTag(NameTag nameTag)
    {
        // I had ChatGPT verify I was doing this right
        name = nameTag.name;
    }

    // Getter
    public String GetName()
    {
        return name;
    }

    // Setter
    public void SetName(String newName)
    {
        name = newName;
    }

    // toString
    public String toString()
    {
        return name;
    }

    // equals
    public boolean equals(NameTag nameTag)
    {
        // = is assigning a value
        // == is comparing two objects

        // I asked ChatGPT how to compare
        // the values of strings for equals.
        return name.equals(nameTag.name);
    }
}
