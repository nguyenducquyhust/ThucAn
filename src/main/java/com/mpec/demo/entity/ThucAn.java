package com.mpec.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="thucan")
@Data
public class ThucAn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "so_luong")
    private Integer soLuong;
}


