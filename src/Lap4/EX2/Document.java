
package Lap4.EX2;
public class Document {
    protected String id;
    protected String nxb;
    protected int number;

    // Tạo constructor có đối số
    public Document(String id, String nxb, int number) {
        this.id = id;
        this.nxb = nxb;
        this.number = number;
    }

    // Tạo getter và setter
    public void setId(String id) {
        this.id = id;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNxb() {
        return nxb;
    }

    public int getNumber() {
        return number;
    }

    public String getId() {
        return id;
    }
}
