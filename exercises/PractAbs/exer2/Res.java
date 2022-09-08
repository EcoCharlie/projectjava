package exercises.PractAbs.exer2;

public class Res extends Operation {
    public Res() {
        super();
    }

    public Res(Float value1, Float value2) {
        super(value1, value2);
        
    }

    @Override
    public void Operar(Float value1, Float value2) {        
        this.respon = value1 - value2;
    }
}
