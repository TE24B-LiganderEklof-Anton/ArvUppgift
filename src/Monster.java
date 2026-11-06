public class Monster {
    private String namn;
    protected double halsa;
    protected double maxHalsa;
    protected double attackPoang;

    void Monster(String namn, double halsa, double maxhalsa, double attackPoang){
        this.namn = namn;
        this.halsa = halsa;
        this.maxHalsa = maxhalsa;
        this.attackPoang = attackPoang;
    }
    public String getNamne(){
        return  namn;
    }
    public double getHalsa(){
        return  halsa;
    }
    public double getAttackPoang(){
        return attackPoang;
    }
    public void attack(double attackPoang){
        IO.println("Attack:" + attackPoang);
    }
    public  void taSkada(double attackPoang){
        this.halsa = Math.clamp(this.halsa-attackPoang, 0, maxHalsa);
    }
}
