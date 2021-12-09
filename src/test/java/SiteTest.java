import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiteTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Site site = new Site("Google", "google.com", new Template("Tipo A", "Escuro"));

        Site siteClone = site.clone();
        siteClone.setNome("Bing");
        siteClone.setUrl("bing.com");
        siteClone.getTemplate().setTema("Claro");

        assertEquals("Site{nome=Google, url=google.com, template=Template{modelo=Tipo A, tema=Escuro}}", site.toString());
        assertEquals("Site{nome=Bing, url=bing.com, template=Template{modelo=Tipo A, tema=Claro}}", siteClone.toString());
    }
}