package org.example.join.model;

public class JoinResult {
    private String property1;
    private int property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public int getProperty2() {
        return property2;
    }

    public void setProperty2(int property2) {
        this.property2 = property2;
    }

    @Override
    public String toString() {
        return "JoinResult{" +
                "property1='" + property1 + '\'' +
                ", property2=" + property2 +
                '}';
    }
}
