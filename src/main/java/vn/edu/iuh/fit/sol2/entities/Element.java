package vn.edu.iuh.fit.sol2.entities;

public class Element {
    private String sign;
    private double coefficient;
    private int exponent;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public Element() {
    }

    public Element(String sign, double coefficient, int exponent) {
        this.sign = sign;
        this.coefficient = coefficient;
        this.exponent = exponent;
    }
     // Phương thức tạo một phần tử từ một chuỗi
    public static  Element parseElement(String str) {
           str = str.toLowerCase().trim();
           String sign = (str.charAt(0) + "").equals("-") ? "-" : "+";
           double coef = 0f;
           if (str.contains("x"))
              coef = Double.parseDouble(str.substring(1, str.indexOf("x")));
           else
               coef = Double.parseDouble(str);
           int exp = 0;
           if (str.contains("^"))
               exp = Integer.parseInt("0" + str.substring(str.indexOf("^") + 1));

           return new Element(sign, coef, exp);
       }



   



    @Override
   public String toString() {
        // Thêm một dấu cách giữa hệ số và x^exponent
        return sign + " " + coefficient + "x^" + exponent;
    }
}
