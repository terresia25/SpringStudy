package hello.core.member;

public class Member {
    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade) { //생성자 만들어주는 단축키 crtl+shift+Q로 지정해둠
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //아래 getter, setter들을 통해 위 class Member의 id, name, grade를 받아 올 수 있음
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
