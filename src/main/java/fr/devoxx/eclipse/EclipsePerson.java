package fr.devoxx.eclipse;

public class EclipsePerson {
    private String name;
    private String firstname;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EclipsePerson other = (EclipsePerson) obj;
        if (age != other.age)
            return false;
        if (firstname == null) {
            if (other.firstname != null)
                return false;
        } else if (!firstname.equals(other.firstname))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "EclipsePerson [name=" + name + ", firstname=" + firstname + ", age=" + age + "]";
    }
    public EclipsePerson(String name, String firstname, int age) {
        super();
        this.name = name;
        this.firstname = firstname;
        this.age = age;
    }
    public EclipsePerson() {
        
    }

    
    
    
    
    
}
