package br.com.alura.desafio.model;

public class Podcast extends Audio {
    private String anfitriao;
    private String descricao;

    public String getAnfitriao() {
        return anfitriao;
    }

    public void setAnfitriao(String anfitriao) {
        this.anfitriao = anfitriao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if(getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
