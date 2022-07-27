package com.introjavaspringboot.web.tugas.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TugasUser {
    private String namaUser;
    private String idUser;
    private String addressUser;
}
