package vn.edu.iuh.fit.sol2.entities;

import java.util.ArrayList;

public class Polynomial {
    private ArrayList<Element> elements;



    public Polynomial() {
        this.elements= new ArrayList<>();
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

    public void removeElement(Element element) {
        this.elements.remove(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean firstElement = true; // Biến để kiểm tra xem phần tử hiện tại có phải là phần tử đầu tiên không
        for (Element element : elements) {
            if (!firstElement) {
                sb.append(" ");
                if (sb.charAt(sb.length() - 1) == '-' && !element.toString().startsWith("-")) {
                    sb.append(" ");
                } else {
                    sb.append(element.toString().startsWith("-") ? "-" : "+");
                    sb.append(" ");
                }
            }
            sb.append(element);
            firstElement = false;
        }
        return sb.toString();
    }



    public static Polynomial fromString(String str) {
        Polynomial polynomial = new Polynomial();
        String[] terms = str.split("(?=[+-])");

        for (String term : terms) {
            term = term.trim();
            if (term.isEmpty()) continue;

            // Nếu term bắt đầu bằng ký tự "+" hoặc "-" nhưng không có nội dung sau,
            // ta sẽ thêm ký tự "1" vào trước term để biểu diễn hệ số 1 của term đó.
            if ((term.startsWith("+") || term.startsWith("-")) && term.length() == 1) {
                term += "1";
            }

            Element element = Element.parseElement(term);
            polynomial.addElement(element);
        }

        return polynomial;
    }


    //    ham main test
    public static void main(String[] args) {
        Polynomial polynomial = Polynomial.fromString("2x^3+3x^2-4x+5");
        System.out.println(polynomial);
    }
}
