package ru.itmo.homework.climbers;

//Альпинист создаётся с именем (не менее 3 символов)
// и адресом проживания (не менее 5 символов).
public class Climber {
    private String name;
    private String address;

    public Climber(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Значение name от 3 символов");
        }
        this.name = name;
    }

    public void setAddress(String address) {
        if (address == null || address.length() < 5) {
            throw new IllegalArgumentException("Значение address от 5 символов");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
