package com.programmer.gate.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shoes {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "shoes_Sequence")
    @SequenceGenerator(name = "shoes_Sequence", sequenceName = "SHOES_SEQ")
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "size")
    private int size;

    @Column(name = "color")
    private String color;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "shoes")

    private List<Player> players;

    public Shoes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Player> getPlayers() {
        return players;
    }


}
