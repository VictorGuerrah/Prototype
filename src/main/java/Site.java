public class Site  implements Cloneable{
    private String nome;
    private String url;
    private Template template;

    public Site(String nome, String url, Template template) {
        this.nome = nome;
        this.url = url;
        this.template = template;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    @Override
    public Site clone() throws CloneNotSupportedException {
        Site siteClone = (Site) super.clone();
        siteClone.template = (Template) siteClone.template.clone();
        return siteClone;
    }

    @Override
    public String toString() {
        return "Site{" +
                "nome=" + nome +
                ", url=" + url +
                ", template=" + template +
                '}';
    }
}
