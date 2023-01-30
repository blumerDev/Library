package com.example.Library.service.interfaces;

import com.example.Library.dto.request.AuthorDto;
import com.example.Library.model.Author;
import com.example.Library.service.interfaces.generic.ICrudService;

public interface IAuthorService extends ICrudService<AuthorDto,Integer> {
}
