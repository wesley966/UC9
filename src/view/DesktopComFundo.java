
package view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class DesktopComFundo extends JDesktopPane{
    

    private Image imagem;

    public DesktopComFundo() {

        // Altere "fundo.jpg" para o caminho da sua imagem dentro do projeto.
        // O ideal é colocar a imagem na pasta src ou em um pacote de recursos.

        java.net.URL imgUrl = getClass().getResource("/Imagens/LogoCompleto.png");

        if (imgUrl != null) {
            this.imagem = new ImageIcon(imgUrl).getImage();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if (imagem != null) {

            // Desenha a imagem preenchendo todo o tamanho atual do componente.

            g.drawImage(
                imagem,
                0,
                0,
                getWidth(),
                getHeight(),
                this
            );
        }
    }
}

