package vn.edu.iuh.fit.sol2.entities;

public class Element {
    private String sign;
    private double coeficient;
    private int exponent;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(double coeficient) {
        this.coeficient = coeficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public Element() {
    }

    public Element(String sign, double coeficient, int exponent) {
        this.sign = sign;
        this.coeficient = coeficient;
        this.exponent = exponent;
    }


    @Override
    public String toString() {
        return "Element{" +
                "sign='" + sign + '\'' +
                ", coeficient=" + coeficient +
                ", exponent=" + exponent +
                '}';
    }
}
