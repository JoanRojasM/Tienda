/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.Service;

import com.tienda.domain.Producto;
import java.util.List;

/**
 *
 * @author Joan Rojas
 */
public interface ProductoService {
    public List<Producto> getProductos(boolean activos);
    public Producto getProductos(Producto producto);
    public void save (Producto producto);
    public void delete (Producto producto);
}
