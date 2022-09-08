package exercises.PractAbs.exer2;

public abstract class Operation {
    protected Float value1;
    protected Float value2;
    protected Float respon;

    public Operation() {
    }

    public Operation(Float value1, Float value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public Operation(Float value1, Float value2, Float respon) {
        this.value1 = value1;
        this.value2 = value2;
        this.respon = respon;
    }

    public Float getRespon() {
        return respon;
    }

    public void setValue1(Float value1) {
        this.value1 = value1;
    }

    public void setValue2(Float value2) {
        this.value2 = value2;
    }

    public abstract void Operar(Float value1, Float value2);
}
