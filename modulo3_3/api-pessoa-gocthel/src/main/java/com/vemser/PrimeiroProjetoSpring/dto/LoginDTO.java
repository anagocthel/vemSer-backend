package com.vemser.PrimeiroProjetoSpring.dto;


import com.vemser.PrimeiroProjetoSpring.entity.GrupoEntity;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
public class LoginDTO extends LoginCreateDTO{

    @NotNull
    @NotEmpty
    private Set<GrupoEntity> grupos;
}
