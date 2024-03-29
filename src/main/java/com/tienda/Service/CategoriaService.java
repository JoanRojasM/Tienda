package com.tienda.Service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
    public Categoria getCategorias(Categoria categoria);
    public void save (Categoria categoria);
    public void delete (Categoria categoria);
    
}
