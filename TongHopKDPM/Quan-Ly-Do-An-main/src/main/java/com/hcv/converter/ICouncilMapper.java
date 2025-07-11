package com.hcv.converter;

import com.hcv.dto.response.CouncilResponse;
import com.hcv.entity.Council;
import org.mapstruct.Mapper;

@Mapper
public interface ICouncilMapper {

    CouncilResponse toDTO(Council council);

}
