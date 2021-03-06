/*
 * Copyright 2018 jhonatan.
 *
 * you may not use this file except in compliance with the Owner.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package taxis;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author jhonatan
 */
public class ServerConnection {
    /*
        Creacion de la clase conexion para usar una base de datos
        alojada en localhost/xampp
    */
    
    public static Connection getConnection(){
        Connection con = null;
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://85.10.205.173:3306/taxis_db","taxis_db","root1234");
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos.");
            return con;
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return con;
        }    
    }
}
