package com.example.Library.service.interfaces;

import com.example.Library.dto.request.EditorialDto;
import com.example.Library.service.interfaces.generic.ICrudService;
import org.springframework.stereotype.Service;

public interface IEditorialService extends ICrudService<EditorialDto, Long> {

}
