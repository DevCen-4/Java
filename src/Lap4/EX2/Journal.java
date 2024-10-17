package Lap4.EX2;
public class Journal extends Document {
    private int issueNumber;
    private int monthIssue;
    public Journal(String id, String nxb, int number, int issueNumber, int
            monthIssue) {
        super(id, nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    // Thêm getter và setter
    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}