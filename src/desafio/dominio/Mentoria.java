package desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

    private LocalDate data;
    

    public Mentoria() {
    }

    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

   
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = data.format(formato);
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + dataFormatada + "]";
    }


    
    
}
