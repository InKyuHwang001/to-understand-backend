package hello.hellojavaspring.domain;

public class Member {

    private Long id;
    private  String name;
    //Alt+ Insert 눌러서
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
