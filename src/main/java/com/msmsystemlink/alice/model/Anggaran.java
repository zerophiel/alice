package com.msmsystemlink.alice.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "master_anggaran")
@Entity
public class Anggaran implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_anggaran")
    private String id_anggaran;

    @Column(name = "id_opd")
    private String id_opd;

    @Column(name = "jns_instansi")
    private String jns_instansi;

    @Column(name = "kd_urusan")
    private String kd_urusan;

    @Column(name = "kd_bidurusan")
    private String kd_bidurusan;

    @Column(name = "kd_program")
    private String kd_program;

    @Column(name = "kd_kegiatan")
    private String kd_kegiatan;

    @Column(name = "kd_subkegiatan")
    private String kd_subkegiatan;

    @Column(name = "id_fungsi")
    private String id_fungsi;

    @Column(name = "uraian")
    private String uraian;

    @Column(name = "hd_anggaran")
    private String hd_anggaran;

    @Column(name = "clevel")
    private String clevel;

    @Column(name = "hd")
    private String hd;

    @Column(name= "id_rencana")
    private String id_rencana;

    @Column (name = "nilai")
    private Float nilai;

    @Column (name = "nilai_ubah")
    private Float nilai_ubah;

    @Column (name = "realisasi")
    private Float realisasi;

    @Column (name = "tu_capai")
    private String tu_capai;

    @Column (name = "tk_capai")
    private String tk_capai;
}
