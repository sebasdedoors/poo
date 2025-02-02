package actividades.actividad3.productos;

public class Productos {
    private String nombre;
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    public Productos(String nombre,String descripcion, String codigo, String tipo, Double costo, Double impuesto){
        setNombre(nombre);
        setDescripcion(descripcion);
        setCodigo(codigo);
        setTipo(tipo);
        setCosto(costo);
        setImpuesto(impuesto);

    }
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        if(nombre.matches(".*\\d.*") && nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede contener números.");
        }else {
            this.nombre = nombre;
        } 
    }

    public String getDescripcion(){return descripcion;}

    public void setDescripcion(String descripcion){
        if(descripcion.isEmpty()){
            throw new IllegalArgumentException("Este espacio no puede quedarse en blanco. Escriba la descripción por favor.");
        }else {
            this.descripcion = descripcion;
        }
    }

    public String getCodigo(){return codigo;}

    public void setCodigo(String codigo){
        if(codigo.matches("\\d{10}")){
            throw new IllegalArgumentException("El codigo debe de ser de 10 digitos.");
        }else {
            this.codigo = codigo;
        }
    }

    public String getTipo(){return tipo;}

    public void setTipo(String tipo){
        if(tipo.isEmpty()){
            throw new IllegalArgumentException("Por favor ingrese un tipo.");
        }else{
            this.tipo = tipo;
        }
    }

    public Double getCosto(){return costo;}

    public void setCosto(Double costo){
        if(costo <= 0){
            throw new IllegalArgumentException("Ingrese un número mayor a cero.");
        }else{
            this.costo = costo;
        }
    }

    public Double getImpuesto(){return impuesto;}

    public void setImpuesto(Double impuesto){
        if(impuesto < 0){
            throw new IllegalArgumentException("El impuesto debe de ser mayor a 0.");
        }else{
            this.impuesto = impuesto;
        }
    }
}

