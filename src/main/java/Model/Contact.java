package Model;

import java.util.Objects;

public class Contact  {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + phone + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        //Aqui obj y this son clase contacto
        Contact c = (Contact) obj;
        return name != null && name.equals(c.getName());
    }

}
