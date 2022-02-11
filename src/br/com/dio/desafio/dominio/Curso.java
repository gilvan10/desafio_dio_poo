package br.com.dio.desafio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tutulo) {
        this.titulo = tutulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int calcularXp() {
        return 1;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
