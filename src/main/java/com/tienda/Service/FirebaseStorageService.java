package com.tienda.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
        
@Service
public interface FirebaseStorageService {
    public String cargaImagen (MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    final String BucketName = "TIENDA-320a4.appspot.com";
    final String rutaSuperiorStorage = "TIENDA";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "TIENDA-320a4-firebase-adminsdk-3tbbg-71eaa24cdc";
}
