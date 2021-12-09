public class Template implements Cloneable {
    private String modelo;
    private String tema;

    public Template(String modelo, String tema) {
        super();
        this.modelo = modelo;
        this.tema = tema;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Template{" +
                "modelo=" + modelo +
                ", tema=" + tema +
                '}';
    }
}

