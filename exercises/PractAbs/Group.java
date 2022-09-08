package exercises.PractAbs;

public class Group extends Discount {
    private Character nameGroup;
    private Double mount;

    public Group() {
    }

    public Character getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(Character nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Double getMount() {
        return mount;
    }

    public void setMount(Double mount) {
        this.mount = mount;
    }

    @Override
    public Double getDiscount() {
        Double mountDiscount;
        Double cantMillar;

        if(this.mount >= 10000) {
            cantMillar = mount / 10000;
            if(this.nameGroup == 'A') {
                mountDiscount = cantMillar * 0.10;
            } else if(this.nameGroup == 'B') {
                mountDiscount = cantMillar * 0.05;
            } else if(this.nameGroup == 'C') {
                mountDiscount = cantMillar * 0.02;
            } else {
                mountDiscount = -1.0;
            }

            return mountDiscount;
        }

        return -.0;
    }

    public Double getTotal() {
        if(this.getDiscount() > 0 ) {
            return mount *(1-this.getDiscount());
        }

        return mount;
    }

    
    
}
