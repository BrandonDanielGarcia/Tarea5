package mx.edu.tesoem.isc.tarea5;

public class Datos {
    String nombre;
    String correo;
    String telefono;
    String edad;
    String curp;
    String estado;

    public Datos(String nom, String cor, String tel, String ed, String cur, String est){
        nombre = nom;
        correo = cor;
        telefono = tel;
        edad = ed;
        curp = cur;
        estado = est;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
