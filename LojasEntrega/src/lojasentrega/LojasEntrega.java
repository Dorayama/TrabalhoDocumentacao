package lojasentrega;

/**
 * Importação das classes necessárias para conectar ao banco MySQL
 *
 * @author Lucas Favaro
 */
import java.sql.Connection;
import java.sql.DriverManager;
import lojasentrega.NewJFrame;

public class LojasEntrega {

    /**
     * Cria um Jframe da tela de login e o exibe.
     */
    public static void main(String[] args) {

        NewJFrame oi = new NewJFrame();
        oi.setVisible(true);
    }

    /**
     * Método conector que realiza a conexão com o banco.
     */
    public static Connection conector() {
        java.sql.Connection conexao = null;

        /**
         * Chama o driver JDBC, responsável pela conexão com o banco.
         */
        String driver = "com.mysql.jdbc.Driver";

        /**
         * armazenar dados do banco de dados.
         */
        String url = "jdbc:mysql://localhost:3306/meubanco";
        String user = "root";
        String password = "";

        /**
         * tenta estabelecer conexão com o banco.
         *
         */
        try {

            /**
             * Se ocorrer a conexão com o banco de dados executa o arquivo.
             * driver
             */
            Class.forName(driver);

            /**
             * Obtem a conexão atraves dos parametros
             *
             * @param url - Ulr
             * @param user - Nome de usuario
             * @param password - Senha do usuario
             */
            conexao = DriverManager.getConnection(url, user, password);

            /**
             * Caso a conexão seja bem sucedida retorna a conexão por não ser
             * void
             *
             * @return conexao
             */
            return conexao;

        } catch (Exception e) {
            /**
             * Se não ocorrer a conexão com o banco será retornado NULL
             *
             * @return null
             */
            return null;
        }

    }
}
