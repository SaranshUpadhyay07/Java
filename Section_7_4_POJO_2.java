public class Section_7_4_POJO_2 {
    private String id;
    private String name;
    private String daeOfBirth;
    private String classlist;

    public Section_7_4_POJO_2(String id, String name, String daeOfBirth, String classlist) {
        this.id = id;
        this.name = name;
        this.daeOfBirth = daeOfBirth;
        this.classlist = classlist;
    }

    @Override // This is Annotation that is type of metadata
    public String toString() {
        return "Section_7_4_POJO_2{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", daeOfBirth='" + daeOfBirth + '\'' +
                ", classlist='" + classlist + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDaeOfBirth() {
        return daeOfBirth;
    }

    public String getClasslist() {
        return classlist;
    }
}
