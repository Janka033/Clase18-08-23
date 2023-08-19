package Arrays;

public class Cliente {
    private int cedula;
    private String name;
    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", name='" + name + '\'' +
                '}';
    }
    public Cliente(int cedula, String name) {
        this.cedula = cedula;
        this.name = name;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
