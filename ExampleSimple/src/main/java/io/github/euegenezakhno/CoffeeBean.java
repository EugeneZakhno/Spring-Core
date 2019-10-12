package io.github.euegenezakhno;

public class CoffeeBean {
    private int id;
    private String name;

    public CoffeeBean(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public CoffeeBean( String name) {
        this.name = name;
    }

    public CoffeeBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "CoffeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
