package Lap4.EX2;
public class Newspaper extends Document {
    private int dayIssue;
    public Newspaper(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }
    //Thêm getter và setter
    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + dayIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}