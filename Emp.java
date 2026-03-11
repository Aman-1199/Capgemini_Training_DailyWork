import java.io.Serializable;

public class Emp implements Serializable {
    public int empid;
    public String name;

    public Emp(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                '}';
    }
}//alt+0 use karna hai
