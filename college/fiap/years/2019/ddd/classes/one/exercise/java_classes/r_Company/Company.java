public class Company {
    private String cnpj;
    private String scale;
    private float revenue;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getScale() {
        return this.scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public float getRevenue() {
        return this.revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public void isBig() {
        if (this.scale.equals("super-dooper")) {
            System.out.println("Wow, super big!");
        } else {
            System.out.println("Nah, small fish yet");
        }
    }

    public void hire() {
        System.out.println("You're part of the family now!");
    }

    public void fire() {
        System.out.println("You're not pat of the family anymore!");
    }
}
