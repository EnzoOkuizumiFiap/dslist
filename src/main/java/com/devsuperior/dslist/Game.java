package com.devsuperior.dslist;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Essa anotation vai configurar minha classe java para que seja equivalente a uma tabela no banco relacional - Isso quer dizer que o JPA vai mapear essa classe para uma tabela no banco de dados
@Table(name = "tb_game") //Essa anotation vai configurar o nome da tabela no banco de dados, caso não seja configurada, o JPA vai usar o nome da classe como nome da tabela
public class Game {
    //Atributos

    @Id //Essa anotation vai configurar o atributo id como a chave primária da tabela. Isso é importante para que o JPA saiba que esse atributo é a chave primária
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Essa anotation vai configurar o atributo id para que seja gerado automaticamente pelo banco de dados, usando a estratégia de auto incremento. O JPA vai gerar o valor do id automaticamente quando um novo registro for inserido.
    private Long id;
    private String title;

    @Column(name = "game_year") //Essa anotation vai configurar o nome da coluna no banco de dados, caso não seja configurada, o JPA vai usar o nome do atributo como nome da coluna
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    //Construtor
    public Game() {
    }
    public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
            String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
    
    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
    
    //HashCode e Equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    

    
}
