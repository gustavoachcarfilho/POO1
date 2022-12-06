import java.time.LocalDate;

public class Horista extends Funcionarios{
    private float valorHora;
    private int horasTrab;

    public Horista(String nomeF, LocalDate dataNascimentoF, float valorHoraF, int horasTrabF){
        super(nomeF, dataNascimentoF, 0.0f);
        this.valorHora = valorHoraF;
        this.horasTrab = horasTrabF;
    }

    public float calculaSalario(){
        return this.valorHora * this.horasTrab;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
}
