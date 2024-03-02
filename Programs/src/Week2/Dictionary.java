package Week2;

class Dictionary {
    private String name;
    private long mno;

    Dictionary(String name, long mno) {
        this.name = name;
        this.mno = mno;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setMno(long mno) {
        this.mno = mno;
    }

    long getMno() {
        return this.mno;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + " Mobile Number:" + getMno() + "\n";
    }
}
