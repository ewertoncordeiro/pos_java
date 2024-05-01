
public final class Passeio extends Veiculo implements Calcular {

    private int qtdPassageiros;

    public Passeio() {
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public void calcVel() {
        System.out.println("Velocidade calculada passeio " + getVelocMax() * 1000 + " m/h");
    }

   
    @Override
    public int calcular() {
        
        return super.getPlaca().length()
                + super.getMarca().length()
                + super.getModelo().length()
                + super.getCor().length();

    }

}
