package ru.itmo.homework6.climbers;

//Гора создаётся с названием (не менее 4 символов),
// страной (не менее 4 символов) и высотой (не менее 100 метров)
public class Mountain {
    private String mountainName;
    private String country;
    private int height;

    public Mountain(String mountainName, String country, int height) {
        setMountainName(mountainName);
        setCountry(country);
        setHeight(height);
    }

    public void setMountainName(String mountainName) {
        if (mountainName == null || mountainName.length() < 4) {
            throw new IllegalArgumentException("Значение mountain от 4 символов");
        }
        this.mountainName = mountainName;
    }


    public void setCountry(String country) {
        if (country == null || country.length() < 4) {
            throw new IllegalArgumentException("Значение country от 4 символов");
        }
        this.country = country;
    }

    public void setHeight(int height) {
        if (height < 100) {
            throw new IllegalArgumentException("Значение height должно быть больше 100");
        }
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "mountainName='" + mountainName + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
