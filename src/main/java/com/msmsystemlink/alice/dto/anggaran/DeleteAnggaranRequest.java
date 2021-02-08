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
public class DeleteAnggaranRequest {
    private long id;

    public Long getId() {
        return id;
    }
}
