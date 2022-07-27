package com.introjavaspringboot.web.tugas.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TugasUserReq {
    private String namaUser;
    private String addressUser;
}
