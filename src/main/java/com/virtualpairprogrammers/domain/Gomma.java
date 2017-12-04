package com.virtualpairprogrammers.domain;

public class Gomma {

    private Integer idGomma;
    private String typevehicle;
    private String model;
    private String manufacturer;
    private int quantity;
    private double price;
    private double width;
    private double height;
    private double diameter;
    private double weight;
    private String speed;
    private String season;


    public Gomma(Integer idGomma, String typevehicle, String model, String manufacturer, int quantity, double price, double width, double height, double diameter, double weight, String speed, String season) {
        this.idGomma = idGomma;
        this.typevehicle = typevehicle;
        this.model = model;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.width = width;
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
        this.speed = speed;
        this.season = season;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdGomma() {
        return idGomma;
    }

    public String getTypevehicle() {
        return typevehicle;
    }

    public void setTypevehicle(String typevehicle) {
        this.typevehicle = typevehicle;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gomma gomma = (Gomma) o;

        if (quantity != gomma.quantity) return false;
        if (Double.compare(gomma.price, price) != 0) return false;
        if (Double.compare(gomma.width, width) != 0) return false;
        if (Double.compare(gomma.height, height) != 0) return false;
        if (Double.compare(gomma.diameter, diameter) != 0) return false;
        if (Double.compare(gomma.weight, weight) != 0) return false;
        if (typevehicle != null ? !typevehicle.equals(gomma.typevehicle) : gomma.typevehicle != null) return false;
        if (model != null ? !model.equals(gomma.model) : gomma.model != null) return false;
        if (manufacturer != null ? !manufacturer.equals(gomma.manufacturer) : gomma.manufacturer != null) return false;
        if (speed != null ? !speed.equals(gomma.speed) : gomma.speed != null) return false;
        return season != null ? season.equals(gomma.season) : gomma.season == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = typevehicle != null ? typevehicle.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + quantity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(diameter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (speed != null ? speed.hashCode() : 0);
        result = 31 * result + (season != null ? season.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Modello: " + model +
                "\nVeicolo: " + typevehicle +
                "\nProduttore: " + manufacturer +
                "\nQuantità: "+ quantity +
                "\nPrezzo: "+ price +
                "\nLarghezza: " + width +
                "\nAltezza: " + height +
                "\nDiametro: " + diameter +
                "\nCarico: " + weight +
                "\nVelocità: " + speed +
                "\nStagione: " + season +
                "\n";
    }
}
