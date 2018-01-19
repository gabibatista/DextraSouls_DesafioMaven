public class Personagem {
    int vida;
    int forca;

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    int agilidade;
    int energia;


    public Personagem(int vida, int forca) {
        this.setVida(vida);
        this.setForca(forca);
    }

    public Personagem(int forca, int agilidade, int energia) {
        this.setForca(forca);
        this.setAgilidade(agilidade);
        this.setEnergia(energia);
    }

    public void recebeAtaque(Personagem personagem) {
        this.setVida(this.getVida() - personagem.getForca());
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
