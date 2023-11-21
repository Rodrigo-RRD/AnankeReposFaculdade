package com.sabertech.ananke.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import java.nio.file.Path;
import java.util.stream.Stream;

public interface ArmazenamentoService {
    
    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resource loadAsResource(String filename);

    void deleteAll();
}
