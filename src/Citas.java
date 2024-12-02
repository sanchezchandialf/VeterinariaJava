import java.util.Date;

public class Citas {
    public enum Estado {
        FINALIZADO, ACTIVO
    }
    public enum TipoConsulta {
        CONSULTA,
        OPERACION,
        RUTINA
    }

    private Cliente _cliente;
    private  Veterinario _veterinario;
    private Date fecha;
    private String descripcion;
    private Estado estado;
    private TipoConsulta tipoConsulta;
    private String observaciones;

    public Citas() {}
    public Citas(Cliente _cliente, Veterinario _veterinario, Date fecha, String descripcion, Estado estado, TipoConsulta tipoConsulta, String observaciones) {

        this._cliente = _cliente;
        this._veterinario = _veterinario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoConsulta = tipoConsulta;
        this.observaciones = observaciones;
    }

    public Cliente get_cliente() {
        return _cliente;
    }

    public void set_cliente(Cliente _cliente) {
        this._cliente = _cliente;
    }

    public Veterinario get_veterinario() {
        return _veterinario;
    }

    public void set_veterinario(Veterinario _veterinario) {
        this._veterinario = _veterinario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
