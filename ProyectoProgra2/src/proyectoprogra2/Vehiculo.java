/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  package proyectoprogra2;
/**
 *
 * @author Joshua
 */
public class Vehiculo {


    private String placa;
    private Cliente cliente;
    private String marca;
    private String modelo;
    private int anio;
    private String tipo;
    private int kilometraje;
    private String referencia;
    private String estado;

    public Vehiculo(String placa, Cliente cliente, String marca, String modelo,
                int anio, String tipo, int kilometraje,
                String referencia, String estado) {

    if (placa == null || placa.trim().isEmpty()) {
        throw new IllegalArgumentException("La placa es obligatoria");
    }

    if (cliente == null) {
        throw new IllegalArgumentException("El cliente es obligatorio");
    }

    if (marca == null || marca.trim().isEmpty()) {
        throw new IllegalArgumentException("La marca es obligatoria");
    }

    if (modelo == null || modelo.trim().isEmpty()) {
        throw new IllegalArgumentException("El modelo es obligatorio");
    }

    if (anio <= 0) {
        throw new IllegalArgumentException("El año no es válido");
    }

    if (tipo == null || tipo.trim().isEmpty()) {
        throw new IllegalArgumentException("El tipo es obligatorio");
    }

    if (kilometraje < 0) {
        throw new IllegalArgumentException("El kilometraje no puede ser negativo");
    }

    if (estado == null || estado.trim().isEmpty()) {
        throw new IllegalArgumentException("El estado es obligatorio");
    }

    this.placa = placa;
    this.cliente = cliente;
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.tipo = tipo;
    this.kilometraje = kilometraje;
    this.referencia = referencia;
    this.estado = estado;
}
  

public String getPlaca() {
    return placa;
}

public String getMarca() {
    return marca;
}

public String getModelo() {
    return modelo;
}

public int getAnio() {
    return anio;
}

public String getTipo() {
    return tipo;
}

public int getKilometraje() {
    return kilometraje;
}

public String getReferencia() {
    return referencia;
}

public String getEstado() {
    return estado;
}

  public Cliente getCliente() {
    return cliente;
}
  public void setPlaca(String placa) {
    if (placa == null || placa.trim().isEmpty()) {
        throw new IllegalArgumentException("La placa es obligatoria");
    }
    this.placa = placa;
}

public void setCliente(Cliente cliente) {
    if (cliente == null) {
        throw new IllegalArgumentException("El cliente es obligatorio");
    }
    this.cliente = cliente;
}

public void setMarca(String marca) {
    if (marca == null || marca.trim().isEmpty()) {
        throw new IllegalArgumentException("La marca es obligatoria");
    }
    this.marca = marca;
}

public void setModelo(String modelo) {
    if (modelo == null || modelo.trim().isEmpty()) {
        throw new IllegalArgumentException("El modelo es obligatorio");
    }
    this.modelo = modelo;
}

public void setAnio(int anio) {
    if (anio <= 0) {
        throw new IllegalArgumentException("El año no es válido");
    }
    this.anio = anio;
}

public void setTipo(String tipo) {
    if (tipo == null || tipo.trim().isEmpty()) {
        throw new IllegalArgumentException("El tipo es obligatorio");
    }
    this.tipo = tipo;
}

public void setKilometraje(int kilometraje) {
    if (kilometraje < 0) {
        throw new IllegalArgumentException("El kilometraje no puede ser negativo");
    }
    this.kilometraje = kilometraje;
}

public void setReferencia(String referencia) {
    this.referencia = referencia;
}

public void setEstado(String estado) {
    if (estado == null || estado.trim().isEmpty()) {
        throw new IllegalArgumentException("El estado es obligatorio");
    }
    this.estado = estado;
}

