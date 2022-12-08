package Lesson14;

import java.util.Objects;

public class Coin implements Comparable <Coin> {

        //Поля

        private int nominal;
        private double diameter;
        private String country;
        private int year;

        //Конструктор

    public Coin(int nominal, double diameter, String country, int year) {
            this.nominal = nominal;
            this.diameter = diameter;
            this.country = country;
            this.year = year;
        }
        //Методы
        public int getNominal() {
            return nominal;
        }
        public void setNominal(int nominal) {
            this.nominal = nominal;
        }

        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diameter=" + diameter +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal && Double.compare(coin.diameter,
                diameter) == 0 && year == coin.year && country.equals(coin.country);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result +(int) (temp ^ (temp >>> 32));
        result = 31 * result + country.hashCode();
        result = 31 * result + year;
        return result;
       // return Objects.hash(nominal, diameter, country, year);
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getYear() != o.getYear()){
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();
        }
        if (this.getDiameter() != o.getDiameter()){
            return Double.compare(this.getDiameter(), o.getDiameter());
        }


        return this.getCountry().compareTo(o.getCountry());
    }
}





