package com.msmsystemlink.alice.controller.anggaran;


import com.msmsystemlink.alice.constant.ErrorMessage;
import com.msmsystemlink.alice.dto.anggaran.DeleteAnggaranRequest;
import com.msmsystemlink.alice.dto.anggaran.UpdateAnggaranRequest;
import com.msmsystemlink.alice.dto.core.ListBaseResponse;
import com.msmsystemlink.alice.dto.core.Metadata;
import org.springframework.util.ObjectUtils;
import com.msmsystemlink.alice.dto.anggaran.CreateAnggaranRequest;
import com.msmsystemlink.alice.dto.core.BaseResponse;
import com.msmsystemlink.alice.service.AnggaranService;
import com.msmsystemlink.alice.util.Precondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = AnggaranControllerPath.BASE_PATH)
public class AnggaranController {
    @Autowired
    AnggaranService anggaranService;

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse createNewAnggaran(@RequestBody CreateAnggaranRequest request) throws Exception {
        Precondition.checkArgument(!ObjectUtils.isEmpty(request.getId_anggaran()), ErrorMessage.ERR_ITEM_NAME_MUST_NOT_BE_BLANK);
        Precondition.checkArgument(!ObjectUtils.isEmpty(request.getId_opd()), ErrorMessage.ERR_ITEM_NAME_MUST_NOT_BE_BLANK);
        Precondition.checkArgument(!ObjectUtils.isEmpty(request.getJns_instansi()), ErrorMessage.ERR_ITEM_NAME_MUST_NOT_BE_BLANK);
        this.anggaranService.createNewAnggaran(request.getId_anggaran(),request.getId_opd(),request.getJns_instansi(),request.getKd_urusan(),request.getKd_bidurusan(),request.getKd_program(),request.getKd_kegiatan(), request.getKd_subkegiatan(), request.getId_fungsi(), request.getUraian(), request.getHd_anggaran(), request.getClevel(), request.getHd(),request.getId_rencana(), request.getNilai(), request.getNilai_ubah(), request.getRealisasi(), request.getTu_capai(), request.getTk_capai());
        return new BaseResponse(null,null,true);
    }

    @RequestMapping(method = RequestMethod.DELETE,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse deleteAnggaran(@RequestParam Long id, @RequestBody DeleteAnggaranRequest request) throws Exception {
        Precondition.checkArgument(!ObjectUtils.isEmpty(id),ErrorMessage.ERR_DATA_NOT_FOUND);
        Precondition.checkArgument((request.getId().equals(id)),ErrorMessage.ERR_DATA_NOT_FOUND);
        this.anggaranService.deleteById(id);
        return new BaseResponse(null,null,true);
    }

    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse updateAnggaran (@RequestParam Long id, @RequestBody UpdateAnggaranRequest request) throws Exception {
        Precondition.checkArgument(!ObjectUtils.isEmpty(id),ErrorMessage.ERR_DATA_NOT_FOUND);
        Precondition.checkArgument((request.getId().equals(id)),ErrorMessage.ERR_DATA_NOT_FOUND);
        Precondition.checkArgument(!ObjectUtils.isEmpty(request.getId_anggaran()), ErrorMessage.ERR_ITEM_NAME_MUST_NOT_BE_BLANK);
        Precondition.checkArgument(!ObjectUtils.isEmpty(request.getId_opd()), ErrorMessage.ERR_ITEM_NAME_MUST_NOT_BE_BLANK);
        Precondition.checkArgument(!ObjectUtils.isEmpty(request.getJns_instansi()), ErrorMessage.ERR_ITEM_NAME_MUST_NOT_BE_BLANK);
        this.anggaranService.updateById(request.getId_anggaran(),request.getId_opd(),request.getJns_instansi(),request.getKd_urusan(),request.getKd_bidurusan(),request.getKd_program(),request.getKd_kegiatan(), request.getKd_subkegiatan(), request.getId_fungsi(), request.getUraian(), request.getHd_anggaran(), request.getClevel(), request.getHd(),request.getId_rencana(), request.getNilai(), request.getNilai_ubah(), request.getRealisasi(), request.getTu_capai(), request.getTk_capai(), request.getId());
        return new BaseResponse(null,null,true);
    }

    @RequestMapping(method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ListBaseResponse readAnggaran () throws Exception{
        return new ListBaseResponse(null,null,true,this.anggaranService.findAll(),new Metadata());
    }
}
