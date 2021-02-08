package com.msmsystemlink.alice.service;

import com.msmsystemlink.alice.model.Anggaran;

import java.util.List;

public interface AnggaranService {
    void createNewAnggaran(String id_anggaran, String id_opd, String jns_instansi, String kd_urusan, String kd_bidurusan, String kd_program, String kd_kegiatan, String kd_subkegiatan, String id_fungsi, String uraian, String hd_anggaran, String clevel, String hd, String id_rencana, Float nilai, Float nilai_ubah, Float realisasi, String tu_capai, String tk_capai);
    void deleteById (Long id) throws Exception;
    void updateById (String id_anggaran, String id_opd, String jns_instansi, String kd_urusan, String kd_bidurusan, String kd_program, String kd_kegiatan, String kd_subkegiatan, String id_fungsi, String uraian, String hd_anggaran, String clevel, String hd, String id_rencana, Float nilai, Float nilai_ubah, Float realisasi, String tu_capai, String tk_capai,Long id) throws Exception;
    List<Anggaran> findAll() throws Exception;
}
