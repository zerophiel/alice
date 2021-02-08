package com.msmsystemlink.alice.dto.anggaran;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAnggaranRequest {
    private Long id;
    private String id_anggaran;
    private String id_opd;
    private String jns_instansi;
    private String kd_urusan;
    private String kd_bidurusan;
    private String kd_program;
    private String kd_kegiatan;
    private String kd_subkegiatan;
    private String id_fungsi;
    private String uraian;
    private String hd_anggaran;
    private String clevel;
    private String hd;
    private String id_rencana;
    private Float nilai;
    private Float nilai_ubah;
    private Float realisasi;
    private String tu_capai;
    private String tk_capai;

    public String getId_anggaran() {
        return id_anggaran;
    }

    public Float getNilai() {
        return nilai;
    }

    public String getId_opd() {
        return id_opd;
    }

    public Float getNilai_ubah() {
        return nilai_ubah;
    }

    public Float getRealisasi() {
        return realisasi;
    }

    public String getClevel() {
        return clevel;
    }

    public String getHd() {
        return hd;
    }

    public String getHd_anggaran() {
        return hd_anggaran;
    }

    public String getId_fungsi() {
        return id_fungsi;
    }

    public String getId_rencana() {
        return id_rencana;
    }

    public String getJns_instansi() {
        return jns_instansi;
    }

    public String getKd_bidurusan() {
        return kd_bidurusan;
    }

    public String getKd_urusan() {
        return kd_urusan;
    }

    public String getKd_kegiatan() {
        return kd_kegiatan;
    }

    public String getKd_program() {
        return kd_program;
    }

    public String getKd_subkegiatan() {
        return kd_subkegiatan;
    }

    public String getTk_capai() {
        return tk_capai;
    }

    public String getTu_capai() {
        return tu_capai;
    }

    public String getUraian() {
        return uraian;
    }

    public Long getId() {
        return id;
    }
}
