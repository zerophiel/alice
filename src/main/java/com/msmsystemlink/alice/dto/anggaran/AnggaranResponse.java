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
public class AnggaranResponse {
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
}
